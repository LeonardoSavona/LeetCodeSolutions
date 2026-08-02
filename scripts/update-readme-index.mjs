/**
 * Regenerates the "Solved problems" index in README.md.
 *
 * The list of problems comes from the files git actually tracks, so work in
 * progress that is not committed yet never shows up. Titles and difficulties
 * come from LeetCode's public problem list, cached in scripts/leetcode-meta.json
 * so the script also runs offline.
 *
 * Usage:
 *   node scripts/update-readme-index.mjs            # update README.md
 *   node scripts/update-readme-index.mjs --check    # exit 1 if README is stale
 *   node scripts/update-readme-index.mjs --refresh  # refetch every cached entry
 *
 * No credentials needed: https://leetcode.com/api/problems/all/ is public.
 * Node >= 18 required (uses global fetch).
 */

import fs from 'fs';
import path from 'path';
import { execFileSync } from 'child_process';
import { fileURLToPath } from 'url';

const SCRIPT_DIR = path.dirname(fileURLToPath(import.meta.url));
const REPO_ROOT = path.join(SCRIPT_DIR, '..');
const README = path.join(REPO_ROOT, 'README.md');
const CACHE = path.join(SCRIPT_DIR, 'leetcode-meta.json');

const PROBLEMS_PATH = 'src/main/java/leonardo/savona/problems';
const TESTS_PATH = 'src/test/java/leonardo/savona/problems';
const LIST_URL = 'https://leetcode.com/api/problems/all/';

const CHECK = process.argv.includes('--check');
const REFRESH = process.argv.includes('--refresh');

const DIFFICULTY = { 1: 'Easy', 2: 'Medium', 3: 'Hard' };
const ORDER = ['Easy', 'Medium', 'Hard'];

// ─── Tracked problems ─────────────────────────────────────────────────────────

/** Problem numbers that have a committed solution, sorted ascending. */
function trackedProblems() {
  const files = execFileSync('git', ['ls-files', PROBLEMS_PATH], {
    cwd: REPO_ROOT,
    encoding: 'utf8',
  }).split('\n').filter(Boolean);

  const solved = new Set();
  const tested = new Set();

  for (const file of files) {
    const num = file.slice(PROBLEMS_PATH.length + 1).match(/^p(\d+)\//)?.[1];
    if (num) solved.add(num);
  }

  const testFiles = execFileSync('git', ['ls-files', TESTS_PATH], {
    cwd: REPO_ROOT,
    encoding: 'utf8',
  }).split('\n').filter(Boolean);

  for (const file of testFiles) {
    const num = file.slice(TESTS_PATH.length + 1).match(/^p(\d+)\//)?.[1];
    if (num) tested.add(num);
  }

  return {
    numbers: [...solved].sort((a, b) => a - b),
    tested,
  };
}

// ─── Problem metadata ─────────────────────────────────────────────────────────

function readCache() {
  if (REFRESH || !fs.existsSync(CACHE)) return {};
  return JSON.parse(fs.readFileSync(CACHE, 'utf8'));
}

function writeCache(cache) {
  const sorted = {};
  for (const num of Object.keys(cache).sort((a, b) => a - b)) sorted[num] = cache[num];
  fs.writeFileSync(CACHE, JSON.stringify(sorted, null, 2) + '\n', 'utf8');
}

/** Fills in every number missing from the cache with one call to LeetCode. */
async function resolveMetadata(numbers) {
  const cache = readCache();
  const missing = numbers.filter(n => !cache[n]);
  if (missing.length === 0) return cache;

  console.log(`Fetching metadata for ${missing.length} problem(s)...`);
  const res = await fetch(LIST_URL, { headers: { Accept: 'application/json' } });
  if (!res.ok) throw new Error(`${LIST_URL} returned HTTP ${res.status}`);
  const data = await res.json();

  const byNumber = {};
  for (const item of data.stat_status_pairs ?? []) {
    byNumber[String(item.stat?.frontend_question_id)] = {
      title: item.stat?.question__title,
      slug: item.stat?.question__title_slug,
      difficulty: DIFFICULTY[item.difficulty?.level],
    };
  }

  const unresolved = [];
  for (const num of missing) {
    const meta = byNumber[num];
    if (!meta?.title || !meta.slug || !meta.difficulty) unresolved.push(num);
    else cache[num] = meta;
  }

  if (unresolved.length > 0) {
    throw new Error(`Not found in LeetCode's problem list: ${unresolved.join(', ')}`);
  }

  writeCache(cache);
  return cache;
}

// ─── README rendering ─────────────────────────────────────────────────────────

function replaceBlock(md, name, body) {
  const start = `<!-- BEGIN:${name} -->`;
  const end = `<!-- END:${name} -->`;
  // Anchored to whole lines, so prose that merely mentions a marker is left alone.
  const pattern = new RegExp(`^${start}$[\\s\\S]*?^${end}$`, 'm');
  if (!pattern.test(md)) throw new Error(`Missing ${start} / ${end} markers in README.md`);
  return md.replace(pattern, `${start}\n${body}\n${end}`);
}

function render(numbers, tested, cache) {
  const counts = { Easy: 0, Medium: 0, Hard: 0 };
  for (const num of numbers) counts[cache[num].difficulty]++;

  const breakdown = ORDER.filter(d => counts[d] > 0).map(d => `${counts[d]} ${d}`);
  const untested = numbers.filter(n => !tested.has(n));
  const coverage = untested.length === 0
    ? 'every one covered by unit tests'
    : `**${numbers.length - untested.length}** covered by unit tests`;

  const stats = [
    `**${numbers.length}** problems solved, ${coverage} · Java 21`,
    '',
    `${breakdown.join(' · ')} — [full index below](#solved-problems).`,
  ].join('\n');

  const rows = numbers.map(num => {
    const { title, slug, difficulty } = cache[num];
    return `| ${num} | [${title}](https://leetcode.com/problems/${slug}/) | ${difficulty} | ` +
           `[\`p${num}\`](${PROBLEMS_PATH}/p${num}) |`;
  });

  const index = [
    `${numbers.length} problems — ${breakdown.join(', ')}.` +
      (untested.length === 0
        ? ' Every one has a JUnit test class.'
        : ` ${numbers.length - untested.length} have a JUnit test class.`),
    '',
    '<details>',
    '<summary>Show the full list</summary>',
    '',
    '| # | Problem | Difficulty | Solution |',
    '|---|---------|------------|----------|',
    ...rows,
    '',
    '</details>',
  ].join('\n');

  return { stats, index, untested };
}

// ─── Main ─────────────────────────────────────────────────────────────────────

const { numbers, tested } = trackedProblems();
if (numbers.length === 0) throw new Error(`No committed solutions found under ${PROBLEMS_PATH}`);

const cache = await resolveMetadata(numbers);
const { stats, index, untested } = render(numbers, tested, cache);

const before = fs.readFileSync(README, 'utf8');
const after = replaceBlock(replaceBlock(before, 'STATS', stats), 'INDEX', index);

if (untested.length > 0) {
  console.warn(`Warning: no test class for ${untested.map(n => 'p' + n).join(', ')}`);
}

if (CHECK) {
  if (before === after) {
    console.log(`README.md is up to date (${numbers.length} problems).`);
  } else {
    console.error('README.md is out of date. Run: node scripts/update-readme-index.mjs');
    process.exit(1);
  }
} else if (before === after) {
  console.log(`README.md already up to date (${numbers.length} problems).`);
} else {
  fs.writeFileSync(README, after, 'utf8');
  console.log(`README.md updated (${numbers.length} problems).`);
}

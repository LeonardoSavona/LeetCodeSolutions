/**
 * Regenerates the "Solved problems" index in README.md, with one column per
 * language (Java and Python).
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

/**
 * A problem counts as solved in a language when git tracks a path under
 * `problems` matching `solution`, and as tested when it also tracks a path
 * under `tests` matching `test`. Both patterns capture the problem number.
 * `entry` is the file or folder the index links to, relative to `problems`.
 */
const LANGUAGES = [
  {
    name: 'Java',
    version: 'Java 21',
    testFramework: 'JUnit',
    problems: 'java/src/main/java/leonardo/savona/problems',
    tests: 'java/src/test/java/leonardo/savona/problems',
    solution: /^p(\d+)\//,
    test: /^p(\d+)\//,
    entry: num => `p${num}`,
  },
  {
    name: 'Python',
    version: 'Python 3.10+',
    testFramework: 'pytest',
    problems: 'python/problems',
    tests: 'python/tests',
    solution: /^p(\d+)\.py$/,
    test: /^test_p(\d+)\.py$/,
    entry: num => `p${num}.py`,
  },
];

const LIST_URL = 'https://leetcode.com/api/problems/all/';

const CHECK = process.argv.includes('--check');
const REFRESH = process.argv.includes('--refresh');

const DIFFICULTY = { 1: 'Easy', 2: 'Medium', 3: 'Hard' };
const ORDER = ['Easy', 'Medium', 'Hard'];

// ─── Tracked problems ─────────────────────────────────────────────────────────

/** Problem numbers found in the paths git tracks under `dir`. */
function trackedNumbers(dir, pattern) {
  const files = execFileSync('git', ['ls-files', dir], {
    cwd: REPO_ROOT,
    encoding: 'utf8',
  }).split('\n').filter(Boolean);

  const found = new Set();
  for (const file of files) {
    const num = file.slice(dir.length + 1).match(pattern)?.[1];
    if (num) found.add(num);
  }
  return found;
}

/**
 * Every problem number solved in at least one language, sorted ascending,
 * plus each language's own solved and tested sets.
 */
function trackedProblems() {
  const languages = LANGUAGES.map(lang => ({
    ...lang,
    solved: trackedNumbers(lang.problems, lang.solution),
    tested: trackedNumbers(lang.tests, lang.test),
  }));

  const all = new Set(languages.flatMap(lang => [...lang.solved]));
  return {
    numbers: [...all].sort((a, b) => a - b),
    languages,
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

function render(numbers, languages, cache) {
  const counts = { Easy: 0, Medium: 0, Hard: 0 };
  for (const num of numbers) counts[cache[num].difficulty]++;

  const breakdown = ORDER.filter(d => counts[d] > 0).map(d => `${counts[d]} ${d}`);

  // Coverage is per solution: a problem solved in both languages needs both tests.
  const solutions = languages.reduce((sum, lang) => sum + lang.solved.size, 0);
  const untested = languages.flatMap(lang =>
    [...lang.solved].filter(n => !lang.tested.has(n)).map(n => `p${n} (${lang.name})`));
  const coverage = untested.length === 0
    ? 'every solution covered by unit tests'
    : `**${solutions - untested.length}** of ${solutions} solutions covered by unit tests`;

  const perLanguage = languages.map(lang => `${lang.solved.size} in ${lang.name}`).join(', ');
  const stats = [
    `**${numbers.length}** problems solved (${perLanguage}), ${coverage} · ` +
      languages.map(lang => lang.version).join(' · '),
    '',
    `${breakdown.join(' · ')} — [full index below](#solved-problems).`,
  ].join('\n');

  const rows = numbers.map(num => {
    const { title, slug, difficulty } = cache[num];
    const cells = languages.map(lang => {
      if (!lang.solved.has(num)) return '—';
      const entry = lang.entry(num);
      return `[\`${entry}\`](${lang.problems}/${entry})`;
    });
    return `| ${num} | [${title}](https://leetcode.com/problems/${slug}/) | ${difficulty} | ` +
           `${cells.join(' | ')} |`;
  });

  const frameworks = languages.map(lang => `${lang.testFramework} for ${lang.name}`).join(', ');
  const index = [
    `${numbers.length} problems — ${breakdown.join(', ')}.` +
      (untested.length === 0
        ? ` Every solution has a test (${frameworks}).`
        : ` ${solutions - untested.length} of ${solutions} solutions have a test (${frameworks}).`),
    '',
    '<details>',
    '<summary>Show the full list</summary>',
    '',
    `| # | Problem | Difficulty | ${languages.map(lang => lang.name).join(' | ')} |`,
    `|---|---------|------------|${languages.map(lang => '-'.repeat(lang.name.length + 2)).join('|')}|`,
    ...rows,
    '',
    '</details>',
  ].join('\n');

  return { stats, index, untested };
}

// ─── Main ─────────────────────────────────────────────────────────────────────

const { numbers, languages } = trackedProblems();
if (numbers.length === 0) {
  throw new Error(`No committed solutions found under ${LANGUAGES.map(l => l.problems).join(' or ')}`);
}

const cache = await resolveMetadata(numbers);
const { stats, index, untested } = render(numbers, languages, cache);

const before = fs.readFileSync(README, 'utf8');
const after = replaceBlock(replaceBlock(before, 'STATS', stats), 'INDEX', index);

if (untested.length > 0) {
  console.warn(`Warning: no test for ${untested.join(', ')}`);
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

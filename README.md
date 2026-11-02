# LeetCode Solutions

Solutions to [LeetCode](https://leetcode.com/) problems in Java and Python. The Java side is a Maven project with JUnit 5 tests and per-test runtime measurement; the Python side is tested with pytest.

<!-- BEGIN:STATS -->
**191** problems solved (174 in Java, 19 in Python), every solution covered by unit tests · Java 21 · Python 3.10+

146 Easy · 41 Medium · 4 Hard — [full index below](#solved-problems).
<!-- END:STATS -->

## Project structure

```
java/                               # Maven project
├── pom.xml
└── src/
    ├── main/java/leonardo/savona/
    │   ├── common/                 # Shared data structures
    │   │   ├── ListNode.java
    │   │   └── TreeNode.java
    │   └── problems/
    │       ├── p1/Solution.java    # 1. Two Sum
    │       ├── p2/Solution.java    # 2. Add Two Numbers
    │       └── p<N>/...            # One package per problem
    └── test/java/leonardo/savona/
        ├── base/
        │   ├── BaseTest.java       # Base class wiring the timing extension
        │   └── TimingExtension.java
        └── problems/p<N>/SolutionTest.java
python/
├── pyproject.toml                  # pytest configuration
├── requirements.txt
├── common/tree_node.py             # Shared TreeNode and build_tree helper
├── problems/p<N>.py                # One module per problem
└── tests/test_p<N>.py
scripts/                            # README index generator
```

A problem can be solved in one language or in both; the index below links every version.

### Java

Each problem lives in its own package named `p<problem number>`, so `p1448` holds problem 1448, and the file is always `Solution.java` — design problems keep the class name LeetCode requires, like `ParkingSystem` in `p1603`. The unit test sits in the matching package under `java/src/test`.

Every solution exposes the problem name as a constant:

```java
class Solution {
    public static final String TITLE = "199. Binary Tree Right Side View";
    ...
}
```

LeetCode redefines `ListNode` and `TreeNode` inside every linked-list and tree problem. The `leonardo.savona.common` package declares them once so solutions can import them instead of repeating the definition. The tree problems already use it; the linked-list ones still carry their own inline copy.

### Python

Each problem is a module named `p<problem number>.py` under `python/problems/`, holding the `Solution` class as submitted to LeetCode, with the problem name as the module docstring:

```python
"""543. Diameter of Binary Tree"""

from typing import Optional

from common.tree_node import TreeNode


class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        ...
```

The tests sit in `python/tests/test_p<N>.py`. `common/tree_node.py` plays the role of `leonardo.savona.common` in Java: it defines `TreeNode` once, plus `build_tree`, which turns LeetCode's level-order notation (`[1, 2, None, 3]`) into a tree for the tests.

## Requirements

- Java: JDK 21 or newer, Maven 3.9+
- Python: 3.10 or newer, with pytest (`pip install -r python/requirements.txt`)

## Running the tests

Java, from `java/`:

```bash
mvn test                                                   # all problems
mvn test -Dtest=leonardo.savona.problems.p1.SolutionTest   # single problem
```

Python, from `python/`:

```bash
pytest                          # all problems
pytest tests/test_p543.py       # single problem
```

## Timing output

Test classes extend `BaseTest`, which registers `TimingExtension`. It prints the duration of each test and the average per class:

```
  twoSum_typicalCase                                            0.412 ms
  twoSum_targetAtEnd                                            0.031 ms
  twoSum_duplicateValues                                        0.028 ms
  AVG [SolutionTest]: 0.157 ms (6 tests)
```

Useful for comparing alternative approaches to the same problem, but note these are JVM-warm-up-sensitive numbers, not a benchmark.

On the Python side, `pytest --durations=0` lists the time taken by every test.

## Opening the project in an IDE

The simplest setup is a single IntelliJ IDEA project with the Python plugin, opened on the repository root:

1. Open the root folder and load `java/pom.xml` as a Maven project (IntelliJ offers it on its own; otherwise right-click the file → *Add as Maven Project*).
2. Create a virtualenv in `python/.venv` and install `python/requirements.txt` into it.
3. In *File → Project Structure → Modules*, add a Python module on `python/` that uses that virtualenv, and mark `python/` as *Sources* and `python/tests` as *Tests*.

The alternative is two separate projects: `java/` in IntelliJ IDEA and `python/` in PyCharm. Both pick up the git repository in the parent folder. Do not open the same folder in both IDEs: they keep their settings in the same `.idea/` folder and overwrite each other's.

## Adding a solution

Java:

1. Create `java/src/main/java/leonardo/savona/problems/p<N>/Solution.java` with package `leonardo.savona.problems.p<N>`.
2. Add the `TITLE` constant.
3. Create `java/src/test/java/leonardo/savona/problems/p<N>/SolutionTest.java` extending `BaseTest`, covering the typical case plus edge cases.
4. Run `mvn test` from `java/`.

Python:

1. Create `python/problems/p<N>.py` with the title docstring and the `Solution` class.
2. Create `python/tests/test_p<N>.py`, covering the typical case plus edge cases.
3. Run `pytest` from `python/`.

Then commit and run `node scripts/update-readme-index.mjs` to add the problem to the index below.

## Updating the index

The "Solved problems" section is generated — do not edit it by hand. Everything between the
`<!-- BEGIN:INDEX -->` and `<!-- END:INDEX -->` markers (and the counters at the top of this
file) is rewritten by:

```bash
node scripts/update-readme-index.mjs            # update README.md
node scripts/update-readme-index.mjs --check    # exit 1 if the index is stale
node scripts/update-readme-index.mjs --refresh  # refetch every cached title
```

The problem list comes from `git ls-files`, so a solution shows up only once it is committed —
work in progress never leaks into the README. Titles and difficulties come from LeetCode's public
problem list, `https://leetcode.com/api/problems/all/`, which needs no login. Whatever it returns
is cached in [`scripts/leetcode-meta.json`](scripts/leetcode-meta.json), so the script only calls
the network when it meets a problem number it has never seen, and works offline otherwise.

Requires Node 18 or newer (for global `fetch`); no npm dependencies.

## Stack

| | Java | Python |
|---|---|---|
| Language | Java 21 | Python 3.10+ |
| Build | Maven | — |
| Tests | JUnit 5 (Jupiter 5.10.2) | pytest 8+ |
| Runner | Maven Surefire 3.2.5 | pytest |

## Solved problems

<!-- BEGIN:INDEX -->
191 problems — 146 Easy, 41 Medium, 4 Hard. Every solution has a test (JUnit for Java, pytest for Python).

<details>
<summary>Show the full list</summary>

| # | Problem | Difficulty | Java | Python |
|---|---------|------------|------|--------|
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Easy | [`p1`](java/src/main/java/leonardo/savona/problems/p1) | — |
| 2 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | Medium | [`p2`](java/src/main/java/leonardo/savona/problems/p2) | — |
| 3 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Medium | [`p3`](java/src/main/java/leonardo/savona/problems/p3) | — |
| 7 | [Reverse Integer](https://leetcode.com/problems/reverse-integer/) | Medium | [`p7`](java/src/main/java/leonardo/savona/problems/p7) | — |
| 8 | [String to Integer (atoi)](https://leetcode.com/problems/string-to-integer-atoi/) | Medium | [`p8`](java/src/main/java/leonardo/savona/problems/p8) | — |
| 9 | [Palindrome Number](https://leetcode.com/problems/palindrome-number/) | Easy | [`p9`](java/src/main/java/leonardo/savona/problems/p9) | — |
| 12 | [Integer to Roman](https://leetcode.com/problems/integer-to-roman/) | Medium | [`p12`](java/src/main/java/leonardo/savona/problems/p12) | — |
| 13 | [Roman to Integer](https://leetcode.com/problems/roman-to-integer/) | Easy | [`p13`](java/src/main/java/leonardo/savona/problems/p13) | — |
| 14 | [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/) | Easy | [`p14`](java/src/main/java/leonardo/savona/problems/p14) | — |
| 17 | [Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/) | Medium | — | [`p17.py`](python/problems/p17.py) |
| 19 | [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | Medium | [`p19`](java/src/main/java/leonardo/savona/problems/p19) | — |
| 20 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | Easy | [`p20`](java/src/main/java/leonardo/savona/problems/p20) | — |
| 21 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | Easy | [`p21`](java/src/main/java/leonardo/savona/problems/p21) | — |
| 22 | [Generate Parentheses](https://leetcode.com/problems/generate-parentheses/) | Medium | — | [`p22.py`](python/problems/p22.py) |
| 26 | [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | Easy | [`p26`](java/src/main/java/leonardo/savona/problems/p26) | — |
| 27 | [Remove Element](https://leetcode.com/problems/remove-element/) | Easy | [`p27`](java/src/main/java/leonardo/savona/problems/p27) | — |
| 28 | [Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/) | Easy | [`p28`](java/src/main/java/leonardo/savona/problems/p28) | — |
| 35 | [Search Insert Position](https://leetcode.com/problems/search-insert-position/) | Easy | [`p35`](java/src/main/java/leonardo/savona/problems/p35) | — |
| 36 | [Valid Sudoku](https://leetcode.com/problems/valid-sudoku/) | Medium | [`p36`](java/src/main/java/leonardo/savona/problems/p36) | — |
| 37 | [Sudoku Solver](https://leetcode.com/problems/sudoku-solver/) | Hard | — | [`p37.py`](python/problems/p37.py) |
| 48 | [Rotate Image](https://leetcode.com/problems/rotate-image/) | Medium | [`p48`](java/src/main/java/leonardo/savona/problems/p48) | — |
| 49 | [Group Anagrams](https://leetcode.com/problems/group-anagrams/) | Medium | [`p49`](java/src/main/java/leonardo/savona/problems/p49) | — |
| 50 | [Pow(x, n)](https://leetcode.com/problems/powx-n/) | Medium | [`p50`](java/src/main/java/leonardo/savona/problems/p50) | — |
| 58 | [Length of Last Word](https://leetcode.com/problems/length-of-last-word/) | Easy | [`p58`](java/src/main/java/leonardo/savona/problems/p58) | — |
| 66 | [Plus One](https://leetcode.com/problems/plus-one/) | Easy | [`p66`](java/src/main/java/leonardo/savona/problems/p66) | — |
| 67 | [Add Binary](https://leetcode.com/problems/add-binary/) | Easy | [`p67`](java/src/main/java/leonardo/savona/problems/p67) | — |
| 74 | [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/) | Medium | [`p74`](java/src/main/java/leonardo/savona/problems/p74) | — |
| 77 | [Combinations](https://leetcode.com/problems/combinations/) | Medium | — | [`p77.py`](python/problems/p77.py) |
| 78 | [Subsets](https://leetcode.com/problems/subsets/) | Medium | [`p78`](java/src/main/java/leonardo/savona/problems/p78) | [`p78.py`](python/problems/p78.py) |
| 80 | [Remove Duplicates from Sorted Array II](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/) | Medium | [`p80`](java/src/main/java/leonardo/savona/problems/p80) | — |
| 83 | [Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/) | Easy | [`p83`](java/src/main/java/leonardo/savona/problems/p83) | — |
| 88 | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) | Easy | [`p88`](java/src/main/java/leonardo/savona/problems/p88) | — |
| 94 | [Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/) | Easy | [`p94`](java/src/main/java/leonardo/savona/problems/p94) | — |
| 100 | [Same Tree](https://leetcode.com/problems/same-tree/) | Easy | [`p100`](java/src/main/java/leonardo/savona/problems/p100) | — |
| 104 | [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | Easy | [`p104`](java/src/main/java/leonardo/savona/problems/p104) | — |
| 110 | [Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/) | Easy | [`p110`](java/src/main/java/leonardo/savona/problems/p110) | — |
| 118 | [Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/) | Easy | [`p118`](java/src/main/java/leonardo/savona/problems/p118) | — |
| 119 | [Pascal's Triangle II](https://leetcode.com/problems/pascals-triangle-ii/) | Easy | [`p119`](java/src/main/java/leonardo/savona/problems/p119) | — |
| 125 | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | Easy | [`p125`](java/src/main/java/leonardo/savona/problems/p125) | — |
| 136 | [Single Number](https://leetcode.com/problems/single-number/) | Easy | [`p136`](java/src/main/java/leonardo/savona/problems/p136) | — |
| 141 | [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) | Easy | [`p141`](java/src/main/java/leonardo/savona/problems/p141) | — |
| 144 | [Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/) | Easy | [`p144`](java/src/main/java/leonardo/savona/problems/p144) | — |
| 145 | [Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/) | Easy | [`p145`](java/src/main/java/leonardo/savona/problems/p145) | — |
| 190 | [Reverse Bits](https://leetcode.com/problems/reverse-bits/) | Easy | [`p190`](java/src/main/java/leonardo/savona/problems/p190) | — |
| 191 | [Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/) | Easy | [`p191`](java/src/main/java/leonardo/savona/problems/p191) | — |
| 199 | [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/) | Medium | [`p199`](java/src/main/java/leonardo/savona/problems/p199) | — |
| 206 | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) | Easy | [`p206`](java/src/main/java/leonardo/savona/problems/p206) | — |
| 226 | [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/) | Easy | [`p226`](java/src/main/java/leonardo/savona/problems/p226) | — |
| 242 | [Valid Anagram](https://leetcode.com/problems/valid-anagram/) | Easy | [`p242`](java/src/main/java/leonardo/savona/problems/p242) | — |
| 257 | [Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths/) | Easy | [`p257`](java/src/main/java/leonardo/savona/problems/p257) | [`p257.py`](python/problems/p257.py) |
| 260 | [Single Number III](https://leetcode.com/problems/single-number-iii/) | Medium | [`p260`](java/src/main/java/leonardo/savona/problems/p260) | — |
| 268 | [Missing Number](https://leetcode.com/problems/missing-number/) | Easy | [`p268`](java/src/main/java/leonardo/savona/problems/p268) | — |
| 328 | [Odd Even Linked List](https://leetcode.com/problems/odd-even-linked-list/) | Medium | [`p328`](java/src/main/java/leonardo/savona/problems/p328) | — |
| 338 | [Counting Bits](https://leetcode.com/problems/counting-bits/) | Easy | [`p338`](java/src/main/java/leonardo/savona/problems/p338) | — |
| 349 | [Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/) | Easy | [`p349`](java/src/main/java/leonardo/savona/problems/p349) | — |
| 392 | [Is Subsequence](https://leetcode.com/problems/is-subsequence/) | Easy | [`p392`](java/src/main/java/leonardo/savona/problems/p392) | — |
| 401 | [Binary Watch](https://leetcode.com/problems/binary-watch/) | Easy | — | [`p401.py`](python/problems/p401.py) |
| 412 | [Fizz Buzz](https://leetcode.com/problems/fizz-buzz/) | Easy | [`p412`](java/src/main/java/leonardo/savona/problems/p412) | — |
| 509 | [Fibonacci Number](https://leetcode.com/problems/fibonacci-number/) | Easy | [`p509`](java/src/main/java/leonardo/savona/problems/p509) | — |
| 535 | [Encode and Decode TinyURL](https://leetcode.com/problems/encode-and-decode-tinyurl/) | Medium | [`p535`](java/src/main/java/leonardo/savona/problems/p535) | — |
| 543 | [Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/) | Easy | — | [`p543.py`](python/problems/p543.py) |
| 657 | [Robot Return to Origin](https://leetcode.com/problems/robot-return-to-origin/) | Easy | — | [`p657.py`](python/problems/p657.py) |
| 693 | [Binary Number with Alternating Bits](https://leetcode.com/problems/binary-number-with-alternating-bits/) | Easy | [`p693`](java/src/main/java/leonardo/savona/problems/p693) | — |
| 700 | [Search in a Binary Search Tree](https://leetcode.com/problems/search-in-a-binary-search-tree/) | Easy | [`p700`](java/src/main/java/leonardo/savona/problems/p700) | — |
| 709 | [To Lower Case](https://leetcode.com/problems/to-lower-case/) | Easy | [`p709`](java/src/main/java/leonardo/savona/problems/p709) | — |
| 728 | [Self Dividing Numbers](https://leetcode.com/problems/self-dividing-numbers/) | Easy | [`p728`](java/src/main/java/leonardo/savona/problems/p728) | — |
| 756 | [Pyramid Transition Matrix](https://leetcode.com/problems/pyramid-transition-matrix/) | Medium | [`p756`](java/src/main/java/leonardo/savona/problems/p756) | — |
| 771 | [Jewels and Stones](https://leetcode.com/problems/jewels-and-stones/) | Easy | [`p771`](java/src/main/java/leonardo/savona/problems/p771) | — |
| 797 | [All Paths From Source to Target](https://leetcode.com/problems/all-paths-from-source-to-target/) | Medium | — | [`p797.py`](python/problems/p797.py) |
| 852 | [Peak Index in a Mountain Array](https://leetcode.com/problems/peak-index-in-a-mountain-array/) | Medium | [`p852`](java/src/main/java/leonardo/savona/problems/p852) | — |
| 897 | [Increasing Order Search Tree](https://leetcode.com/problems/increasing-order-search-tree/) | Easy | [`p897`](java/src/main/java/leonardo/savona/problems/p897) | — |
| 938 | [Range Sum of BST](https://leetcode.com/problems/range-sum-of-bst/) | Easy | [`p938`](java/src/main/java/leonardo/savona/problems/p938) | — |
| 944 | [Delete Columns to Make Sorted](https://leetcode.com/problems/delete-columns-to-make-sorted/) | Easy | [`p944`](java/src/main/java/leonardo/savona/problems/p944) | — |
| 961 | [N-Repeated Element in Size 2N Array](https://leetcode.com/problems/n-repeated-element-in-size-2n-array/) | Easy | [`p961`](java/src/main/java/leonardo/savona/problems/p961) | — |
| 965 | [Univalued Binary Tree](https://leetcode.com/problems/univalued-binary-tree/) | Easy | [`p965`](java/src/main/java/leonardo/savona/problems/p965) | — |
| 977 | [Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/) | Easy | [`p977`](java/src/main/java/leonardo/savona/problems/p977) | — |
| 980 | [Unique Paths III](https://leetcode.com/problems/unique-paths-iii/) | Hard | [`p980`](java/src/main/java/leonardo/savona/problems/p980) | — |
| 997 | [Find the Town Judge](https://leetcode.com/problems/find-the-town-judge/) | Easy | — | [`p997.py`](python/problems/p997.py) |
| 999 | [Available Captures for Rook](https://leetcode.com/problems/available-captures-for-rook/) | Easy | — | [`p999.py`](python/problems/p999.py) |
| 1021 | [Remove Outermost Parentheses](https://leetcode.com/problems/remove-outermost-parentheses/) | Easy | [`p1021`](java/src/main/java/leonardo/savona/problems/p1021) | — |
| 1108 | [Defanging an IP Address](https://leetcode.com/problems/defanging-an-ip-address/) | Easy | [`p1108`](java/src/main/java/leonardo/savona/problems/p1108) | — |
| 1161 | [Maximum Level Sum of a Binary Tree](https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/) | Medium | [`p1161`](java/src/main/java/leonardo/savona/problems/p1161) | — |
| 1189 | [Maximum Number of Balloons](https://leetcode.com/problems/maximum-number-of-balloons/) | Easy | — | [`p1189.py`](python/problems/p1189.py) |
| 1221 | [Split a String in Balanced Strings](https://leetcode.com/problems/split-a-string-in-balanced-strings/) | Easy | [`p1221`](java/src/main/java/leonardo/savona/problems/p1221) | — |
| 1281 | [Subtract the Product and Sum of Digits of an Integer](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/) | Easy | [`p1281`](java/src/main/java/leonardo/savona/problems/p1281) | — |
| 1290 | [Convert Binary Number in a Linked List to Integer](https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/) | Easy | [`p1290`](java/src/main/java/leonardo/savona/problems/p1290) | — |
| 1313 | [Decompress Run-Length Encoded List](https://leetcode.com/problems/decompress-run-length-encoded-list/) | Easy | [`p1313`](java/src/main/java/leonardo/savona/problems/p1313) | — |
| 1342 | [Number of Steps to Reduce a Number to Zero](https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/) | Easy | [`p1342`](java/src/main/java/leonardo/savona/problems/p1342) | — |
| 1365 | [How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/) | Easy | [`p1365`](java/src/main/java/leonardo/savona/problems/p1365) | — |
| 1379 | [Find a Corresponding Node of a Binary Tree in a Clone of That Tree](https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/) | Easy | [`p1379`](java/src/main/java/leonardo/savona/problems/p1379) | — |
| 1431 | [Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/) | Easy | [`p1431`](java/src/main/java/leonardo/savona/problems/p1431) | — |
| 1436 | [Destination City](https://leetcode.com/problems/destination-city/) | Easy | — | [`p1436.py`](python/problems/p1436.py) |
| 1448 | [Count Good Nodes in Binary Tree](https://leetcode.com/problems/count-good-nodes-in-binary-tree/) | Medium | [`p1448`](java/src/main/java/leonardo/savona/problems/p1448) | — |
| 1470 | [Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/) | Easy | [`p1470`](java/src/main/java/leonardo/savona/problems/p1470) | — |
| 1480 | [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/) | Easy | [`p1480`](java/src/main/java/leonardo/savona/problems/p1480) | — |
| 1486 | [XOR Operation in an Array](https://leetcode.com/problems/xor-operation-in-an-array/) | Easy | [`p1486`](java/src/main/java/leonardo/savona/problems/p1486) | — |
| 1512 | [Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/) | Easy | [`p1512`](java/src/main/java/leonardo/savona/problems/p1512) | — |
| 1528 | [Shuffle String](https://leetcode.com/problems/shuffle-string/) | Easy | [`p1528`](java/src/main/java/leonardo/savona/problems/p1528) | — |
| 1550 | [Three Consecutive Odds](https://leetcode.com/problems/three-consecutive-odds/) | Easy | — | [`p1550.py`](python/problems/p1550.py) |
| 1572 | [Matrix Diagonal Sum](https://leetcode.com/problems/matrix-diagonal-sum/) | Easy | [`p1572`](java/src/main/java/leonardo/savona/problems/p1572) | — |
| 1603 | [Design Parking System](https://leetcode.com/problems/design-parking-system/) | Easy | [`p1603`](java/src/main/java/leonardo/savona/problems/p1603) | — |
| 1662 | [Check If Two String Arrays are Equivalent](https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/) | Easy | [`p1662`](java/src/main/java/leonardo/savona/problems/p1662) | — |
| 1672 | [Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/) | Easy | [`p1672`](java/src/main/java/leonardo/savona/problems/p1672) | — |
| 1678 | [Goal Parser Interpretation](https://leetcode.com/problems/goal-parser-interpretation/) | Easy | [`p1678`](java/src/main/java/leonardo/savona/problems/p1678) | — |
| 1684 | [Count the Number of Consistent Strings](https://leetcode.com/problems/count-the-number-of-consistent-strings/) | Easy | [`p1684`](java/src/main/java/leonardo/savona/problems/p1684) | — |
| 1688 | [Count of Matches in Tournament](https://leetcode.com/problems/count-of-matches-in-tournament/) | Easy | [`p1688`](java/src/main/java/leonardo/savona/problems/p1688) | — |
| 1689 | [Partitioning Into Minimum Number Of Deci-Binary Numbers](https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/) | Medium | [`p1689`](java/src/main/java/leonardo/savona/problems/p1689) | — |
| 1720 | [Decode XORed Array](https://leetcode.com/problems/decode-xored-array/) | Easy | [`p1720`](java/src/main/java/leonardo/savona/problems/p1720) | — |
| 1748 | [Sum of Unique Elements](https://leetcode.com/problems/sum-of-unique-elements/) | Easy | — | [`p1748.py`](python/problems/p1748.py) |
| 1769 | [Minimum Number of Operations to Move All Balls to Each Box](https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/) | Medium | [`p1769`](java/src/main/java/leonardo/savona/problems/p1769) | — |
| 1773 | [Count Items Matching a Rule](https://leetcode.com/problems/count-items-matching-a-rule/) | Easy | [`p1773`](java/src/main/java/leonardo/savona/problems/p1773) | — |
| 1791 | [Find Center of Star Graph](https://leetcode.com/problems/find-center-of-star-graph/) | Easy | [`p1791`](java/src/main/java/leonardo/savona/problems/p1791) | — |
| 1816 | [Truncate Sentence](https://leetcode.com/problems/truncate-sentence/) | Easy | [`p1816`](java/src/main/java/leonardo/savona/problems/p1816) | — |
| 1859 | [Sorting the Sentence](https://leetcode.com/problems/sorting-the-sentence/) | Easy | [`p1859`](java/src/main/java/leonardo/savona/problems/p1859) | — |
| 1863 | [Sum of All Subset XOR Totals](https://leetcode.com/problems/sum-of-all-subset-xor-totals/) | Easy | [`p1863`](java/src/main/java/leonardo/savona/problems/p1863) | — |
| 1903 | [Largest Odd Number in String](https://leetcode.com/problems/largest-odd-number-in-string/) | Easy | — | [`p1903.py`](python/problems/p1903.py) |
| 1920 | [Build Array from Permutation](https://leetcode.com/problems/build-array-from-permutation/) | Easy | [`p1920`](java/src/main/java/leonardo/savona/problems/p1920) | — |
| 1929 | [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/) | Easy | [`p1929`](java/src/main/java/leonardo/savona/problems/p1929) | — |
| 1935 | [Maximum Number of Words You Can Type](https://leetcode.com/problems/maximum-number-of-words-you-can-type/) | Easy | [`p1935`](java/src/main/java/leonardo/savona/problems/p1935) | — |
| 1971 | [Find if Path Exists in Graph](https://leetcode.com/problems/find-if-path-exists-in-graph/) | Easy | — | [`p1971.py`](python/problems/p1971.py) |
| 1979 | [Find Greatest Common Divisor of Array](https://leetcode.com/problems/find-greatest-common-divisor-of-array/) | Easy | [`p1979`](java/src/main/java/leonardo/savona/problems/p1979) | — |
| 2000 | [Reverse Prefix of Word](https://leetcode.com/problems/reverse-prefix-of-word/) | Easy | [`p2000`](java/src/main/java/leonardo/savona/problems/p2000) | — |
| 2011 | [Final Value of Variable After Performing Operations](https://leetcode.com/problems/final-value-of-variable-after-performing-operations/) | Easy | [`p2011`](java/src/main/java/leonardo/savona/problems/p2011) | — |
| 2037 | [Minimum Number of Moves to Seat Everyone](https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/) | Easy | [`p2037`](java/src/main/java/leonardo/savona/problems/p2037) | — |
| 2048 | [Next Greater Numerically Balanced Number](https://leetcode.com/problems/next-greater-numerically-balanced-number/) | Medium | [`p2048`](java/src/main/java/leonardo/savona/problems/p2048) | — |
| 2114 | [Maximum Number of Words Found in Sentences](https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/) | Easy | [`p2114`](java/src/main/java/leonardo/savona/problems/p2114) | — |
| 2161 | [Partition Array According to Given Pivot](https://leetcode.com/problems/partition-array-according-to-given-pivot/) | Medium | [`p2161`](java/src/main/java/leonardo/savona/problems/p2161) | — |
| 2181 | [Merge Nodes in Between Zeros](https://leetcode.com/problems/merge-nodes-in-between-zeros/) | Medium | [`p2181`](java/src/main/java/leonardo/savona/problems/p2181) | — |
| 2220 | [Minimum Bit Flips to Convert Number](https://leetcode.com/problems/minimum-bit-flips-to-convert-number/) | Easy | [`p2220`](java/src/main/java/leonardo/savona/problems/p2220) | — |
| 2221 | [Find Triangular Sum of an Array](https://leetcode.com/problems/find-triangular-sum-of-an-array/) | Medium | [`p2221`](java/src/main/java/leonardo/savona/problems/p2221) | — |
| 2235 | [Add Two Integers](https://leetcode.com/problems/add-two-integers/) | Easy | [`p2235`](java/src/main/java/leonardo/savona/problems/p2235) | — |
| 2236 | [Root Equals Sum of Children](https://leetcode.com/problems/root-equals-sum-of-children/) | Easy | [`p2236`](java/src/main/java/leonardo/savona/problems/p2236) | — |
| 2325 | [Decode the Message](https://leetcode.com/problems/decode-the-message/) | Easy | [`p2325`](java/src/main/java/leonardo/savona/problems/p2325) | — |
| 2331 | [Evaluate Boolean Binary Tree](https://leetcode.com/problems/evaluate-boolean-binary-tree/) | Easy | [`p2331`](java/src/main/java/leonardo/savona/problems/p2331) | — |
| 2396 | [Strictly Palindromic Number](https://leetcode.com/problems/strictly-palindromic-number/) | Medium | [`p2396`](java/src/main/java/leonardo/savona/problems/p2396) | — |
| 2413 | [Smallest Even Multiple](https://leetcode.com/problems/smallest-even-multiple/) | Easy | [`p2413`](java/src/main/java/leonardo/savona/problems/p2413) | — |
| 2418 | [Sort the People](https://leetcode.com/problems/sort-the-people/) | Easy | [`p2418`](java/src/main/java/leonardo/savona/problems/p2418) | — |
| 2423 | [Remove Letter To Equalize Frequency](https://leetcode.com/problems/remove-letter-to-equalize-frequency/) | Easy | [`p2423`](java/src/main/java/leonardo/savona/problems/p2423) | — |
| 2433 | [Find The Original Array of Prefix Xor](https://leetcode.com/problems/find-the-original-array-of-prefix-xor/) | Medium | [`p2433`](java/src/main/java/leonardo/savona/problems/p2433) | — |
| 2469 | [Convert the Temperature](https://leetcode.com/problems/convert-the-temperature/) | Easy | [`p2469`](java/src/main/java/leonardo/savona/problems/p2469) | — |
| 2482 | [Difference Between Ones and Zeros in Row and Column](https://leetcode.com/problems/difference-between-ones-and-zeros-in-row-and-column/) | Medium | [`p2482`](java/src/main/java/leonardo/savona/problems/p2482) | — |
| 2520 | [Count the Digits That Divide a Number](https://leetcode.com/problems/count-the-digits-that-divide-a-number/) | Easy | [`p2520`](java/src/main/java/leonardo/savona/problems/p2520) | — |
| 2574 | [Left and Right Sum Differences](https://leetcode.com/problems/left-and-right-sum-differences/) | Easy | [`p2574`](java/src/main/java/leonardo/savona/problems/p2574) | — |
| 2610 | [Convert an Array Into a 2D Array With Conditions](https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/) | Medium | [`p2610`](java/src/main/java/leonardo/savona/problems/p2610) | — |
| 2652 | [Sum Multiples](https://leetcode.com/problems/sum-multiples/) | Easy | [`p2652`](java/src/main/java/leonardo/savona/problems/p2652) | — |
| 2657 | [Find the Prefix Common Array of Two Arrays](https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/) | Medium | [`p2657`](java/src/main/java/leonardo/savona/problems/p2657) | — |
| 2716 | [Minimize String Length](https://leetcode.com/problems/minimize-string-length/) | Easy | [`p2716`](java/src/main/java/leonardo/savona/problems/p2716) | — |
| 2769 | [Find the Maximum Achievable Number](https://leetcode.com/problems/find-the-maximum-achievable-number/) | Easy | [`p2769`](java/src/main/java/leonardo/savona/problems/p2769) | — |
| 2798 | [Number of Employees Who Met the Target](https://leetcode.com/problems/number-of-employees-who-met-the-target/) | Easy | [`p2798`](java/src/main/java/leonardo/savona/problems/p2798) | — |
| 2807 | [Insert Greatest Common Divisors in Linked List](https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/) | Medium | [`p2807`](java/src/main/java/leonardo/savona/problems/p2807) | — |
| 2824 | [Count Pairs Whose Sum is Less than Target](https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/) | Easy | [`p2824`](java/src/main/java/leonardo/savona/problems/p2824) | — |
| 2828 | [Check if a String Is an Acronym of Words](https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/) | Easy | [`p2828`](java/src/main/java/leonardo/savona/problems/p2828) | — |
| 2894 | [Divisible and Non-divisible Sums Difference](https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/) | Easy | [`p2894`](java/src/main/java/leonardo/savona/problems/p2894) | — |
| 2942 | [Find Words Containing Character](https://leetcode.com/problems/find-words-containing-character/) | Easy | [`p2942`](java/src/main/java/leonardo/savona/problems/p2942) | — |
| 2974 | [Minimum Number Game](https://leetcode.com/problems/minimum-number-game/) | Easy | [`p2974`](java/src/main/java/leonardo/savona/problems/p2974) | — |
| 3065 | [Minimum Operations to Exceed Threshold Value I](https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i/) | Easy | [`p3065`](java/src/main/java/leonardo/savona/problems/p3065) | — |
| 3099 | [Harshad Number](https://leetcode.com/problems/harshad-number/) | Easy | [`p3099`](java/src/main/java/leonardo/savona/problems/p3099) | — |
| 3146 | [Permutation Difference between Two Strings](https://leetcode.com/problems/permutation-difference-between-two-strings/) | Easy | [`p3146`](java/src/main/java/leonardo/savona/problems/p3146) | — |
| 3174 | [Clear Digits](https://leetcode.com/problems/clear-digits/) | Easy | [`p3174`](java/src/main/java/leonardo/savona/problems/p3174) | — |
| 3190 | [Find Minimum Operations to Make All Elements Divisible by Three](https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/) | Easy | [`p3190`](java/src/main/java/leonardo/savona/problems/p3190) | — |
| 3211 | [Generate Binary Strings Without Adjacent Zeros](https://leetcode.com/problems/generate-binary-strings-without-adjacent-zeros/) | Medium | — | [`p3211.py`](python/problems/p3211.py) |
| 3226 | [Number of Bit Changes to Make Two Integers Equal](https://leetcode.com/problems/number-of-bit-changes-to-make-two-integers-equal/) | Easy | [`p3226`](java/src/main/java/leonardo/savona/problems/p3226) | — |
| 3280 | [Convert Date to Binary](https://leetcode.com/problems/convert-date-to-binary/) | Easy | [`p3280`](java/src/main/java/leonardo/savona/problems/p3280) | — |
| 3285 | [Find Indices of Stable Mountains](https://leetcode.com/problems/find-indices-of-stable-mountains/) | Easy | [`p3285`](java/src/main/java/leonardo/savona/problems/p3285) | — |
| 3289 | [The Two Sneaky Numbers of Digitville](https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/) | Easy | [`p3289`](java/src/main/java/leonardo/savona/problems/p3289) | — |
| 3300 | [Minimum Element After Replacement With Digit Sum](https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/) | Easy | [`p3300`](java/src/main/java/leonardo/savona/problems/p3300) | — |
| 3370 | [Smallest Number With All Set Bits](https://leetcode.com/problems/smallest-number-with-all-set-bits/) | Easy | [`p3370`](java/src/main/java/leonardo/savona/problems/p3370) | — |
| 3427 | [Sum of Variable Length Subarrays](https://leetcode.com/problems/sum-of-variable-length-subarrays/) | Easy | [`p3427`](java/src/main/java/leonardo/savona/problems/p3427) | — |
| 3467 | [Transform Array by Parity](https://leetcode.com/problems/transform-array-by-parity/) | Easy | [`p3467`](java/src/main/java/leonardo/savona/problems/p3467) | — |
| 3498 | [Reverse Degree of a String](https://leetcode.com/problems/reverse-degree-of-a-string/) | Easy | [`p3498`](java/src/main/java/leonardo/savona/problems/p3498) | — |
| 3512 | [Minimum Operations to Make Array Sum Divisible by K](https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/) | Easy | [`p3512`](java/src/main/java/leonardo/savona/problems/p3512) | — |
| 3516 | [Find Closest Person](https://leetcode.com/problems/find-closest-person/) | Easy | [`p3516`](java/src/main/java/leonardo/savona/problems/p3516) | — |
| 3541 | [Find Most Frequent Vowel and Consonant](https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/) | Easy | [`p3541`](java/src/main/java/leonardo/savona/problems/p3541) | — |
| 3668 | [Restore Finishing Order](https://leetcode.com/problems/restore-finishing-order/) | Easy | [`p3668`](java/src/main/java/leonardo/savona/problems/p3668) | — |
| 3688 | [Bitwise OR of Even Numbers in an Array](https://leetcode.com/problems/bitwise-or-of-even-numbers-in-an-array/) | Easy | [`p3688`](java/src/main/java/leonardo/savona/problems/p3688) | — |
| 3701 | [Compute Alternating Sum](https://leetcode.com/problems/compute-alternating-sum/) | Easy | [`p3701`](java/src/main/java/leonardo/savona/problems/p3701) | — |
| 3721 | [Longest Balanced Subarray II](https://leetcode.com/problems/longest-balanced-subarray-ii/) | Hard | [`p3721`](java/src/main/java/leonardo/savona/problems/p3721) | — |
| 3731 | [Find Missing Elements](https://leetcode.com/problems/find-missing-elements/) | Easy | [`p3731`](java/src/main/java/leonardo/savona/problems/p3731) | — |
| 3760 | [Maximum Substrings With Distinct Start](https://leetcode.com/problems/maximum-substrings-with-distinct-start/) | Medium | [`p3760`](java/src/main/java/leonardo/savona/problems/p3760) | — |
| 3783 | [Mirror Distance of an Integer](https://leetcode.com/problems/mirror-distance-of-an-integer/) | Easy | [`p3783`](java/src/main/java/leonardo/savona/problems/p3783) | — |
| 3784 | [Minimum Deletion Cost to Make All Characters Equal](https://leetcode.com/problems/minimum-deletion-cost-to-make-all-characters-equal/) | Medium | [`p3784`](java/src/main/java/leonardo/savona/problems/p3784) | — |
| 3785 | [Minimum Swaps to Avoid Forbidden Values](https://leetcode.com/problems/minimum-swaps-to-avoid-forbidden-values/) | Hard | [`p3785`](java/src/main/java/leonardo/savona/problems/p3785) | — |
| 3794 | [Reverse String Prefix](https://leetcode.com/problems/reverse-string-prefix/) | Easy | [`p3794`](java/src/main/java/leonardo/savona/problems/p3794) | — |
| 3838 | [Weighted Word Mapping](https://leetcode.com/problems/weighted-word-mapping/) | Easy | [`p3838`](java/src/main/java/leonardo/savona/problems/p3838) | — |
| 3894 | [Traffic Signal Color](https://leetcode.com/problems/traffic-signal-color/) | Easy | [`p3894`](java/src/main/java/leonardo/savona/problems/p3894) | — |
| 3895 | [Count Digit Appearances](https://leetcode.com/problems/count-digit-appearances/) | Medium | [`p3895`](java/src/main/java/leonardo/savona/problems/p3895) | — |
| 3898 | [Find the Degree of Each Vertex](https://leetcode.com/problems/find-the-degree-of-each-vertex/) | Easy | [`p3898`](java/src/main/java/leonardo/savona/problems/p3898) | — |
| 3925 | [Concatenate Array With Reverse](https://leetcode.com/problems/concatenate-array-with-reverse/) | Easy | [`p3925`](java/src/main/java/leonardo/savona/problems/p3925) | — |
| 3940 | [Limit Occurrences in Sorted Array](https://leetcode.com/problems/limit-occurrences-in-sorted-array/) | Easy | [`p3940`](java/src/main/java/leonardo/savona/problems/p3940) | — |
| 3945 | [Digit Frequency Score](https://leetcode.com/problems/digit-frequency-score/) | Easy | [`p3945`](java/src/main/java/leonardo/savona/problems/p3945) | — |
| 3959 | [Check Good Integer](https://leetcode.com/problems/check-good-integer/) | Easy | [`p3959`](java/src/main/java/leonardo/savona/problems/p3959) | — |

</details>
<!-- END:INDEX -->

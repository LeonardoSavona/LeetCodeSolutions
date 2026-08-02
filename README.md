# LeetCode Solutions

Java solutions to [LeetCode](https://leetcode.com/) problems, organized as a Maven project with JUnit 5 tests and per-test runtime measurement.

**137** problems solved, every one covered by unit tests · Java 21

103 Easy · 31 Medium · 3 Hard — [full index below](#solved-problems).

## Project structure

```
src/
├── main/java/leonardo/savona/problems/
│   ├── common/                 # Shared data structures
│   │   ├── ListNode.java
│   │   └── TreeNode.java
│   ├── p1/Solution.java        # 1. Two Sum
│   ├── p2/Solution.java        # 2. Add Two Numbers
│   └── p<N>/...                # One package per problem
└── test/java/leonardo/savona/
    ├── base/
    │   ├── BaseTest.java       # Base class wiring the timing extension
    │   └── TimingExtension.java
    └── problems/p<N>/SolutionTest.java
```

Each problem lives in its own package named `p<problem number>`, so `p1448` holds problem 1448, and the solution class is always `Solution`. Its unit test sits in the matching package under `src/test`.

Most solutions expose the problem name as a constant:

```java
class Solution {
    public static final String TITLE = "199. Binary Tree Right Side View";
    ...
}
```

LeetCode redefines `ListNode` and `TreeNode` inside every linked-list and tree problem. The `problems.common` package declares them once so solutions can import them instead of repeating the definition. The tree problems already use it; the linked-list ones still carry their own inline copy.

## Requirements

- JDK 21 or newer
- Maven 3.9+

## Running the tests

```bash
mvn test                                       # all problems
mvn test -Dtest=leonardo.savona.problems.p1.SolutionTest   # single problem
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

## Adding a solution

1. Create `src/main/java/leonardo/savona/problems/p<N>/Solution.java` with package `leonardo.savona.problems.p<N>`.
2. Add the `TITLE` constant.
3. Create `src/test/java/leonardo/savona/problems/p<N>/SolutionTest.java` extending `BaseTest`, covering the typical case plus edge cases.
4. Run `mvn test`.

## Stack

| | |
|---|---|
| Language | Java 21 |
| Build | Maven |
| Tests | JUnit 5 (Jupiter 5.10.2) |
| Runner | Maven Surefire 3.2.5 |

## Solved problems

137 problems — 103 Easy, 31 Medium, 3 Hard. Every one has a JUnit test class.

<details>
<summary>Show the full list</summary>

| # | Problem | Difficulty | Solution |
|---|---------|------------|----------|
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Easy | [`p1`](src/main/java/leonardo/savona/problems/p1) |
| 2 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | Medium | [`p2`](src/main/java/leonardo/savona/problems/p2) |
| 3 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Medium | [`p3`](src/main/java/leonardo/savona/problems/p3) |
| 7 | [Reverse Integer](https://leetcode.com/problems/reverse-integer/) | Medium | [`p7`](src/main/java/leonardo/savona/problems/p7) |
| 8 | [String to Integer (atoi)](https://leetcode.com/problems/string-to-integer-atoi/) | Medium | [`p8`](src/main/java/leonardo/savona/problems/p8) |
| 9 | [Palindrome Number](https://leetcode.com/problems/palindrome-number/) | Easy | [`p9`](src/main/java/leonardo/savona/problems/p9) |
| 12 | [Integer to Roman](https://leetcode.com/problems/integer-to-roman/) | Medium | [`p12`](src/main/java/leonardo/savona/problems/p12) |
| 13 | [Roman to Integer](https://leetcode.com/problems/roman-to-integer/) | Easy | [`p13`](src/main/java/leonardo/savona/problems/p13) |
| 14 | [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/) | Easy | [`p14`](src/main/java/leonardo/savona/problems/p14) |
| 19 | [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | Medium | [`p19`](src/main/java/leonardo/savona/problems/p19) |
| 20 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | Easy | [`p20`](src/main/java/leonardo/savona/problems/p20) |
| 21 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | Easy | [`p21`](src/main/java/leonardo/savona/problems/p21) |
| 26 | [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | Easy | [`p26`](src/main/java/leonardo/savona/problems/p26) |
| 27 | [Remove Element](https://leetcode.com/problems/remove-element/) | Easy | [`p27`](src/main/java/leonardo/savona/problems/p27) |
| 28 | [Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/) | Easy | [`p28`](src/main/java/leonardo/savona/problems/p28) |
| 35 | [Search Insert Position](https://leetcode.com/problems/search-insert-position/) | Easy | [`p35`](src/main/java/leonardo/savona/problems/p35) |
| 36 | [Valid Sudoku](https://leetcode.com/problems/valid-sudoku/) | Medium | [`p36`](src/main/java/leonardo/savona/problems/p36) |
| 48 | [Rotate Image](https://leetcode.com/problems/rotate-image/) | Medium | [`p48`](src/main/java/leonardo/savona/problems/p48) |
| 49 | [Group Anagrams](https://leetcode.com/problems/group-anagrams/) | Medium | [`p49`](src/main/java/leonardo/savona/problems/p49) |
| 58 | [Length of Last Word](https://leetcode.com/problems/length-of-last-word/) | Easy | [`p58`](src/main/java/leonardo/savona/problems/p58) |
| 66 | [Plus One](https://leetcode.com/problems/plus-one/) | Easy | [`p66`](src/main/java/leonardo/savona/problems/p66) |
| 67 | [Add Binary](https://leetcode.com/problems/add-binary/) | Easy | [`p67`](src/main/java/leonardo/savona/problems/p67) |
| 74 | [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/) | Medium | [`p74`](src/main/java/leonardo/savona/problems/p74) |
| 104 | [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | Easy | [`p104`](src/main/java/leonardo/savona/problems/p104) |
| 118 | [Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/) | Easy | [`p118`](src/main/java/leonardo/savona/problems/p118) |
| 119 | [Pascal's Triangle II](https://leetcode.com/problems/pascals-triangle-ii/) | Easy | [`p119`](src/main/java/leonardo/savona/problems/p119) |
| 125 | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | Easy | [`p125`](src/main/java/leonardo/savona/problems/p125) |
| 136 | [Single Number](https://leetcode.com/problems/single-number/) | Easy | [`p136`](src/main/java/leonardo/savona/problems/p136) |
| 190 | [Reverse Bits](https://leetcode.com/problems/reverse-bits/) | Easy | [`p190`](src/main/java/leonardo/savona/problems/p190) |
| 191 | [Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/) | Easy | [`p191`](src/main/java/leonardo/savona/problems/p191) |
| 199 | [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/) | Medium | [`p199`](src/main/java/leonardo/savona/problems/p199) |
| 206 | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) | Easy | [`p206`](src/main/java/leonardo/savona/problems/p206) |
| 226 | [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/) | Easy | [`p226`](src/main/java/leonardo/savona/problems/p226) |
| 242 | [Valid Anagram](https://leetcode.com/problems/valid-anagram/) | Easy | [`p242`](src/main/java/leonardo/savona/problems/p242) |
| 260 | [Single Number III](https://leetcode.com/problems/single-number-iii/) | Medium | [`p260`](src/main/java/leonardo/savona/problems/p260) |
| 268 | [Missing Number](https://leetcode.com/problems/missing-number/) | Easy | [`p268`](src/main/java/leonardo/savona/problems/p268) |
| 338 | [Counting Bits](https://leetcode.com/problems/counting-bits/) | Easy | [`p338`](src/main/java/leonardo/savona/problems/p338) |
| 392 | [Is Subsequence](https://leetcode.com/problems/is-subsequence/) | Easy | [`p392`](src/main/java/leonardo/savona/problems/p392) |
| 535 | [Encode and Decode TinyURL](https://leetcode.com/problems/encode-and-decode-tinyurl/) | Medium | [`p535`](src/main/java/leonardo/savona/problems/p535) |
| 709 | [To Lower Case](https://leetcode.com/problems/to-lower-case/) | Easy | [`p709`](src/main/java/leonardo/savona/problems/p709) |
| 728 | [Self Dividing Numbers](https://leetcode.com/problems/self-dividing-numbers/) | Easy | [`p728`](src/main/java/leonardo/savona/problems/p728) |
| 756 | [Pyramid Transition Matrix](https://leetcode.com/problems/pyramid-transition-matrix/) | Medium | [`p756`](src/main/java/leonardo/savona/problems/p756) |
| 771 | [Jewels and Stones](https://leetcode.com/problems/jewels-and-stones/) | Easy | [`p771`](src/main/java/leonardo/savona/problems/p771) |
| 938 | [Range Sum of BST](https://leetcode.com/problems/range-sum-of-bst/) | Easy | [`p938`](src/main/java/leonardo/savona/problems/p938) |
| 944 | [Delete Columns to Make Sorted](https://leetcode.com/problems/delete-columns-to-make-sorted/) | Easy | [`p944`](src/main/java/leonardo/savona/problems/p944) |
| 961 | [N-Repeated Element in Size 2N Array](https://leetcode.com/problems/n-repeated-element-in-size-2n-array/) | Easy | [`p961`](src/main/java/leonardo/savona/problems/p961) |
| 980 | [Unique Paths III](https://leetcode.com/problems/unique-paths-iii/) | Hard | [`p980`](src/main/java/leonardo/savona/problems/p980) |
| 1021 | [Remove Outermost Parentheses](https://leetcode.com/problems/remove-outermost-parentheses/) | Easy | [`p1021`](src/main/java/leonardo/savona/problems/p1021) |
| 1108 | [Defanging an IP Address](https://leetcode.com/problems/defanging-an-ip-address/) | Easy | [`p1108`](src/main/java/leonardo/savona/problems/p1108) |
| 1161 | [Maximum Level Sum of a Binary Tree](https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/) | Medium | [`p1161`](src/main/java/leonardo/savona/problems/p1161) |
| 1221 | [Split a String in Balanced Strings](https://leetcode.com/problems/split-a-string-in-balanced-strings/) | Easy | [`p1221`](src/main/java/leonardo/savona/problems/p1221) |
| 1281 | [Subtract the Product and Sum of Digits of an Integer](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/) | Easy | [`p1281`](src/main/java/leonardo/savona/problems/p1281) |
| 1313 | [Decompress Run-Length Encoded List](https://leetcode.com/problems/decompress-run-length-encoded-list/) | Easy | [`p1313`](src/main/java/leonardo/savona/problems/p1313) |
| 1342 | [Number of Steps to Reduce a Number to Zero](https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/) | Easy | [`p1342`](src/main/java/leonardo/savona/problems/p1342) |
| 1365 | [How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/) | Easy | [`p1365`](src/main/java/leonardo/savona/problems/p1365) |
| 1431 | [Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/) | Easy | [`p1431`](src/main/java/leonardo/savona/problems/p1431) |
| 1448 | [Count Good Nodes in Binary Tree](https://leetcode.com/problems/count-good-nodes-in-binary-tree/) | Medium | [`p1448`](src/main/java/leonardo/savona/problems/p1448) |
| 1470 | [Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/) | Easy | [`p1470`](src/main/java/leonardo/savona/problems/p1470) |
| 1480 | [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/) | Easy | [`p1480`](src/main/java/leonardo/savona/problems/p1480) |
| 1486 | [XOR Operation in an Array](https://leetcode.com/problems/xor-operation-in-an-array/) | Easy | [`p1486`](src/main/java/leonardo/savona/problems/p1486) |
| 1512 | [Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/) | Easy | [`p1512`](src/main/java/leonardo/savona/problems/p1512) |
| 1528 | [Shuffle String](https://leetcode.com/problems/shuffle-string/) | Easy | [`p1528`](src/main/java/leonardo/savona/problems/p1528) |
| 1572 | [Matrix Diagonal Sum](https://leetcode.com/problems/matrix-diagonal-sum/) | Easy | [`p1572`](src/main/java/leonardo/savona/problems/p1572) |
| 1603 | [Design Parking System](https://leetcode.com/problems/design-parking-system/) | Easy | [`p1603`](src/main/java/leonardo/savona/problems/p1603) |
| 1662 | [Check If Two String Arrays are Equivalent](https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/) | Easy | [`p1662`](src/main/java/leonardo/savona/problems/p1662) |
| 1672 | [Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/) | Easy | [`p1672`](src/main/java/leonardo/savona/problems/p1672) |
| 1678 | [Goal Parser Interpretation](https://leetcode.com/problems/goal-parser-interpretation/) | Easy | [`p1678`](src/main/java/leonardo/savona/problems/p1678) |
| 1684 | [Count the Number of Consistent Strings](https://leetcode.com/problems/count-the-number-of-consistent-strings/) | Easy | [`p1684`](src/main/java/leonardo/savona/problems/p1684) |
| 1688 | [Count of Matches in Tournament](https://leetcode.com/problems/count-of-matches-in-tournament/) | Easy | [`p1688`](src/main/java/leonardo/savona/problems/p1688) |
| 1689 | [Partitioning Into Minimum Number Of Deci-Binary Numbers](https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/) | Medium | [`p1689`](src/main/java/leonardo/savona/problems/p1689) |
| 1720 | [Decode XORed Array](https://leetcode.com/problems/decode-xored-array/) | Easy | [`p1720`](src/main/java/leonardo/savona/problems/p1720) |
| 1769 | [Minimum Number of Operations to Move All Balls to Each Box](https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/) | Medium | [`p1769`](src/main/java/leonardo/savona/problems/p1769) |
| 1773 | [Count Items Matching a Rule](https://leetcode.com/problems/count-items-matching-a-rule/) | Easy | [`p1773`](src/main/java/leonardo/savona/problems/p1773) |
| 1791 | [Find Center of Star Graph](https://leetcode.com/problems/find-center-of-star-graph/) | Easy | [`p1791`](src/main/java/leonardo/savona/problems/p1791) |
| 1816 | [Truncate Sentence](https://leetcode.com/problems/truncate-sentence/) | Easy | [`p1816`](src/main/java/leonardo/savona/problems/p1816) |
| 1859 | [Sorting the Sentence](https://leetcode.com/problems/sorting-the-sentence/) | Easy | [`p1859`](src/main/java/leonardo/savona/problems/p1859) |
| 1863 | [Sum of All Subset XOR Totals](https://leetcode.com/problems/sum-of-all-subset-xor-totals/) | Easy | [`p1863`](src/main/java/leonardo/savona/problems/p1863) |
| 1920 | [Build Array from Permutation](https://leetcode.com/problems/build-array-from-permutation/) | Easy | [`p1920`](src/main/java/leonardo/savona/problems/p1920) |
| 1929 | [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/) | Easy | [`p1929`](src/main/java/leonardo/savona/problems/p1929) |
| 1979 | [Find Greatest Common Divisor of Array](https://leetcode.com/problems/find-greatest-common-divisor-of-array/) | Easy | [`p1979`](src/main/java/leonardo/savona/problems/p1979) |
| 2000 | [Reverse Prefix of Word](https://leetcode.com/problems/reverse-prefix-of-word/) | Easy | [`p2000`](src/main/java/leonardo/savona/problems/p2000) |
| 2011 | [Final Value of Variable After Performing Operations](https://leetcode.com/problems/final-value-of-variable-after-performing-operations/) | Easy | [`p2011`](src/main/java/leonardo/savona/problems/p2011) |
| 2048 | [Next Greater Numerically Balanced Number](https://leetcode.com/problems/next-greater-numerically-balanced-number/) | Medium | [`p2048`](src/main/java/leonardo/savona/problems/p2048) |
| 2114 | [Maximum Number of Words Found in Sentences](https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/) | Easy | [`p2114`](src/main/java/leonardo/savona/problems/p2114) |
| 2161 | [Partition Array According to Given Pivot](https://leetcode.com/problems/partition-array-according-to-given-pivot/) | Medium | [`p2161`](src/main/java/leonardo/savona/problems/p2161) |
| 2181 | [Merge Nodes in Between Zeros](https://leetcode.com/problems/merge-nodes-in-between-zeros/) | Medium | [`p2181`](src/main/java/leonardo/savona/problems/p2181) |
| 2220 | [Minimum Bit Flips to Convert Number](https://leetcode.com/problems/minimum-bit-flips-to-convert-number/) | Easy | [`p2220`](src/main/java/leonardo/savona/problems/p2220) |
| 2221 | [Find Triangular Sum of an Array](https://leetcode.com/problems/find-triangular-sum-of-an-array/) | Medium | [`p2221`](src/main/java/leonardo/savona/problems/p2221) |
| 2235 | [Add Two Integers](https://leetcode.com/problems/add-two-integers/) | Easy | [`p2235`](src/main/java/leonardo/savona/problems/p2235) |
| 2236 | [Root Equals Sum of Children](https://leetcode.com/problems/root-equals-sum-of-children/) | Easy | [`p2236`](src/main/java/leonardo/savona/problems/p2236) |
| 2325 | [Decode the Message](https://leetcode.com/problems/decode-the-message/) | Easy | [`p2325`](src/main/java/leonardo/savona/problems/p2325) |
| 2331 | [Evaluate Boolean Binary Tree](https://leetcode.com/problems/evaluate-boolean-binary-tree/) | Easy | [`p2331`](src/main/java/leonardo/savona/problems/p2331) |
| 2396 | [Strictly Palindromic Number](https://leetcode.com/problems/strictly-palindromic-number/) | Medium | [`p2396`](src/main/java/leonardo/savona/problems/p2396) |
| 2413 | [Smallest Even Multiple](https://leetcode.com/problems/smallest-even-multiple/) | Easy | [`p2413`](src/main/java/leonardo/savona/problems/p2413) |
| 2423 | [Remove Letter To Equalize Frequency](https://leetcode.com/problems/remove-letter-to-equalize-frequency/) | Easy | [`p2423`](src/main/java/leonardo/savona/problems/p2423) |
| 2433 | [Find The Original Array of Prefix Xor](https://leetcode.com/problems/find-the-original-array-of-prefix-xor/) | Medium | [`p2433`](src/main/java/leonardo/savona/problems/p2433) |
| 2469 | [Convert the Temperature](https://leetcode.com/problems/convert-the-temperature/) | Easy | [`p2469`](src/main/java/leonardo/savona/problems/p2469) |
| 2482 | [Difference Between Ones and Zeros in Row and Column](https://leetcode.com/problems/difference-between-ones-and-zeros-in-row-and-column/) | Medium | [`p2482`](src/main/java/leonardo/savona/problems/p2482) |
| 2520 | [Count the Digits That Divide a Number](https://leetcode.com/problems/count-the-digits-that-divide-a-number/) | Easy | [`p2520`](src/main/java/leonardo/savona/problems/p2520) |
| 2574 | [Left and Right Sum Differences](https://leetcode.com/problems/left-and-right-sum-differences/) | Easy | [`p2574`](src/main/java/leonardo/savona/problems/p2574) |
| 2610 | [Convert an Array Into a 2D Array With Conditions](https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/) | Medium | [`p2610`](src/main/java/leonardo/savona/problems/p2610) |
| 2652 | [Sum Multiples](https://leetcode.com/problems/sum-multiples/) | Easy | [`p2652`](src/main/java/leonardo/savona/problems/p2652) |
| 2657 | [Find the Prefix Common Array of Two Arrays](https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/) | Medium | [`p2657`](src/main/java/leonardo/savona/problems/p2657) |
| 2769 | [Find the Maximum Achievable Number](https://leetcode.com/problems/find-the-maximum-achievable-number/) | Easy | [`p2769`](src/main/java/leonardo/savona/problems/p2769) |
| 2798 | [Number of Employees Who Met the Target](https://leetcode.com/problems/number-of-employees-who-met-the-target/) | Easy | [`p2798`](src/main/java/leonardo/savona/problems/p2798) |
| 2807 | [Insert Greatest Common Divisors in Linked List](https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/) | Medium | [`p2807`](src/main/java/leonardo/savona/problems/p2807) |
| 2824 | [Count Pairs Whose Sum is Less than Target](https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/) | Easy | [`p2824`](src/main/java/leonardo/savona/problems/p2824) |
| 2894 | [Divisible and Non-divisible Sums Difference](https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/) | Easy | [`p2894`](src/main/java/leonardo/savona/problems/p2894) |
| 2942 | [Find Words Containing Character](https://leetcode.com/problems/find-words-containing-character/) | Easy | [`p2942`](src/main/java/leonardo/savona/problems/p2942) |
| 3065 | [Minimum Operations to Exceed Threshold Value I](https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i/) | Easy | [`p3065`](src/main/java/leonardo/savona/problems/p3065) |
| 3146 | [Permutation Difference between Two Strings](https://leetcode.com/problems/permutation-difference-between-two-strings/) | Easy | [`p3146`](src/main/java/leonardo/savona/problems/p3146) |
| 3190 | [Find Minimum Operations to Make All Elements Divisible by Three](https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/) | Easy | [`p3190`](src/main/java/leonardo/savona/problems/p3190) |
| 3226 | [Number of Bit Changes to Make Two Integers Equal](https://leetcode.com/problems/number-of-bit-changes-to-make-two-integers-equal/) | Easy | [`p3226`](src/main/java/leonardo/savona/problems/p3226) |
| 3280 | [Convert Date to Binary](https://leetcode.com/problems/convert-date-to-binary/) | Easy | [`p3280`](src/main/java/leonardo/savona/problems/p3280) |
| 3285 | [Find Indices of Stable Mountains](https://leetcode.com/problems/find-indices-of-stable-mountains/) | Easy | [`p3285`](src/main/java/leonardo/savona/problems/p3285) |
| 3289 | [The Two Sneaky Numbers of Digitville](https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/) | Easy | [`p3289`](src/main/java/leonardo/savona/problems/p3289) |
| 3370 | [Smallest Number With All Set Bits](https://leetcode.com/problems/smallest-number-with-all-set-bits/) | Easy | [`p3370`](src/main/java/leonardo/savona/problems/p3370) |
| 3427 | [Sum of Variable Length Subarrays](https://leetcode.com/problems/sum-of-variable-length-subarrays/) | Easy | [`p3427`](src/main/java/leonardo/savona/problems/p3427) |
| 3467 | [Transform Array by Parity](https://leetcode.com/problems/transform-array-by-parity/) | Easy | [`p3467`](src/main/java/leonardo/savona/problems/p3467) |
| 3498 | [Reverse Degree of a String](https://leetcode.com/problems/reverse-degree-of-a-string/) | Easy | [`p3498`](src/main/java/leonardo/savona/problems/p3498) |
| 3512 | [Minimum Operations to Make Array Sum Divisible by K](https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/) | Easy | [`p3512`](src/main/java/leonardo/savona/problems/p3512) |
| 3516 | [Find Closest Person](https://leetcode.com/problems/find-closest-person/) | Easy | [`p3516`](src/main/java/leonardo/savona/problems/p3516) |
| 3541 | [Find Most Frequent Vowel and Consonant](https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/) | Easy | [`p3541`](src/main/java/leonardo/savona/problems/p3541) |
| 3668 | [Restore Finishing Order](https://leetcode.com/problems/restore-finishing-order/) | Easy | [`p3668`](src/main/java/leonardo/savona/problems/p3668) |
| 3688 | [Bitwise OR of Even Numbers in an Array](https://leetcode.com/problems/bitwise-or-of-even-numbers-in-an-array/) | Easy | [`p3688`](src/main/java/leonardo/savona/problems/p3688) |
| 3701 | [Compute Alternating Sum](https://leetcode.com/problems/compute-alternating-sum/) | Easy | [`p3701`](src/main/java/leonardo/savona/problems/p3701) |
| 3721 | [Longest Balanced Subarray II](https://leetcode.com/problems/longest-balanced-subarray-ii/) | Hard | [`p3721`](src/main/java/leonardo/savona/problems/p3721) |
| 3760 | [Maximum Substrings With Distinct Start](https://leetcode.com/problems/maximum-substrings-with-distinct-start/) | Medium | [`p3760`](src/main/java/leonardo/savona/problems/p3760) |
| 3783 | [Mirror Distance of an Integer](https://leetcode.com/problems/mirror-distance-of-an-integer/) | Easy | [`p3783`](src/main/java/leonardo/savona/problems/p3783) |
| 3784 | [Minimum Deletion Cost to Make All Characters Equal](https://leetcode.com/problems/minimum-deletion-cost-to-make-all-characters-equal/) | Medium | [`p3784`](src/main/java/leonardo/savona/problems/p3784) |
| 3785 | [Minimum Swaps to Avoid Forbidden Values](https://leetcode.com/problems/minimum-swaps-to-avoid-forbidden-values/) | Hard | [`p3785`](src/main/java/leonardo/savona/problems/p3785) |
| 3794 | [Reverse String Prefix](https://leetcode.com/problems/reverse-string-prefix/) | Easy | [`p3794`](src/main/java/leonardo/savona/problems/p3794) |
| 3838 | [Weighted Word Mapping](https://leetcode.com/problems/weighted-word-mapping/) | Easy | [`p3838`](src/main/java/leonardo/savona/problems/p3838) |
| 3895 | [Count Digit Appearances](https://leetcode.com/problems/count-digit-appearances/) | Medium | [`p3895`](src/main/java/leonardo/savona/problems/p3895) |
| 3898 | [Find the Degree of Each Vertex](https://leetcode.com/problems/find-the-degree-of-each-vertex/) | Easy | [`p3898`](src/main/java/leonardo/savona/problems/p3898) |
| 3925 | [Concatenate Array With Reverse](https://leetcode.com/problems/concatenate-array-with-reverse/) | Easy | [`p3925`](src/main/java/leonardo/savona/problems/p3925) |
| 3940 | [Limit Occurrences in Sorted Array](https://leetcode.com/problems/limit-occurrences-in-sorted-array/) | Easy | [`p3940`](src/main/java/leonardo/savona/problems/p3940) |

</details>

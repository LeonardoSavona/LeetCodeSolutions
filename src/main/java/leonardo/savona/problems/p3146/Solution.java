package leonardo.savona.problems.p3146;

class Solution {
    public static final String TITLE = "3146. Permutation Difference between Two Strings";

    public int findPermutationDifference(String s, String t) {
        int res = 0;
        for (String c : s.split("")) {
            res += Math.abs(s.indexOf(c) - t.indexOf(c));
        }
        return res;
    }
}
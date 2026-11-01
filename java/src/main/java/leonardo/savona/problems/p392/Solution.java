package leonardo.savona.problems.p392;

class Solution {
    public static final String TITLE = "392. Is Subsequence";

    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        int c = 0;
        int i = 0;
        int sLen = s.length();
        int tLen = t.length();
        while (i < sLen && c < tLen) {
            if (s.charAt(i) == t.charAt(c++)) i++;
        }
        return i==s.length();
    }
}
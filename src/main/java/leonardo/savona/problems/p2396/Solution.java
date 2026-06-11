package leonardo.savona.problems.p2396;

class Solution {
    public static final String TITLE = "2396. Strictly Palindromic Number";

    public static boolean isStrictlyPalindromic(int n) {
        for (int i=2; i<n; i++) {
            String s = Integer.toString(n, i);
            if (!isPalindromic(s)) return false;
        }
        return true;
    }

    private static boolean isPalindromic(String s) {
        for (int i=0; i<s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
}
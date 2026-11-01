package leonardo.savona.problems.p2048;

class Solution {
    public static final String TITLE = "2048. Next Greater Numerically Balanced Number";

    public static int nextBeautifulNumber(int n) {
        while (!isNumericallyBalanced(++n));
        return n;
    }

    private static boolean isNumericallyBalanced(int n) {
        String s = String.valueOf(n);
        for (int i=0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!(s.chars().filter(value -> value == c).count() == Integer.parseInt(String.valueOf(c)))) return false;
        }
        return true;
    }
}
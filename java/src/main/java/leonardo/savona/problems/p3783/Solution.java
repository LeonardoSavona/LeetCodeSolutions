package leonardo.savona.problems.p3783;

class Solution {
    public static final String TITLE = "3783. Mirror Distance of an Integer";

    public int mirrorDistance(int n) {
        return Math.abs(n - reverse(n));
    }

    private int reverse(int n) {
        int res = 0;
        while(n > 0) {
            int resto = n % 10;
            res += resto;
            n /= 10;
            if (n > 0)
                res *= 10;
        }
        return res;
    }
}
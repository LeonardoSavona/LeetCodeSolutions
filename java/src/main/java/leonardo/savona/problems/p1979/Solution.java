package leonardo.savona.problems.p1979;

class Solution {
    public static final String TITLE = "1979. Find Greatest Common Divisor of Array";

    public int findGCD(int[] nums) {
           int max = -1;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return GCD(max, min);
    }

    private static int GCD(int x, int y) {
        if (x == y) return x;
        else if (x > y) return GCD(y, x);
        else return GCD(x, y-x);
    }
}
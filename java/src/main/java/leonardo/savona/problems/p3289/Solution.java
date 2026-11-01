package leonardo.savona.problems.p3289;

class Solution {
    public static final String TITLE = "3289. The Two Sneaky Numbers of Digitville";

    public static int[] getSneakyNumbers(int[] nums) {
        int[] result = new int[2];
        int c = 0;
        long mask = 0;
        long mask2 = 0;
        for (Integer i : nums) {
            if (i < 63) {
                if ((mask & (long) Math.pow(2, i)) != 0) {
                    result[c++] = i;
                    if (c == 2) return result;
                }
                mask |= 1L << i;
            } else {
                int a = i - 62;
                if ((mask2 & (long) Math.pow(2, a)) != 0) {
                    result[c++] = i;
                    if (c == 2) return result;
                }
                mask2 |= 1L << a;
            }
        }
        return result;
    }
}
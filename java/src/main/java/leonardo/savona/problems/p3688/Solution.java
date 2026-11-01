package leonardo.savona.problems.p3688;

class Solution {
    public static final String TITLE = "3688. Bitwise OR of Even Numbers in an Array";

    public int evenNumberBitwiseORs(int[] nums) {
               int res = 0;
        for (int n:nums) {
            if (n % 2 == 0) res |= n;
        }
        return res;
    }
}
package leonardo.savona.problems.p190;

class Solution {
    public static final String TITLE = "190. Reverse Bits";

    public int reverseBits(int n) {
        int r = 0;
        for (int i=31; i>=0; i--) {
            r |= (n & 1) << i;
            n >>= 1;
        }
        return r;
    }
}
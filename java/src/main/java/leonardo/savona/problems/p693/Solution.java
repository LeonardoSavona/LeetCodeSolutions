package leonardo.savona.problems.p693;

class Solution {
    public static final String TITLE = "693. Binary Number with Alternating Bits";

    public boolean hasAlternatingBits(int n) {
        int last = n & 1;
        while ((n >>= 1) > 0) {
            int b = n & 1;
            if (last == b) return false;
            last = b;
        }
        return true;
    }
}
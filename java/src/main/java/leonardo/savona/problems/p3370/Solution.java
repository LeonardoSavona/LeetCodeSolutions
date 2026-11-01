package leonardo.savona.problems.p3370;

class Solution {
    public static final String TITLE = "3370. Smallest Number With All Set Bits";

    public int smallestNumber(int n) {
        int bits = (int) (Math.log10(n) / Math.log10(2)) + 1;
        return (int) (Math.pow(2, bits) - 1);
    }
}
package leonardo.savona.problems.p2657;

class Solution {
    public static final String TITLE = "2657. Find the Prefix Common Array of Two Arrays";

 public int[] findThePrefixCommonArray(int[] A, int[] B) {
    int n = A.length;
    int[] res = new int[n];
    long maskA = 0, maskB = 0;
    for (int i = 0; i < n; i++) {
        maskA |= 1L << A[i];
        maskB |= 1L << B[i];
        res[i] = Long.bitCount(maskA & maskB);
    }
    return res;
}
}
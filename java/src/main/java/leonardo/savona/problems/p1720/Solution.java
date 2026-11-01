package leonardo.savona.problems.p1720;

class Solution {
    public static final String TITLE = "1720. Decode XORed Array";

     public int[] decode(int[] encoded, int first) {
        int len = encoded.length;
        int[] res = new int[len+1];
        res[0] = first;
        for (int i=1; i<len+1; i++) {
            res[i] = res[i-1] ^ encoded[i-1];
        }
        return res;
    }
}
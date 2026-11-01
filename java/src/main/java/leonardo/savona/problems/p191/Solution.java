package leonardo.savona.problems.p191;

class Solution {
    public static final String TITLE = "191. Number of 1 Bits";

    public int hammingWeight(int n) {
                String s = Integer.toBinaryString(n);
        int res = 0;
        for (String s1 : s.split("")) {
            if (!s1.equals("0")) {
                res++;
            }
        }
        return res;
    }
}
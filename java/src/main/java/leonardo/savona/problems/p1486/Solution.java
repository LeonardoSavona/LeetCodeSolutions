package leonardo.savona.problems.p1486;

class Solution {
    public static final String TITLE = "1486. XOR Operation in an Array";

    public int xorOperation(int n, int start) {
        int result = 0;
        for (int i=0; i < n; i++)
            result ^= start + (2*i);
        return result;
    }
}
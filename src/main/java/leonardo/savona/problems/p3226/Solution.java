package leonardo.savona.problems.p3226;

class Solution {
    public static final String TITLE = "3226. Number of Bit Changes to Make Two Integers Equal";

    public int minChanges(int start, int goal) {
        int sum = 0;
        while (start != 0 || goal != 0) {
            if ((start & 1) == 1 && (goal & 1) == 0) sum++;
            else if ((start & 1) == 0 && (goal & 1) == 1) return -1;
            start >>= 1;
            goal >>= 1;
        }
        return sum;
    }
}
package leonardo.savona.problems.p2413;

class Solution {
    public static final String TITLE = "2413. Smallest Even Multiple";

    public int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : n*2;
    }
}
package leonardo.savona.problems.p3516;

class Solution {
    public static final String TITLE = "3516. Find Closest Person";

    public int findClosest(int x, int y, int z) {
                int p1 = Math.abs(x-z);
        int p2 = Math.abs(y-z);
        if (p1 == p2) return 0;
        else if (p1 < p2) return 1;
        else return 2;
    }
}
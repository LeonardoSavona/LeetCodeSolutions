package leonardo.savona.problems.p1791;

class Solution {
    public static final String TITLE = "1791. Find Center of Star Graph";

    public int findCenter(int[][] edges) {
        int a = edges[0][0];
        if (a == edges[1][0]) return a;
        if (a == edges[1][1]) return a;
        return edges[0][1];
    }
}
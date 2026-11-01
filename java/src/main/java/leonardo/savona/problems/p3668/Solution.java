package leonardo.savona.problems.p3668;

class Solution {
    public static final String TITLE = "3668. Restore Finishing Order";

    public int[] recoverOrder(int[] order, int[] friends) {
        int[] res = new int[friends.length];
        int f = 0;
        for (int j : order) {
            for (int friend : friends) {
                if (friend == j) {
                    res[f++] = friend;
                }
            }
        }
        return res;
    }
}
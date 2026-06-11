package leonardo.savona.problems.p2574;

class Solution {
    public static final String TITLE = "2574. Left and Right Sum Differences";

    public int[] leftRightDifference(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        for (int i=0; i<len; i++) {
            int x = 0;
            for (int c=0; c<len; c++) {
                int n = nums[c];
                if (c < i)
                    x -= n;
                else if (c > i)
                    x += n;
            }
            res[i] = Math.abs(x);
        }
        return res;
    }
}
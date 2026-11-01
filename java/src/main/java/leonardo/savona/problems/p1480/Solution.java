package leonardo.savona.problems.p1480;

class Solution {
    public static final String TITLE = "1480. Running Sum of 1d Array";

    public int[] runningSum(int[] nums) {
                int len=nums.length;
        int[] res = new int[len];
        res[0] = nums[0];
        for (int i=1; i<len; i++) {
            res[i] = res[i-1]+nums[i];
        }
        return res;
    
    }
}
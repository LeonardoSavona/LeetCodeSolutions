package leonardo.savona.problems.p1920;

class Solution {
    public static final String TITLE = "1920. Build Array from Permutation";

    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
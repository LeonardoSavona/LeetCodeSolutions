package leonardo.savona.problems.p2221;

class Solution {
    public static final String TITLE = "2221. Find Triangular Sum of an Array";

    public int triangularSum(int[] nums) {
        int len = nums.length;
        if (len == 1) return nums[0];

        int[] nums2 = new int[len-1];
        for (int i=1; i<len;i++) {
            nums2[i-1] = (nums[i] + nums[i-1]) % 10;
        }
        return triangularSum(nums2);
    }
}
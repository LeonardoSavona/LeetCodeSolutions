package leonardo.savona.problems.p3427;

class Solution {
    public static final String TITLE = "3427. Sum of Variable Length Subarrays";

    public int subarraySum(int[] nums) {
        int sum = 0;
        for (int i=0, len=nums.length; i<len; i++) {
            int start = Math.max(0, i - nums[i]);
            while (start<=i) {
                sum+=nums[start++];
            }
        }
        return sum;
    }
}
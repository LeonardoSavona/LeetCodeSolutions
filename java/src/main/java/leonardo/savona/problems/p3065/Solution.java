package leonardo.savona.problems.p3065;

class Solution {
    public static final String TITLE = "3065. Minimum Operations to Exceed Threshold Value I";

    public int minOperations(int[] nums, int k) {
        int lt = 0;
        int len=nums.length;
        for (int i=0; i<len; i++) {
            if (nums[i] < k) lt++;
        }
        return lt;
    }
}
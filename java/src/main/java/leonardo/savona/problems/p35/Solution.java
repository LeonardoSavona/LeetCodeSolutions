package leonardo.savona.problems.p35;

class Solution {
    public static final String TITLE = "35. Search Insert Position";

    public int searchInsert(int[] nums, int target) {
        for (int i=0; i < nums.length; i++) 
            if (nums[i] >= target) return i;
        return nums.length;
    }
}
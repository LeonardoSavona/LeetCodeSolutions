package leonardo.savona.problems.p26;

class Solution {
    public static final String TITLE = "26. Remove Duplicates from Sorted Array";

    public int removeDuplicates(int[] nums) {
        int c = 0;
        for (int i = 1, len=nums.length; i < len; i++) {
            int num = nums[i];
            if (num != nums[c]) {
                nums[++c] = num;
            }
        }

        return c + 1;
    }
}
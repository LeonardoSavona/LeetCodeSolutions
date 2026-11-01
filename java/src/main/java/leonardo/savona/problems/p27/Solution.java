package leonardo.savona.problems.p27;

class Solution {
    public static final String TITLE = "27. Remove Element";

    public int removeElement(int[] nums, int val) {
        int c = 0;

        for (int i = 0 ; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[c] = nums[i];
                c++;
            }
        }

        return c;
    }
}
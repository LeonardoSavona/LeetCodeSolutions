package leonardo.savona.problems.p1470;

class Solution {
    public static final String TITLE = "1470. Shuffle the Array";

    public int[] shuffle(int[] nums, int n) {
         int[] res = new int[nums.length];

        for (int i = 0; i < n*2; i+=2) {
            res[i] = nums[i/2];
            res[i+1] = nums[i/2+n];
        }
        return res;
    }
}
package leonardo.savona.problems.p3925;

class Solution {
    public static final String TITLE = "3925. Concatenate Array With Reverse";

   public static int[] concatWithReverse(int[] nums) {
        int numLen = nums.length;
        int[] res = new int[numLen*2];
        for (int i=0; i < numLen; i++) {
            res[i] = res[res.length-1-i] = nums[i];
        }
        return res;
    }
}
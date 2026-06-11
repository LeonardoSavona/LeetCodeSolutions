package leonardo.savona.problems.p1512;

class Solution {
    public static final String TITLE = "1512. Number of Good Pairs";

    public int numIdenticalPairs(int[] nums) {
         int c = 0;
        for(int i = 0;  i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                  c++;
                }
            }
        }
        return c;
    }
}
package leonardo.savona.problems.p1365;

class Solution {
    public static final String TITLE = "1365. How Many Numbers Are Smaller Than the Current Number";

    public int[] smallerNumbersThanCurrent(int[] nums) {
                int[] res = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            for (int j=0; j<nums.length; j++) {
                if (i != j && nums[j] < nums[i]) res[i]++;
            }
        }
        return res;
    }
}
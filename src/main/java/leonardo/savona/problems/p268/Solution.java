package leonardo.savona.problems.p268;

public class Solution {

    public static final String TITLE = "268. Missing Number";

    public int missingNumber(int[] nums) {
        int len = nums.length;
        int total = (len * (len+1)) / 2;
        for (Integer n : nums) {
            total -= n;
        }
        return total;
    }
}

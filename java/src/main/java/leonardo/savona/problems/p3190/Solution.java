package leonardo.savona.problems.p3190;

class Solution {
    public static final String TITLE = "3190. Find Minimum Operations to Make All Elements Divisible by Three";

    public int minimumOperations(int[] nums) {
        int res=0;
        for (int i=0;i<nums.length;i++) {if (nums[i]%3!=0) res++;}
        return res;
    }
}
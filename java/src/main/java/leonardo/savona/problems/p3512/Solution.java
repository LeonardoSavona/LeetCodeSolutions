package leonardo.savona.problems.p3512;

class Solution {
    public static final String TITLE = "3512. Minimum Operations to Make Array Sum Divisible by K";

    public int minOperations(int[] nums, int k) {
                int sum = 0;
        for (int n:nums) sum+=n;
        return sum%k;
    }
}
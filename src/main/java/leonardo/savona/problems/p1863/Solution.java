package leonardo.savona.problems.p1863;

class Solution {
    public static final String TITLE = "1863. Sum of All Subset XOR Totals";

    public int subsetXORSum(int[] nums) {
        return subsets(0, nums, 0);
    }

    private int subsets(int i, int[] nums, int partialXOR) {
        int res = 0;
        for (int j=i, len=nums.length; j<len; j++) {
            int xor = partialXOR ^ nums[j];
            res += xor + subsets(j+1, nums, xor);
        }
        return res;
    }
}
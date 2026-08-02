package leonardo.savona.problems.p977;

class Solution {
    public static final String TITLE = "977. Squares of a Sorted Array";

    public int[] sortedSquares(int[] nums) {
        int startIdx = 0;
        int endIdx = nums.length-1;
        int[] res = new int[endIdx+1];
        int idx = endIdx;
        while (startIdx <= endIdx) {
            int n1 = nums[endIdx]*nums[endIdx];
            int n2 = nums[startIdx]*nums[startIdx];

            if (n1 > n2) {
                res[idx--] = n1;
                endIdx--;
            } else {
                res[idx--] = n2;
                startIdx++;
            }
        }
        return res;
    }
}
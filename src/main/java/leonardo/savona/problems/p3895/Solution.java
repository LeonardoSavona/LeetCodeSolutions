package leonardo.savona.problems.p3895;

class Solution {
    public static final String TITLE = "3895. Count Digit Appearances";

       public int countDigitOccurrences(int[] nums, int digit) {
        int res = 0;
        for (int i=0, len=nums.length; i<len; i++) {
            int n = nums[i];
            while (n > 0) {
                if (n % 10 == digit) res++;
                n /= 10;
            }
        }

        return res;
    }
}
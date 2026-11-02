package leonardo.savona.problems.p80;

class Solution {
    public static final String TITLE = "80. Remove Duplicates from Sorted Array II";

    public int removeDuplicates(int[] nums) {
        int idx = 1;
        int c = 1;
        int prec = nums[0];
        for (int i=1, len=nums.length; i<len; i++) {
            int num = nums[i];

            if (num == prec) {
                c++;
                if (c <= 2) nums[idx++] = num;
            } else {
                c = 1;
                nums[idx++] = num;
            }


            prec = num;
        }

        return idx;
    }
}
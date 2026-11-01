package leonardo.savona.problems.p3940;

import java.util.Arrays;

class Solution {
    public static final String TITLE = "3940. Limit Occurrences in Sorted Array";

    public int[] limitOccurrences(int[] nums, int k) {
        int idx = 0;
        int occ = 0;
        for (int i=0, len=nums.length; i<len; i++) {
            int num = nums[i];

            if (i > 0 && nums[i-1] == num) occ++;
            else occ = 1;

            if (occ <= k)
                nums[idx++] = num;
        }

        return Arrays.copyOfRange(nums, 0, idx);
    }
}
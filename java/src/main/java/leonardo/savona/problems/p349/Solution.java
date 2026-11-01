package leonardo.savona.problems.p349;

import java.util.*;

class Solution {
    public static final String TITLE = "349. Intersection of Two Arrays";

    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] array = new boolean[1001];
        for (int n : nums1) array[n] = true;

        int[] res = new int[Math.max(nums1.length, nums2.length)];
        int idx = 0;
        for (int n : nums2) {
            boolean bool = array[n];
            if (bool) {
                res[idx++] = n;
                array[n] = false;
            }
        }
        return Arrays.copyOf(res, idx);
    }
}
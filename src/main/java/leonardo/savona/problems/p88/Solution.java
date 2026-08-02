package leonardo.savona.problems.p88;

import java.util.Arrays;

class Solution {
    public static final String TITLE = "88. Merge Sorted Array";

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n > 0) {
            int j = n-1, i=m-1, k=n+m-1;
            while (j>=0) {
                if (i >= 0 && nums1[i] > nums2[j]){
                    nums1[k--] = nums1[i--];
                } else {
                    nums1[k--] = nums2[j--];
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arra = new int[]{4,5,6,0,0,0};
        new Solution().merge(arra, 3, new int[]{1,2,3}, 3);
        System.out.println(Arrays.toString(arra));

        arra = new int[]{1,2,3,0,0,0};
        new Solution().merge(arra, 3, new int[]{2,5,6}, 3);
        System.out.println(Arrays.toString(arra));

        arra = new int[]{0};
        new Solution().merge(arra, 0, new int[]{1}, 1);
        System.out.println(Arrays.toString(arra));

        arra = new int[]{1,2,4,5,6,0};
        new Solution().merge(arra, 5, new int[]{3}, 1);
        System.out.println(Arrays.toString(arra));
    }
}
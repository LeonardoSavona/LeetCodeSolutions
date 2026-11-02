package leonardo.savona.problems.p88;

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
}
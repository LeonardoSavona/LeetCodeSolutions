package leonardo.savona.problems.p2161;

class Solution {
    public static final String TITLE = "2161. Partition Array According to Given Pivot";

    public int[] pivotArray(int[] nums, int pivot) {
                int[] result = new int[nums.length];
        int[] minori = new int[nums.length];
        int[] maggiori = new int[nums.length];
        int uguali = 0;
        int minoriC = 0;
        int maggioriC = 0;
        for (int num : nums) {
            if (num < pivot)
                minori[minoriC++] = num;
            else if (num > pivot)
                maggiori[maggioriC++] = num;
            else
                uguali++;
        }

        int c=0;
        for (int i=0; i<nums.length; i++) {
            if (minoriC-- > 0) {
                result[i] = minori[c++];
                if (minoriC == 0) c = 0;
            }
            else if (uguali-- > 0) result[i] = pivot;
            else result[i] = maggiori[c++];
        }
        return result;
    }
}
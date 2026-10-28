package leonardo.savona.problems.p852;

class Solution {
    public static final String TITLE = "852. Peak Index in a Mountain Array";

    public int peakIndexInMountainArray(int[] arr) {
        int startIdx = 0;
        int endIdx = arr.length-1;
        while (startIdx <= endIdx) {
            int midIdx = endIdx - ((endIdx-startIdx) / 2);
            int elem = arr[midIdx];
            if (arr[midIdx-1] > elem) {
                endIdx = midIdx-1;
            } else if (arr[midIdx+1] > elem) {
                startIdx = midIdx+1;
            } else {
                return midIdx;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        new Solution().peakIndexInMountainArray(new int[]{55,59,63,99,97,94,84,81,79,66,40,38,33,23,22,21,17,9,7});
    }
}
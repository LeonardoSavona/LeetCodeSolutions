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
}
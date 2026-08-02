package leonardo.savona.problems.p2974;

class Solution {
    public static final String TITLE = "2974. Minimum Number Game";

    public int[] numberGame(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int idx = 0;
        while (len > 0) {
            int aliceMin = min(nums, len--);
            int bobMin = min(nums, len--);
            res[idx++] = bobMin;
            res[idx++] = aliceMin;
        }
        return res;
    }

    private int min(int[] array, int len) {
        int min = Integer.MAX_VALUE;
        int minIdx = -1;
        for (int i=0; i<len; i++) {
            if (array[i] < min) {
                minIdx = i;
                min = array[i];
            }
        }

        int tmp = array[minIdx];
        array[minIdx] = array[len-1];
        array[len-1] = tmp;
        return min;
    }
}
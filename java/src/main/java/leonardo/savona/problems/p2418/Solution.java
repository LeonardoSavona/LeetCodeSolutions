package leonardo.savona.problems.p2418;

class Solution {
    public static final String TITLE = "2418. Sort the People";

    public String[] sortPeople(String[] names, int[] heights) {
        int startIdx = 0;
        int len = heights.length;
        while (startIdx < len) {
            int max = Integer.MIN_VALUE;
            int maxIdx = -1;
            for (int i=startIdx; i<len; i++) {
                if (heights[i] > max) {
                    maxIdx = i;
                    max = heights[i];
                }
            }

            int tmp = heights[maxIdx];
            heights[maxIdx] = heights[startIdx];
            heights[startIdx] = tmp;

            String stmp = names[maxIdx];
            names[maxIdx] = names[startIdx];
            names[startIdx] = stmp;

            startIdx++;
        }
        return names;
    }
}
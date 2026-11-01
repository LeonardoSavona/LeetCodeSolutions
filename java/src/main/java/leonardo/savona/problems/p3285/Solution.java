package leonardo.savona.problems.p3285;

import java.util.*;

class Solution {
    public static final String TITLE = "3285. Find Indices of Stable Mountains";

    public List<Integer> stableMountains(int[] height, int threshold) {
        int len = height.length;
        List<Integer> result = new ArrayList<>(len-1);
        for (int i=1; i < len; i++) {
            if (height[i-1] > threshold) result.add(i);
        }
        return result;
    }
}
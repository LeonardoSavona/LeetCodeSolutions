package leonardo.savona.problems.p3731;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static final String TITLE = "3731. Find Missing Elements";

    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE, max = 0;
        boolean[] arr = new boolean[101];
        for (int n : nums) {
            arr[n] = true;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        List<Integer> list = new ArrayList<>(max-min);
        for (int i=min; i<max; i++) {
            if (!arr[i]) list.add(i);
        }
        return list;
    }
}
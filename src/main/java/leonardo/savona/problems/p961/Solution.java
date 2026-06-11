package leonardo.savona.problems.p961;

import java.util.*;

class Solution {
    public static final String TITLE = "961. N-Repeated Element in Size 2N Array";

    public int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                return i;
            }
        }
        return -1;
    }
}
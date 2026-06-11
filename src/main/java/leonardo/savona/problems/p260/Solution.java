package leonardo.savona.problems.p260;

import java.util.*;

class Solution {
    public static final String TITLE = "260. Single Number III";

    public int[] singleNumber(int[] nums) {
        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.get(num) == null) {
                map.put(num, 1);
            } else {
                map.remove(num);
            }
        }

        int c = 0;
        for (int i : map.keySet()) {
            result[c] = i;
            c++;
        }
        return result;
    }
}
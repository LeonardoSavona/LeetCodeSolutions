package leonardo.savona.problems.p1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static final String TITLE = "1. Two Sum";

     public static int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<len; i++) {
            int n = nums[i];
            Integer k = map.get(target - n);
            if (k != null) {
                return new int[]{k, i};
            }
            map.put(n, i);
        }

        return new int[]{};
    }
}
package leonardo.savona.problems.p136;

import java.util.*;

class Solution {
    public static final String TITLE = "136. Single Number";

    public int singleNumber(int[] nums) {
                Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length;i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                map.remove(nums[i]);
            }
        }
        return (int) map.keySet().toArray()[0];
    }
}
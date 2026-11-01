package leonardo.savona.problems.p2824;

import java.util.*;

class Solution {
    public static final String TITLE = "2824. Count Pairs Whose Sum is Less than Target";

        public int countPairs(List<Integer> nums, int target) {
        int r = 0;
        for (int i=0, len=nums.size(); i<len; i++) {
            for (int j=i+1; j<len; j++) {
                if (nums.get(i) + nums.get(j) < target) r++;
            }
        }
        return r;
    }
}
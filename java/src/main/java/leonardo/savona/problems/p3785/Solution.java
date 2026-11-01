package leonardo.savona.problems.p3785;

import java.util.*;

class Solution {
    public static final String TITLE = "3785. Minimum Swaps to Avoid Forbidden Values";

 
   public int minSwaps(int[] nums, int[] forbidden) {
        int n = nums.length;

        Map<Integer, Integer> totalCounts = new HashMap<>();
        for (int x : nums) totalCounts.put(x, totalCounts.getOrDefault(x, 0) + 1);
        for (int x : forbidden) {
            int count = totalCounts.getOrDefault(x, 0) + 1;
            if (count > n) return -1;
            totalCounts.put(x, count);
        }

        int totalBad = 0;
        int maxFreqInBad = 0;
        Map<Integer, Integer> badFreqs = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] == forbidden[i]) {
                totalBad++;
                int val = nums[i];
                int f = badFreqs.getOrDefault(val, 0) + 1;
                badFreqs.put(val, f);
                if (f > maxFreqInBad) {
                    maxFreqInBad = f;
                }
            }
        }

        if (totalBad == 0) return 0;

        return Math.max((totalBad + 1) / 2, maxFreqInBad);
    }
}
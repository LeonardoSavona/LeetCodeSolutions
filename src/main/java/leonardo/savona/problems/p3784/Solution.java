package leonardo.savona.problems.p3784;

import java.util.*;

class Solution {
    public static final String TITLE = "3784. Minimum Deletion Cost to Make All Characters Equal";

       public long minCost(String s, int[] cost) {
        Set<String> chars = new HashSet<>(Arrays.asList(s.split("")));
        long min = Long.MAX_VALUE;
        for (String ch : chars) {
            long cos = calcCost(s, cost, ch);
            if (cos >= 0 && cos < min) min = cos;
        }
        return min;
    }

    private long calcCost(String s, int[] cost, String ch) {
        long res = 0;
        for (int i=0, len=s.length(); i<len; i++) {
            int cos = cost[i];
            char c = s.charAt(i);
            if (ch.charAt(0) != c) res+=cos;
        }
        return res;
    }
}
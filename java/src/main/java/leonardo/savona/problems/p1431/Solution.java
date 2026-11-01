package leonardo.savona.problems.p1431;

import java.util.*;

class Solution {
    public static final String TITLE = "1431. Kids With the Greatest Number of Candies";

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int len = candies.length;
        List<Boolean> r = new ArrayList<>(len);
        int max = Integer.MIN_VALUE;
        for (int c : candies) {
            if (c > max) max = c;
        }
        for (int c : candies) {
            r.add(c + extraCandies >= max);
        }
        return r;
    }
    }
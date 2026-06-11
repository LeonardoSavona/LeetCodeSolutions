package leonardo.savona.problems.p1773;

import java.util.*;

class Solution {
    public static final String TITLE = "1773. Count Items Matching a Rule";

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int x = ruleKey.equals("type")
                ? 0
                : ruleKey.equals("color") ? 1 : 2;
        int res = 0;
        for (List<String> item : items) {
            if (item.get(x).equals(ruleValue)) res++;
        }
        return res;
    }
}
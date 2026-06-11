package leonardo.savona.problems.p3;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static final String TITLE = "3. Longest Substring Without Repeating Characters";

       public static int lengthOfLongestSubstring(String s) {
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        int len = s.length();
        int lastIdx = 0;
        for (int i=0; i<len; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.clear();
                i = lastIdx++;
            } else {
                map.put(c, 0);
            }
            res = Math.max(res, map.size());
        }
        return res;
    }
}
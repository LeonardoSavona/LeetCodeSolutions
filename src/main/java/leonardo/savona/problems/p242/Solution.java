package leonardo.savona.problems.p242;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static final String TITLE = "242. Valid Anagram";

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> occ = new HashMap<>();
        for (Character c : s.toCharArray()) {
            occ.compute(c, (k,v) -> v == null ? 1 : v+1);
        }

        for (Character c : t.toCharArray()) {
            Integer i = occ.get(c);
            if (i == null || i == 0) return false;
            occ.put(c, i-1);
        }
        return true;
    }
}
package leonardo.savona.problems.p2828;

import java.util.List;

class Solution {
    public static final String TITLE = "2828. Check if a String Is an Acronym of Words";

    public boolean isAcronym(List<String> words, String s) {
        int len = s.length();
        if (words.size() != len) return false;

        for (int i=0; i<len; i++) {
            if (words.get(i).charAt(0) != s.charAt(i)) return false;
        }
        return true;
    }
}
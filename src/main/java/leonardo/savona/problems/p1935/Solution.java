package leonardo.savona.problems.p1935;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static final String TITLE = "1935. Maximum Number of Words You Can Type";

    public int canBeTypedWords(String text, String brokenLetters) {
        Map<Character, Boolean> brokenLettersMap = new HashMap<>();
        for (char brokenLetter : brokenLetters.toCharArray()) {
            brokenLettersMap.put(brokenLetter, true);
        }

        int res = 1;
        for (int i=0, len=text.length(); i<len; i++) {
            char c = text.charAt(i);
            boolean isBroken = brokenLettersMap.getOrDefault(c, false);
            if (c == ' ') {
                res++;
            } else if (isBroken) {
                res--;
                i = text.indexOf(' ', i)-1;
                if (i < 0) break;
            }
        }

        return res;
    }
}
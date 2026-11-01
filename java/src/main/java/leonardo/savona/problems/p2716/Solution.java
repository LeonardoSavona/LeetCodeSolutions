package leonardo.savona.problems.p2716;

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public static final String TITLE = "2716. Minimize String Length";

    public int minimizedStringLength(String s) {
        int count = 0;
        boolean[] alphabet = new boolean[26];
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            boolean bool = alphabet[c - 'a'];
            if (!bool) {
                alphabet[c - 'a'] = true;
                count++;
            }
        }
        return count;
    }
}
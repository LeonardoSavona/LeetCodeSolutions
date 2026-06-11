package leonardo.savona.problems.p1859;

import java.util.*;
class Solution {
    public static final String TITLE = "1859. Sorting the Sentence";

    public String sortSentence(String s) {
        String[] res = new String[9];
        int lastIndex = 0;
        int len=s.length();
        for (int i=0; i<len; i++) {
            char c = s.charAt(i);
            if (c == ' '){
                res[s.charAt(i-1)-49] = s.substring(lastIndex, i-1);
                lastIndex = i+1;
            }
        }
        res[s.charAt(len-1)-49] = s.substring(lastIndex, len-1);

        StringJoiner stringJoiner = new StringJoiner(" ");
        for (String r : res) {
            if (r != null)
                stringJoiner.add(r);
        }
        return stringJoiner.toString();
    }
}
package leonardo.savona.problems.p2325;

import java.util.*;

class Solution {
    public static final String TITLE = "2325. Decode the Message";

    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        map.put(' ', ' ');
        char x='a';
        for (int i=0, len=key.length(); i<len && map.size() <= 26; i++) {
            char c = key.charAt(i);
            if (!map.containsKey(c))
                map.put(c, x++);
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0, len=message.length(); i<len; i++)
            sb.append(map.get(message.charAt(i)));
        return sb.toString();
    }
}
package leonardo.savona.problems.p13;

import java.util.*;

class Solution {
    public static final String TITLE = "13. Roman to Integer";

    public int romanToInt(String roman) {
        Map<Character, Integer> m = new HashMap<>();

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        
        int result = 0;
        
        for (int i = 0; i < roman.length(); i++) {
            if (i < roman.length()-1 && m.get(roman.charAt(i)) < m.get(roman.charAt(i+1))) {
                result -= m.get(roman.charAt(i));
            } else {
                result += m.get(roman.charAt(i));
            }
        }

        return result;
    }
}
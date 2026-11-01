package leonardo.savona.problems.p20;

import java.util.*;

class Solution {
    public static final String TITLE = "20. Valid Parentheses";

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i=0, len=s.length(); i<len; i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.add(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') return false;
            } else if (c == '}'){
                if (stack.isEmpty() || stack.pop() != '{') return false;
            }
        }
        return stack.isEmpty();
    }
}
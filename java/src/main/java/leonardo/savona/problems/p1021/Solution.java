package leonardo.savona.problems.p1021;

class Solution {
    public static final String TITLE = "1021. Remove Outermost Parentheses";

    public static String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int open = 1, close = 0;
        for (int i=1, len=s.length(); i<len; i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }

            if (open != close) {
                res.append(s.charAt(i));
            } else {
                open = 1;
                close = 0;
                i++;
            }
        }
        return res.toString();
    }
}
package leonardo.savona.problems.p1678;

class Solution {
    public static final String TITLE = "1678. Goal Parser Interpretation";

       public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i=0, len=command.length(); i<len;) {
            if (command.charAt(i) == '(') {
                if (command.charAt(i+1) == ')') {
                    sb.append('o');
                    i+=2;
                } else {
                    sb.append('a').append('l');
                    i+=4;
                }
            } else {
                sb.append('G');
                i++;
            }
        }
        return sb.toString();
    }
}
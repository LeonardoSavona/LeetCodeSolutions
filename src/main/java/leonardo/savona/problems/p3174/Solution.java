package leonardo.savona.problems.p3174;

class Solution {
    public static final String TITLE = "3174. Clear Digits";

    public String clearDigits(String s) {
        StringBuilder left = new StringBuilder();
        for (int i=0, len=s.length(); i<len; i++) {
            char c = s.charAt(i);

            if (!Character.isDigit(c)) {
                left.append(c);
            } else {
                left.deleteCharAt(left.length()-1);
            }
        }
        return left.toString();
    }
}
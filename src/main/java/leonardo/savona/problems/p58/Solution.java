package leonardo.savona.problems.p58;

class Solution {
    public static final String TITLE = "58. Length of Last Word";

    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) != ' ' ) {
                length++;
            } else if (length > 0) {
                return length;
            }
        }
        return length;
    }
}
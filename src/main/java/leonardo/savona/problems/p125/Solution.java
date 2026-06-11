package leonardo.savona.problems.p125;

class Solution {
    public static final String TITLE = "125. Valid Palindrome";

           public static boolean isPalindrome(String s) {
        int startIndex = 0;
        int endIndex = s.length() - 1;
        while (startIndex < endIndex) {
            char startC = s.charAt(startIndex);
            char endC = s.charAt(endIndex);
            if (!Character.isLetterOrDigit(startC)) {
                startIndex++;
            } else if (!Character.isLetterOrDigit(endC)) {
                endIndex--;
            } else if (Character.toLowerCase(startC) != Character.toLowerCase(endC)) {
                return false;
            } else {
                endIndex--;
                startIndex++;
            }
        }
        return true;
    }
}
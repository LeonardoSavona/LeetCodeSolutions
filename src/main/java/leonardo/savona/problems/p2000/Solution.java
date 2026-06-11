package leonardo.savona.problems.p2000;

class Solution {
    public static final String TITLE = "2000. Reverse Prefix of Word";

    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        StringBuilder sb = new StringBuilder();
        if (index != -1) {
            for (int i=index; i>=0; i--) {
                sb.append(word.charAt(i));
            }
            return sb.append(word.substring(index+1)).toString();
        } else {
            return word;
        }
    }
}
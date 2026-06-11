package leonardo.savona.problems.p1684;

class Solution {
    public static final String TITLE = "1684. Count the Number of Consistent Strings";

    public int countConsistentStrings(String allowed, String[] words) {
        int res=0;
        for (String word : words) {
            res++;
            for (int i=0, len=word.length(); i<len; i++) {
                if (allowed.indexOf(word.charAt(i)) == -1) {
                    res--;
                    break;
                }
            }
        }
        return res;
    }
}
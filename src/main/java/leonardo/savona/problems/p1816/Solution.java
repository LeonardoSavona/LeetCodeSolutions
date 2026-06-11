package leonardo.savona.problems.p1816;

class Solution {
    public static final String TITLE = "1816. Truncate Sentence";

     public String truncateSentence(String s, int k) {
        int x=0;
        for (int i=0, len=s.length(); i<len; i++) {
            if (s.charAt(i) == ' ' && ++x == k) 
                return s.substring(0, i);
        }
        return s;
    }
}
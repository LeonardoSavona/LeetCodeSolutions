package leonardo.savona.problems.p2114;

class Solution {
    public static final String TITLE = "2114. Maximum Number of Words Found in Sentences";

    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String s : sentences) {
            int words = 1;
            int index = -1;
            while ((index = s.indexOf(' ', index+1)) != -1) {
                words++;
            }
            max = Math.max(words, max);
        }
        return max;
    }
}
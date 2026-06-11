package leonardo.savona.problems.p3838;

class Solution {
    public static final String TITLE = "3838. Weighted Word Mapping";

        static String za = "zyxwvutsrqponmlkjihgfedcba";

    public static String mapWordWeights(String[] words, int[] weights) {
        int len = words.length;
        char[] res = new char[len];
        for (int j=0; j<len; j++) {
            String word = words[j];
            int weight = 0;
            for (int i=0, len2=word.length(); i<len2; i++) {
                weight += weights[word.charAt(i) - 'a'];
            }
            res[j] = za.charAt(weight % 26);
        }

        return new String(res);
    }
}
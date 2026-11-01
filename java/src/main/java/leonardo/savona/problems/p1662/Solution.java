package leonardo.savona.problems.p1662;

class Solution {
    public static final String TITLE = "1662. Check If Two String Arrays are Equivalent";

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        char[] chars = new char[1000];
        int x = 0;
        for (String s : word1) {
            for (int i=0, len=s.length(); i<len; i++) {
                chars[x++] = s.charAt(i);
            }
        }

        int y = 0;
        for (String s : word2) {
            for (int i=0, len=s.length(); i<len; i++) {
                if (chars[y++] != s.charAt(i)) return false;
            }
        }
        return y == x;
    }
}
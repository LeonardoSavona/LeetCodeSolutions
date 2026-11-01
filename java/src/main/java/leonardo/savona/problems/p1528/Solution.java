package leonardo.savona.problems.p1528;

class Solution {
    public static final String TITLE = "1528. Shuffle String";

    public String restoreString(String s, int[] indices) {
        int len = s.length();
        char[] res = new char[len];
        for (int i=0; i<len; i++) {
            res[indices[i]] = s.charAt(i);
        }
        return new String(res);
    }
}
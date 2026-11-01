package leonardo.savona.problems.p3498;

class Solution {
    public static final String TITLE = "3498. Reverse Degree of a String";

    public int reverseDegree(String s) {
        int res = 0;
        for (int i=0, len=s.length(); i<len; i++) {
            char c = s.charAt(i);
            res += (i+1)*('z'-c+1);
        }
        return res;
    }
}
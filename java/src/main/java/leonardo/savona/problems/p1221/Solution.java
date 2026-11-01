package leonardo.savona.problems.p1221;

class Solution {
    public static final String TITLE = "1221. Split a String in Balanced Strings";

    public int balancedStringSplit(String s) {
        int res = 0;
        char r = 'R';
        int rCount=0, lCount = 0;
        for (int i=0, len=s.length(); i<len; i++) {
            if (s.charAt(i) == r) rCount++;
            else lCount++;

            if (lCount == rCount) {
                rCount = 0;
                lCount = 0;
                res++;
            }
        }
        return Math.max(res, 1);
    }
}
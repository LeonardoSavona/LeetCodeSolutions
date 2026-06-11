package leonardo.savona.problems.p3760;

class Solution {
    public static final String TITLE = "3760. Maximum Substrings With Distinct Start";

    public static int maxDistinct(String s) {
        int res = 0;
        int x = 0;
        for (int i=0, len=s.length(); i<len; i++){
            int tmp = 1 << (s.charAt(i) - 'a');
            if ((x & tmp) == 0)
                res++;
            x |= tmp;
        }
        return res;
    }
}
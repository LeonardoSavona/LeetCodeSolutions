package leonardo.savona.problems.p944;

class Solution {
    public static final String TITLE = "944. Delete Columns to Make Sorted";

    public int minDeletionSize(String[] strs) {
        int res = 0;
        for (int i=0, lenw=strs[0].length(); i<lenw; i++) {
            for (int j=0, len=strs.length-1; j<len; j++) {
                if (!(strs[j].charAt(i)-'a' <= strs[j+1].charAt(i)-'a')) {
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}
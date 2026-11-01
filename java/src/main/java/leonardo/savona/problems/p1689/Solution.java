package leonardo.savona.problems.p1689;

class Solution {
    public static final String TITLE = "1689. Partitioning Into Minimum Number Of Deci-Binary Numbers";

   
    public int minPartitions(String n) {
        int max = 0;
        for (int i=0,len=n.length(); i<len; i++) {
            int val = n.charAt(i) - '0';
            if (val == 9) return 9;
            if (val > max) {
                max = val;
            }
        }
        return max;
    }
}
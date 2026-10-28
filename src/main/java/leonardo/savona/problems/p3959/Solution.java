package leonardo.savona.problems.p3959;

class Solution {
    public static final String TITLE = "3959. Check Good Integer";

    public boolean checkGoodInteger(int n) {
        int res = 0;
        while (n > 0) {
            int v = n % 10;
            res += v*(v - 1);
            n /= 10;
        }
        return res >= 50;
    }
}
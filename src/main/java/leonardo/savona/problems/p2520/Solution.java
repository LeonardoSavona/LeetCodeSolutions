package leonardo.savona.problems.p2520;

class Solution {
    public static final String TITLE = "2520. Count the Digits That Divide a Number";

    public int countDigits(int num) {
        int res = 0;
        int newNum = num;
        while (newNum > 0) {
            res += num % (newNum % 10) == 0 ? 1 : 0;
            newNum /= 10;
        }
        return res;
    }
}
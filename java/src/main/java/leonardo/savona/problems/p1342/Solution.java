package leonardo.savona.problems.p1342;

class Solution {
    public static final String TITLE = "1342. Number of Steps to Reduce a Number to Zero";

    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            int mod = num % 2;
            num = mod == 0 ? num / 2 : num - 1;
            steps++;
        }
        return steps;
    }
}
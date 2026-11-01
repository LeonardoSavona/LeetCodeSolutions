package leonardo.savona.problems.p509;

class Solution {
    public static final String TITLE = "509. Fibonacci Number";

    public int fib(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;

        int f0 = 0;
        int f1 = 1;
        for (int i=2; i<=n; i++) {
            int tmp = f1;
            f1 = tmp+f0;
            f0 = tmp;
        }

        return f1;
    }
}
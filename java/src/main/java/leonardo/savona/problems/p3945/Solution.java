package leonardo.savona.problems.p3945;

class Solution {
    public static final String TITLE = "3945. Digit Frequency Score";

    public int digitFrequencyScore(int n) {
        int[] cifre = new int[10];
        while (n > 0) {
            int resto = n % 10;
            cifre[resto] += resto;
            n /= 10;
        }
        int sum = 0;
        for (int i : cifre) {
            sum += i;
        }
        return sum;
    }
}
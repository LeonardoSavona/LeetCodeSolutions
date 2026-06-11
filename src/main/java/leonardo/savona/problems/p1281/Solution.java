package leonardo.savona.problems.p1281;

class Solution {
    public static final String TITLE = "1281. Subtract the Product and Sum of Digits of an Integer";

     public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        do {
            int c = n % 10;
            product *= c;
            sum += c;
            n /= 10;
        } while (n > 0);
        return product - sum;
    }
}
package leonardo.savona.problems.p7;

class Solution {
    public static final String TITLE = "7. Reverse Integer";

       public int reverse(int x) {
               if (x >= -9 && x <= 9) return x;

        int n = x/10;
        int d = 1;
        while(n != 0) {
            n /= 10;
            d *= 10;
        }

        long result = 0;
        while(x != 0) {
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) return 0;
            result += (long) (x % 10) * d;
            x /= 10;
            d /= 10;
        }
        return (int) result;
    }
}
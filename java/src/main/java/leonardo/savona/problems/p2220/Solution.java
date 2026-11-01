package leonardo.savona.problems.p2220;

class Solution {
    public static final String TITLE = "2220. Minimum Bit Flips to Convert Number";

    public int minBitFlips(int start, int goal) {
                int x = start ^ goal;
        int sum = 0;
        while (x != 0) {
            int b = x & 1;
            if (b == 1) sum++;
            x = x >> 1;
        }
        return sum;
    }
}
package leonardo.savona.problems.p1688;

class Solution {
    public static final String TITLE = "1688. Count of Matches in Tournament";

    public int numberOfMatches(int n) {
        if (n <= 2) return n-1;
        int res = n % 2;
        n = (n - res) / 2;
        return numberOfMatches(n+res) + n;
    }
}
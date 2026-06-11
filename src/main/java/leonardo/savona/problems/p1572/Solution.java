package leonardo.savona.problems.p1572;

class Solution {
    public static final String TITLE = "1572. Matrix Diagonal Sum";

    public int diagonalSum(int[][] mat) {
        int res = 0;
        int colStart = 0;
        int colEnd = mat[0].length - 1;
        for (int[] rows : mat) {
            res += rows[colStart];
            if (colStart != colEnd)
                res += rows[colEnd];
            colStart++;
            colEnd--;
        }
        return res;
    }
}
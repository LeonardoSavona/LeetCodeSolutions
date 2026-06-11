package leonardo.savona.problems.p48;

class Solution {
    public static final String TITLE = "48. Rotate Image";

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] res = new int[n][n];
        for (int x=0; x<n; x++) {
            for (int y=0; y<n; y++) {
                res[x][y] = matrix[n-1-y][x];
            }
        }
        for (int x=0; x<n; x++) {
            System.arraycopy(res[x], 0, matrix[x], 0, n);
        }
    }
}
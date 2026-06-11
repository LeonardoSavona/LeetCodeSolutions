package leonardo.savona.problems.p2482;

class Solution {
    public static final String TITLE = "2482. Difference Between Ones and Zeros in Row and Column";

    public int[][] onesMinusZeros(int[][] grid) {
        int rowsLen = grid.length;
        int colsLen = grid[0].length;

        int[] rows2 = new int[rowsLen];
        int[] cols2 = new int[colsLen];

        for (int i=0; i<rowsLen; i++) {
            for (int j=0; j<colsLen; j++) {
                int val = grid[i][j] == 1 ? 1 : -1;
                rows2[i] += val;
                cols2[j] += val;
            }
        }

        for (int i=0; i<rowsLen; i++) {
            for (int j=0; j<colsLen; j++) {
                grid[i][j] = rows2[i] + cols2[j];
            }
        }
        return grid;
    }
}
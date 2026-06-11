package leonardo.savona.problems.p3898;

class Solution {
    public static final String TITLE = "3898. Find the Degree of Each Vertex";

       public static int[] findDegrees(int[][] matrix) {
        int matrixLen = matrix.length;
        int[] res = new int[matrixLen];
        for (int i=0; i<matrixLen; i++) {
            for (int j=0, len=matrix[0].length; j<len; j++) {
                    res[i] += matrix[i][j];
            }
        }
        return res;
    }
}
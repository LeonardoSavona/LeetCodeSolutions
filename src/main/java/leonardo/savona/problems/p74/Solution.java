package leonardo.savona.problems.p74;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        int idxEnd = matrix.length-1;
        int idxStart = 0;
        while(idxStart <= idxEnd) {
            int half = (idxStart+idxEnd) / 2;
            int[] row = matrix[half];
            if (row[0] <= target) {
                int endidx = row.length-1;
                if (target <= row[endidx]) {
                    int startidx = 0;
                    while (startidx <= endidx) {
                        int halfrow = (startidx+endidx) / 2;
                        if (row[halfrow] == target) {
                            return true;
                        } else if (row[halfrow] > target) {
                            endidx = halfrow-1;
                        } else {
                            startidx = halfrow+1;
                        }
                    }
                    return false;
                } else {
                    idxStart = half+1;
                }
            } else {
                idxEnd = half-1;
            }
        }
        return false;
    }
}
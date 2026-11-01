package leonardo.savona.problems.p118;

import java.util.*;

class Solution {
    public static final String TITLE = "118. Pascal's Triangle";

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> rowResult = new ArrayList<>();
        rowResult.add(1);
        result.add(rowResult);

        if (numRows == 1) {
            return result;
        } else {
            rowResult = new ArrayList<>(rowResult);
            rowResult.add(1);
            result.add(rowResult);

            for (int i = 2; i < numRows; i++){
                List<Integer> newRowResult = new ArrayList<>(rowResult);
                for (int c = 1; c < result.get(i-1).size(); c++) {
                    int sum = result.get(i-1).get(c) + result.get(i-1).get(c-1);
                    newRowResult.add(c, sum);
                }
                result.add(newRowResult);
            }
        }
        return result;
    }
}
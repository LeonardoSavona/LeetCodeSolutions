package leonardo.savona.problems.p119;

import java.util.*;

class Solution {
    public static final String TITLE = "119. Pascal's Triangle II";

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>(rowIndex+1);
        for (int i=0; i<=rowIndex; i++) {
            result = pascal(result, i);
        }
        return result;
    }

    private List<Integer> pascal(List<Integer> list, int index) {
        if (index == 0) return Collections.singletonList(1);
        if (index == 1) return Arrays.asList(1,1);

        List<Integer> result = new ArrayList<>(index+1);
        result.add(1);
        for (int i = 1; i < index; i++) {
            result.add(list.get(i-1) + list.get(i));
        }
        result.add(1);
        return result;
    }
}
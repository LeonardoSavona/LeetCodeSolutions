package leonardo.savona.problems.p728;

import java.util.*;

class Solution {
    public static final String TITLE = "728. Self Dividing Numbers";

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        while (left<=right) {

            int a = left;
            boolean condition = true;
            while (a > 0) {
                int cifra = a % 10;
                if (cifra == 0 || left % cifra != 0) {
                    condition = false;
                    break;
                }
                a /= 10;
            }

            if (condition) result.add(left);
            left++;
        }
        return result;
    }
}
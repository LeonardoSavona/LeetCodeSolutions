package leonardo.savona.problems.p771;

import java.util.*;

class Solution {
    public static final String TITLE = "771. Jewels and Stones";

    public int numJewelsInStones(String jewels, String stones) {
        int c = 0;
        stones = stones.replaceAll(String.join("|", jewels.split("")), "_");
        for (String s : stones.split("")) {
            if (Objects.equals(s, "_")) {
                c++;
            }
        }
        return c;
    }
}
package leonardo.savona.problems.p1672;

import java.util.*;

class Solution {
    public static final String TITLE = "1672. Richest Customer Wealth";

    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = Arrays.stream(accounts[i]).sum();
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
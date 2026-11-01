package leonardo.savona.problems.p2610;

import java.util.*;

class Solution {
    public static final String TITLE = "2610. Convert an Array Into a 2D Array With Conditions";

    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int[] freq = new int[nums.length + 1];
        for (int n : nums) {
            int row = freq[n]++;
            if (row == res.size()) {
                res.add(new ArrayList<>());
            }
            res.get(row).add(n);
        }
        return res;
    }
}
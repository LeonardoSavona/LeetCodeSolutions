package leonardo.savona.problems.p78;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static final String TITLE = "78. Subsets";

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> partial = new ArrayList<>();
        int n = nums.length;

        bk(0, n, partial, res, nums);
        return res;
    }

    private void bk(int idx, int n, List<Integer> partial, List<List<Integer>> result, int[] nums) {
        result.add(new ArrayList<>(partial));
        for (int i=idx; i<n; i++) {
            partial.add(nums[i]);
            bk(i+1, n, partial, result, nums);
            partial.removeLast();
        }
    }
}
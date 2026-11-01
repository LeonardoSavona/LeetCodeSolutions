package leonardo.savona.problems.p199;

import leonardo.savona.problems.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static final String TITLE = "199. Binary Tree Right Side View";

    public List<Integer> rightSideView(TreeNode root) {
        return rightSideView(root, new ArrayList<>(), 0);
    }

    private List<Integer> rightSideView(TreeNode root, List<Integer> list, int level) {
        if (root == null) return list;
        if (list.size() == level)
            list.add(root.val);

        rightSideView(root.right, list, level + 1);
        rightSideView(root.left, list, level + 1);
        return list;
    }
}
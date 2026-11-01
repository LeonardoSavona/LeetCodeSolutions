package leonardo.savona.problems.p700;

import leonardo.savona.problems.common.TreeNode;

class Solution {
    public static final String TITLE = "700. Search in a Binary Search Tree";

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        int v = root.val;
        if (v == val) return root;
        return v > val
                ? searchBST(root.left, val)
                : searchBST(root.right, val);
    }
}
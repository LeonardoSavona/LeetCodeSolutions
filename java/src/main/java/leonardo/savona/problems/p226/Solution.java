package leonardo.savona.problems.p226;

import leonardo.savona.problems.common.TreeNode;

class Solution {
    public static final String TITLE = "226. Invert Binary Tree";

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode left = root.left;
        TreeNode right = root.right;
        if (left == null && right == null) return root;

        root.left = invertTree(right);
        root.right = invertTree(left);
        return root;
    }
}
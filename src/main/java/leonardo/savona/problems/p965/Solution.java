package leonardo.savona.problems.p965;

import leonardo.savona.problems.common.TreeNode;

class Solution {
    public static final String TITLE = "965. Univalued Binary Tree";

    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return true;

        TreeNode left = root.left;
        TreeNode right = root.right;
        if ((left != null && root.val != left.val) || (right != null && root.val != right.val))  {
            return false;
        }
        return isUnivalTree(left) && isUnivalTree(right);
    }
}
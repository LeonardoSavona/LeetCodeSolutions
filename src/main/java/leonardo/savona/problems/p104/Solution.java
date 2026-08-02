package leonardo.savona.problems.p104;

import leonardo.savona.problems.common.TreeNode;

class Solution {
    public static final String TITLE = "104. Maximum Depth of Binary Tree";

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return Math.max(maxDepth(root.left)+1, maxDepth(root.right)+1);
    }
}
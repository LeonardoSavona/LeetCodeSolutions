package leonardo.savona.problems.p2331;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static final String TITLE = "2331. Evaluate Boolean Binary Tree";

    public boolean evaluateTree(TreeNode root) {
        int val = root.val;
        if (val < 2) return val == 1;

        boolean leftVal = evaluateTree(root.left);
        boolean rightVal = evaluateTree(root.right);

        return val == 2 ? leftVal || rightVal : leftVal && rightVal;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
package leonardo.savona.problems.p938;

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
    public static final String TITLE = "938. Range Sum of BST";

     public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;

        int sum = rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        int v = root.val;
        if (v >= low && v <= high) return sum+v;
        return sum;
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
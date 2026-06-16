package leonardo.savona.problems.p1448;

class Solution {

    public static final String TITLE = "1448. Count Good Nodes in Binary Tree";

    public int goodNodes(TreeNode root) {
        return 1 + goodNodes(root, root.val);
    }

    private int goodNodes(TreeNode root, int max) {
        if (root == null) return 0;
        int res = 0;
        max = Math.max(max, root.val);

        TreeNode left = root.left;
        if (left != null && left.val >= max) res++;

        TreeNode right = root.right;
        if (right != null && right.val >= max) res++;

        return res + goodNodes(left, max) + goodNodes(right, max);
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
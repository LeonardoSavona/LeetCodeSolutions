package leonardo.savona.problems.p226;

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
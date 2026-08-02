package leonardo.savona.problems.p2236;

import leonardo.savona.problems.common.TreeNode;

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
    public static final String TITLE = "2236. Root Equals Sum of Children";

    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}
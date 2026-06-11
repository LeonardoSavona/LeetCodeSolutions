package leonardo.savona.problems.p1161;

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
    public static final String TITLE = "1161. Maximum Level Sum of a Binary Tree";

 public static int maxLevelSum(TreeNode root) {
        long[] arr = new long[10_000];
        int mL = maxLevelSum(arr, root, 0, 0);
        int maxLevel = 0;
        long maxSum = Long.MIN_VALUE;
        for (int i=0; i<mL; i++) {
            long val = arr[i];
            if (val > maxSum) {
                maxSum = val;
                maxLevel = i;
            }
        }

        return maxLevel+1;
    }

    private static int maxLevelSum(long[] arr, TreeNode node, int level, int maxLevel) {
        if (node == null) return level;
        arr[level] = arr[level] + node.val;
        maxLevel = Math.max(maxLevel, maxLevelSum(arr, node.left, level+1, maxLevel));
        maxLevel = Math.max(maxLevel, maxLevelSum(arr, node.right, level+1, maxLevel));
        return maxLevel;
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
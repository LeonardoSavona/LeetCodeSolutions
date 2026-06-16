package leonardo.savona.problems.p199;

import java.awt.datatransfer.FlavorEvent;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public static final String TITLE = "199. Binary Tree Right Side View";

    public List<Integer> rightSideView(TreeNode root) {
        return rightSideView(root, new ArrayList<>(), 0);
    }

    private List<Integer> rightSideView(TreeNode root, List<Integer> list, int level) {
        if (root == null) return list;
        if (list.size() == level)
            list.add(root.val);

        rightSideView(root.right, list, level + 1);
        rightSideView(root.left, list, level + 1);
        return list;
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
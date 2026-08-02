package leonardo.savona.problems.p144;

import leonardo.savona.problems.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static final String TITLE = "144. Binary Tree Preorder Traversal";

    public List<Integer> preorderTraversal(TreeNode root) {
        return preorderTraversal(new ArrayList<>(), root);
    }

    public List<Integer> preorderTraversal(List<Integer> list, TreeNode root) {
        if (root == null) return list;
        list.add(root.val);
        preorderTraversal(list, root.left);
        preorderTraversal(list, root.right);
        return list;
    }
}
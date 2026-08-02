package leonardo.savona.problems.p94;

import leonardo.savona.problems.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static final String TITLE = "94. Binary Tree Inorder Traversal";

    public List<Integer> inorderTraversal(TreeNode root) {
        return inorderTraversal(new ArrayList<>(), root);
    }

    public List<Integer> inorderTraversal(List<Integer> list, TreeNode root) {
        if (root == null) return list;

        inorderTraversal(list, root.left);
        list.add(root.val);

        inorderTraversal(list, root.right);

        return list;
    }
}
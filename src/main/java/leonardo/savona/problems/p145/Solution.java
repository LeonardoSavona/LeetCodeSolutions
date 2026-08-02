package leonardo.savona.problems.p145;

import leonardo.savona.problems.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static final String TITLE = "145. Binary Tree Postorder Traversal";

    public List<Integer> postorderTraversal(TreeNode root) {
        return postorderTraversal(new ArrayList<>(), root);
    }

    public List<Integer> postorderTraversal(List<Integer> list, TreeNode root) {
        if (root == null) return list;

        postorderTraversal(list, root.left);
        postorderTraversal(list, root.right);
        list.add(root.val);

        return list;
    }
}
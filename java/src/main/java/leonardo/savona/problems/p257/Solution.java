package leonardo.savona.problems.p257;

import leonardo.savona.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static final String TITLE = "257. Binary Tree Paths";

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null)
            bk(root, result, new StringBuilder().append(root.val));
        return result;
    }

    public void bk(TreeNode node, List<String> result, StringBuilder stringBuilder) {
        if (node.left == null && node.right == null) {
            result.add(stringBuilder.toString());
            return;
        }
        int len = stringBuilder.length();
        if (node.left != null)  {
            stringBuilder.append("->").append(node.left.val);
            bk(node.left, result, stringBuilder);
            stringBuilder.setLength(len);
        }
        if (node.right != null) {
            stringBuilder.append("->").append(node.right.val);
            bk(node.right, result, stringBuilder);
            stringBuilder.setLength(len);
        }
    }
}
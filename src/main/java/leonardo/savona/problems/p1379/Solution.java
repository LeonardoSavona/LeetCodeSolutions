package leonardo.savona.problems.p1379;

import leonardo.savona.problems.common.TreeNode;

class Solution {
    public static final String TITLE = "1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree";

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null) return null;
        if (original == target) return cloned;

        TreeNode origRight = getTargetCopy(original.right, cloned.right, target);
        if (origRight != null) return origRight;

        return getTargetCopy(original.left, cloned.left, target);
    }
}
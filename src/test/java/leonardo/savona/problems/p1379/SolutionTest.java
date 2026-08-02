package leonardo.savona.problems.p1379;

import leonardo.savona.base.BaseTest;
import leonardo.savona.problems.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    private TreeNode node(int val) {
        return new TreeNode(val);
    }

    private TreeNode node(int val, TreeNode left, TreeNode right) {
        return new TreeNode(val, left, right);
    }

    /** Deep copy, so the clone shares values with the original but no references. */
    private TreeNode copy(TreeNode root) {
        if (root == null) return null;
        return new TreeNode(root.val, copy(root.left), copy(root.right));
    }

    @Test
    void getTargetCopy_rootIsTarget() {
        TreeNode original = node(7, node(4), node(3));
        TreeNode cloned = copy(original);
        assertSame(cloned, solution.getTargetCopy(original, cloned, original));
    }

    @Test
    void getTargetCopy_targetInLeftSubtree() {
        TreeNode original = node(7, node(4), node(3, node(6), node(19)));
        TreeNode cloned = copy(original);
        TreeNode result = solution.getTargetCopy(original, cloned, original.left);
        assertSame(cloned.left, result);
        assertEquals(4, result.val);
    }

    @Test
    void getTargetCopy_targetInRightSubtree() {
        TreeNode original = node(7, node(4), node(3, node(6), node(19)));
        TreeNode cloned = copy(original);
        TreeNode result = solution.getTargetCopy(original, cloned, original.right.right);
        assertSame(cloned.right.right, result);
        assertEquals(19, result.val);
    }

    @Test
    void getTargetCopy_singleNodeTree() {
        TreeNode original = node(8);
        TreeNode cloned = copy(original);
        assertSame(cloned, solution.getTargetCopy(original, cloned, original));
    }

    @Test
    void getTargetCopy_returnsCloneNotOriginal() {
        TreeNode original = node(1, node(2), node(3));
        TreeNode cloned = copy(original);
        TreeNode result = solution.getTargetCopy(original, cloned, original.left);
        assertNotSame(original.left, result);
        assertSame(cloned.left, result);
    }

    @Test
    void getTargetCopy_duplicateValuesPickTheRightNode() {
        // both children hold 5: only the reference tells them apart
        TreeNode original = node(1, node(5), node(5));
        TreeNode cloned = copy(original);
        assertSame(cloned.right, solution.getTargetCopy(original, cloned, original.right));
    }
}

package leonardo.savona.problems.p110;

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

    @Test
    void isBalanced_null() {
        assertTrue(solution.isBalanced(null));
    }

    @Test
    void isBalanced_single() {
        assertTrue(solution.isBalanced(node(1)));
    }

    @Test
    void isBalanced_example1() {
        // [3, 9, 20, null, null, 15, 7] -> balanced
        TreeNode root = node(3,
                node(9),
                node(20, node(15), node(7)));
        assertTrue(solution.isBalanced(root));
    }

    @Test
    void isBalanced_example2() {
        // [1, 2, 2, 3, 3, null, null, 4, 4] -> not balanced
        TreeNode root = node(1,
                node(2,
                        node(3, node(4), node(4)),
                        node(3)),
                node(2));
        assertFalse(solution.isBalanced(root));
    }

    @Test
    void isBalanced_twoNodes_left() {
        assertTrue(solution.isBalanced(node(1, node(2), null)));
    }

    @Test
    void isBalanced_twoNodes_right() {
        assertTrue(solution.isBalanced(node(1, null, node(2))));
    }

    @Test
    void isBalanced_leftSpine_depth3() {
        // 1 -> 2 -> 3 left spine -> not balanced
        TreeNode root = node(1, node(2, node(3), null), null);
        assertFalse(solution.isBalanced(root));
    }

    @Test
    void isBalanced_rightSpine_depth3() {
        // 1 -> 2 -> 3 right spine -> not balanced
        TreeNode root = node(1, null, node(2, null, node(3)));
        assertFalse(solution.isBalanced(root));
    }

    @Test
    void isBalanced_perfectTree() {
        TreeNode root = node(1,
                node(2, node(4), node(5)),
                node(3, node(6), node(7)));
        assertTrue(solution.isBalanced(root));
    }

    @Test
    void isBalanced_unbalancedDeepInSubtree() {
        // root heights differ by 1, but left subtree itself is unbalanced
        TreeNode root = node(1,
                node(2,
                        node(3, node(4, node(5), null), null),
                        null),
                node(6));
        assertFalse(solution.isBalanced(root));
    }

    @Test
    void isBalanced_heightDiffExactlyOne() {
        // left height 2, right height 1 -> balanced
        TreeNode root = node(1,
                node(2, node(3), null),
                node(4));
        assertTrue(solution.isBalanced(root));
    }
}

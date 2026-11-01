package leonardo.savona.problems.p100;

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
    void isSameTree_bothNull() {
        assertTrue(solution.isSameTree(null, null));
    }

    @Test
    void isSameTree_oneNull() {
        assertFalse(solution.isSameTree(node(1), null));
        assertFalse(solution.isSameTree(null, node(1)));
    }

    @Test
    void isSameTree_identicalTrees() {
        // [1, 2, 3] vs [1, 2, 3]
        assertTrue(solution.isSameTree(
                node(1, node(2), node(3)),
                node(1, node(2), node(3))));
    }

    @Test
    void isSameTree_differentValues() {
        // [1, 2, 1] vs [1, 1, 2]
        assertFalse(solution.isSameTree(
                node(1, node(2), node(1)),
                node(1, node(1), node(2))));
    }

    @Test
    void isSameTree_differentShape() {
        // [1, 2] vs [1, null, 2]
        assertFalse(solution.isSameTree(
                node(1, node(2), null),
                node(1, null, node(2))));
    }

    @Test
    void isSameTree_deepDifference() {
        TreeNode a = node(1, node(2, node(4), null), node(3));
        TreeNode b = node(1, node(2, null, node(4)), node(3));
        assertFalse(solution.isSameTree(a, b));
    }
}

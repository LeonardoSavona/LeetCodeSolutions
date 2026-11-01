package leonardo.savona.problems.p965;

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
    void isUnivalTree_null() {
        assertTrue(solution.isUnivalTree(null));
    }

    @Test
    void isUnivalTree_singleNode() {
        assertTrue(solution.isUnivalTree(node(1)));
    }

    @Test
    void isUnivalTree_example() {
        // [1, 1, 1, 1, 1, null, 1]
        TreeNode root = node(1,
                node(1, node(1), node(1)),
                node(1, null, node(1)));
        assertTrue(solution.isUnivalTree(root));
    }

    @Test
    void isUnivalTree_differentValue() {
        // [2, 2, 2, 5, 2]
        TreeNode root = node(2,
                node(2, node(5), node(2)),
                node(2));
        assertFalse(solution.isUnivalTree(root));
    }

    @Test
    void isUnivalTree_differenceAtRoot() {
        assertFalse(solution.isUnivalTree(node(1, node(1), node(2))));
    }

    @Test
    void isUnivalTree_deepDifference() {
        // the odd value sits three levels down
        TreeNode root = node(3,
                node(3, node(3, node(4), null), node(3)),
                node(3));
        assertFalse(solution.isUnivalTree(root));
    }
}

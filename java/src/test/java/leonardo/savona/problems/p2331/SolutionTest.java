package leonardo.savona.problems.p2331;

import leonardo.savona.base.BaseTest;
import leonardo.savona.problems.common.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    private TreeNode node(int val) { return new TreeNode(val); }
    private TreeNode node(int val, TreeNode l, TreeNode r) { return new TreeNode(val, l, r); }

    @Test
    void evaluateTree_leafTrue() {
        TreeNode root = node(1);
        assertTrue(solution.evaluateTree(root));
    }

    @Test
    void evaluateTree_leafFalse() {
        TreeNode root = node(0);
        assertFalse(solution.evaluateTree(root));
    }

    @Test
    void evaluateTree_orNodeBothTrue() {
        TreeNode root = node(2, node(1), node(1));
        assertTrue(solution.evaluateTree(root));
    }

    @Test
    void evaluateTree_orNodeOneFalse() {
        TreeNode root = node(2, node(0), node(0));
        assertFalse(solution.evaluateTree(root));
    }

    @Test
    void evaluateTree_andNodeBothTrue() {
        TreeNode root = node(3, node(1), node(1));
        assertTrue(solution.evaluateTree(root));
    }

    @Test
    void evaluateTree_complexTree() {
        TreeNode root = node(2,
            node(1),
            node(3, node(0), node(1))
        );
        assertTrue(solution.evaluateTree(root));
    }
}

package leonardo.savona.problems.p2331;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    private Solution.TreeNode node(int val) { return solution.new TreeNode(val); }
    private Solution.TreeNode node(int val, Solution.TreeNode l, Solution.TreeNode r) { return solution.new TreeNode(val, l, r); }

    @Test
    void evaluateTree_leafTrue() {
        Solution.TreeNode root = node(1);
        assertTrue(solution.evaluateTree(root));
    }

    @Test
    void evaluateTree_leafFalse() {
        Solution.TreeNode root = node(0);
        assertFalse(solution.evaluateTree(root));
    }

    @Test
    void evaluateTree_orNodeBothTrue() {
        Solution.TreeNode root = node(2, node(1), node(1));
        assertTrue(solution.evaluateTree(root));
    }

    @Test
    void evaluateTree_orNodeOneFalse() {
        Solution.TreeNode root = node(2, node(0), node(0));
        assertFalse(solution.evaluateTree(root));
    }

    @Test
    void evaluateTree_andNodeBothTrue() {
        Solution.TreeNode root = node(3, node(1), node(1));
        assertTrue(solution.evaluateTree(root));
    }

    @Test
    void evaluateTree_complexTree() {
        Solution.TreeNode root = node(2,
            node(1),
            node(3, node(0), node(1))
        );
        assertTrue(solution.evaluateTree(root));
    }
}

package leonardo.savona.problems.p1448;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    private Solution.TreeNode node(int val) { return solution.new TreeNode(val); }
    private Solution.TreeNode node(int val, Solution.TreeNode l, Solution.TreeNode r) { return solution.new TreeNode(val, l, r); }

    @Test
    void goodNodes_singleNode() {
        assertEquals(1, solution.goodNodes(node(1)));
    }

    @Test
    void goodNodes_example1() {
        Solution.TreeNode root = node(3,
                node(1, node(3), null),
                node(4, node(1), node(5)));
        assertEquals(4, solution.goodNodes(root));
    }

    @Test
    void goodNodes_example2() {
        Solution.TreeNode root = node(3,
                node(3, node(4), node(2)),
                null);
        assertEquals(3, solution.goodNodes(root));
    }

    @Test
    void goodNodes_allIncreasing() {
        Solution.TreeNode root = node(1, null, node(2, null, node(3)));
        assertEquals(3, solution.goodNodes(root));
    }

    @Test
    void goodNodes_allDecreasing() {
        Solution.TreeNode root = node(3, node(2, node(1), null), null);
        assertEquals(1, solution.goodNodes(root));
    }

    @Test
    void goodNodes_equalValues() {
        Solution.TreeNode root = node(2, node(2), node(2));
        assertEquals(3, solution.goodNodes(root));
    }

    @Test
    void goodNodes_negativeValues() {
        Solution.TreeNode root = node(-1,
                node(-2, node(-3), null),
                node(0));
        assertEquals(2, solution.goodNodes(root));
    }
}

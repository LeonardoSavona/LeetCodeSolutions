package leonardo.savona.problems.p104;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    private Solution.TreeNode node(int val) {
        return solution.new TreeNode(val);
    }

    private Solution.TreeNode node(int val, Solution.TreeNode left, Solution.TreeNode right) {
        return solution.new TreeNode(val, left, right);
    }

    @Test
    void maxDepth_null() {
        assertEquals(0, solution.maxDepth(null));
    }

    @Test
    void maxDepth_single() {
        assertEquals(1, solution.maxDepth(node(1)));
    }

    @Test
    void maxDepth_balanced() {
        // [3, 9, 20, null, null, 15, 7] → depth 3
        Solution.TreeNode root = node(3,
                node(9),
                node(20, node(15), node(7)));
        assertEquals(3, solution.maxDepth(root));
    }

    @Test
    void maxDepth_left_skewed() {
        // 1 → 2 → 3 (left spine) → depth 3
        Solution.TreeNode root = node(1, node(2, node(3), null), null);
        assertEquals(3, solution.maxDepth(root));
    }

    @Test
    void maxDepth_right_skewed() {
        // 1 → 2 → 3 (right spine) → depth 3
        Solution.TreeNode root = node(1, null, node(2, null, node(3)));
        assertEquals(3, solution.maxDepth(root));
    }

    @Test
    void maxDepth_unbalanced() {
        // left depth 3, right depth 1 → max 3
        Solution.TreeNode root = node(1,
                node(2, node(4, node(8), null), node(5)),
                node(3));
        assertEquals(4, solution.maxDepth(root));
    }
}

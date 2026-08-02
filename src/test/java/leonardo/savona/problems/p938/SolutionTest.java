package leonardo.savona.problems.p938;

import leonardo.savona.base.BaseTest;
import leonardo.savona.problems.common.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    private TreeNode node(int val) { return new TreeNode(val); }
    private TreeNode node(int val, TreeNode l, TreeNode r) { return new TreeNode(val, l, r); }

    @Test
    void rangeSumBST_nullRoot() {
        assertEquals(0, solution.rangeSumBST(null, 7, 15));
    }

    @Test
    void rangeSumBST_singleNodeInRange() {
        TreeNode root = node(10);
        assertEquals(10, solution.rangeSumBST(root, 5, 15));
    }

    @Test
    void rangeSumBST_singleNodeOutOfRange() {
        TreeNode root = node(3);
        assertEquals(0, solution.rangeSumBST(root, 5, 15));
    }

    @Test
    void rangeSumBST_typicalTree() {
        TreeNode root = node(10,
                node(5, node(3), node(7)),
                node(15, null, node(18)));
        assertEquals(32, solution.rangeSumBST(root, 7, 15));
    }

    @Test
    void rangeSumBST_allNodesInRange() {
        TreeNode root = node(10,
                node(5, node(3), node(7)),
                node(15, null, node(18)));
        assertEquals(58, solution.rangeSumBST(root, 1, 100));
    }

    @Test
    void rangeSumBST_noNodesInRange() {
        TreeNode root = node(10,
                node(5, node(3), node(7)),
                node(15, null, node(18)));
        assertEquals(0, solution.rangeSumBST(root, 20, 50));
    }
}

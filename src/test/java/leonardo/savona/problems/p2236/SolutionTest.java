package leonardo.savona.problems.p2236;

import leonardo.savona.base.BaseTest;
import leonardo.savona.problems.common.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    private TreeNode node(int val) { return new TreeNode(val); }
    private TreeNode node(int val, TreeNode l, TreeNode r) { return new TreeNode(val, l, r); }

    @Test
    void checkTree_rootEqualsSum_returnsTrue() {
        TreeNode root = node(10, node(4), node(6));
        assertTrue(solution.checkTree(root));
    }

    @Test
    void checkTree_rootNotEqualsSum_returnsFalse() {
        TreeNode root = node(5, node(3), node(1));
        assertFalse(solution.checkTree(root));
    }

    @Test
    void checkTree_bothChildrenZero_rootZero_returnsTrue() {
        TreeNode root = node(0, node(0), node(0));
        assertTrue(solution.checkTree(root));
    }

    @Test
    void checkTree_bothChildrenZero_rootNonZero_returnsFalse() {
        TreeNode root = node(1, node(0), node(0));
        assertFalse(solution.checkTree(root));
    }

    @Test
    void checkTree_largeValues_equalsSum_returnsTrue() {
        TreeNode root = node(100, node(60), node(40));
        assertTrue(solution.checkTree(root));
    }

    @Test
    void checkTree_largeValues_notEqualsSum_returnsFalse() {
        TreeNode root = node(100, node(50), node(40));
        assertFalse(solution.checkTree(root));
    }
}

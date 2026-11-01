package leonardo.savona.problems.p145;

import leonardo.savona.base.BaseTest;
import leonardo.savona.problems.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

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
    void postorderTraversal_null() {
        assertEquals(List.of(), solution.postorderTraversal(null));
    }

    @Test
    void postorderTraversal_singleNode() {
        assertEquals(List.of(1), solution.postorderTraversal(node(1)));
    }

    @Test
    void postorderTraversal_example() {
        // [1, null, 2, 3] -> [3, 2, 1]
        TreeNode root = node(1, null, node(2, node(3), null));
        assertEquals(List.of(3, 2, 1), solution.postorderTraversal(root));
    }

    @Test
    void postorderTraversal_balancedTree() {
        // [2, 1, 3] -> [1, 3, 2]
        assertEquals(List.of(1, 3, 2), solution.postorderTraversal(node(2, node(1), node(3))));
    }

    @Test
    void postorderTraversal_leftSkewed() {
        TreeNode root = node(3, node(2, node(1), null), null);
        assertEquals(List.of(1, 2, 3), solution.postorderTraversal(root));
    }

    @Test
    void postorderTraversal_fullTree() {
        // [4, 2, 6, 1, 3, 5, 7] -> [1, 3, 2, 5, 7, 6, 4]
        TreeNode root = node(4,
                node(2, node(1), node(3)),
                node(6, node(5), node(7)));
        assertEquals(List.of(1, 3, 2, 5, 7, 6, 4), solution.postorderTraversal(root));
    }
}

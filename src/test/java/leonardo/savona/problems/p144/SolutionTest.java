package leonardo.savona.problems.p144;

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
    void preorderTraversal_null() {
        assertEquals(List.of(), solution.preorderTraversal(null));
    }

    @Test
    void preorderTraversal_singleNode() {
        assertEquals(List.of(1), solution.preorderTraversal(node(1)));
    }

    @Test
    void preorderTraversal_example() {
        // [1, null, 2, 3] -> [1, 2, 3]
        TreeNode root = node(1, null, node(2, node(3), null));
        assertEquals(List.of(1, 2, 3), solution.preorderTraversal(root));
    }

    @Test
    void preorderTraversal_balancedTree() {
        // [2, 1, 3] -> [2, 1, 3]
        assertEquals(List.of(2, 1, 3), solution.preorderTraversal(node(2, node(1), node(3))));
    }

    @Test
    void preorderTraversal_leftSkewed() {
        TreeNode root = node(3, node(2, node(1), null), null);
        assertEquals(List.of(3, 2, 1), solution.preorderTraversal(root));
    }

    @Test
    void preorderTraversal_fullTree() {
        // [4, 2, 6, 1, 3, 5, 7] -> [4, 2, 1, 3, 6, 5, 7]
        TreeNode root = node(4,
                node(2, node(1), node(3)),
                node(6, node(5), node(7)));
        assertEquals(List.of(4, 2, 1, 3, 6, 5, 7), solution.preorderTraversal(root));
    }
}

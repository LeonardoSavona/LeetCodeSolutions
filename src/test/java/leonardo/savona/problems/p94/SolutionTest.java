package leonardo.savona.problems.p94;

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
    void inorderTraversal_null() {
        assertEquals(List.of(), solution.inorderTraversal(null));
    }

    @Test
    void inorderTraversal_singleNode() {
        assertEquals(List.of(1), solution.inorderTraversal(node(1)));
    }

    @Test
    void inorderTraversal_example() {
        // [1, null, 2, 3] -> [1, 3, 2]
        TreeNode root = node(1, null, node(2, node(3), null));
        assertEquals(List.of(1, 3, 2), solution.inorderTraversal(root));
    }

    @Test
    void inorderTraversal_balancedTree() {
        // [2, 1, 3] -> [1, 2, 3]
        TreeNode root = node(2, node(1), node(3));
        assertEquals(List.of(1, 2, 3), solution.inorderTraversal(root));
    }

    @Test
    void inorderTraversal_leftSkewed() {
        // 3 -> 2 -> 1, all left children
        TreeNode root = node(3, node(2, node(1), null), null);
        assertEquals(List.of(1, 2, 3), solution.inorderTraversal(root));
    }

    @Test
    void inorderTraversal_fullTree() {
        // [4, 2, 6, 1, 3, 5, 7] -> [1, 2, 3, 4, 5, 6, 7]
        TreeNode root = node(4,
                node(2, node(1), node(3)),
                node(6, node(5), node(7)));
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7), solution.inorderTraversal(root));
    }
}

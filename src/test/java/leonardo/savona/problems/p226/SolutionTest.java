package leonardo.savona.problems.p226;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    private Solution.TreeNode node(int val) {
        return solution.new TreeNode(val);
    }

    private Solution.TreeNode node(int val, Solution.TreeNode left, Solution.TreeNode right) {
        return solution.new TreeNode(val, left, right);
    }

    /** BFS level-order values, skipping trailing nulls. */
    private int[] levelOrder(Solution.TreeNode root) {
        if (root == null) return new int[0];
        List<Integer> result = new ArrayList<>();
        Queue<Solution.TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Solution.TreeNode cur = q.poll();
            result.add(cur.val);
            if (cur.left != null) q.add(cur.left);
            if (cur.right != null) q.add(cur.right);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    @Test
    void invertTree_null() {
        assertNull(solution.invertTree(null));
    }

    @Test
    void invertTree_single() {
        Solution.TreeNode root = node(1);
        Solution.TreeNode result = solution.invertTree(root);
        assertEquals(1, result.val);
        assertNull(result.left);
        assertNull(result.right);
    }

    @Test
    void invertTree_left_only() {
        // [1, 2] → [1, null, 2]
        Solution.TreeNode root = node(1, node(2), null);
        Solution.TreeNode result = solution.invertTree(root);
        assertEquals(1, result.val);
        assertNull(result.left);
        assertEquals(2, result.right.val);
    }

    @Test
    void invertTree_right_only() {
        // [1, null, 2] → [1, 2, null]
        Solution.TreeNode root = node(1, null, node(2));
        Solution.TreeNode result = solution.invertTree(root);
        assertEquals(1, result.val);
        assertEquals(2, result.left.val);
        assertNull(result.right);
    }

    @Test
    void invertTree_full() {
        // [4, 2, 7, 1, 3, 6, 9] → [4, 7, 2, 9, 6, 3, 1]
        Solution.TreeNode root = node(4,
                node(2, node(1), node(3)),
                node(7, node(6), node(9)));
        Solution.TreeNode result = solution.invertTree(root);
        assertEquals(4, result.val);
        assertEquals(7, result.left.val);
        assertEquals(2, result.right.val);
        assertEquals(9, result.left.left.val);
        assertEquals(6, result.left.right.val);
        assertEquals(3, result.right.left.val);
        assertEquals(1, result.right.right.val);
    }

    @Test
    void invertTree_symmetric() {
        // [1, 2, 2] → [1, 2, 2] (unchanged values, children swapped but same)
        Solution.TreeNode root = node(1, node(2), node(2));
        Solution.TreeNode result = solution.invertTree(root);
        assertEquals(1, result.val);
        assertEquals(2, result.left.val);
        assertEquals(2, result.right.val);
    }
}

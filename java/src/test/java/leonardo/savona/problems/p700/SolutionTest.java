package leonardo.savona.problems.p700;

import leonardo.savona.base.BaseTest;
import leonardo.savona.problems.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    private TreeNode node(int val) {
        return new TreeNode(val);
    }

    private TreeNode node(int val, TreeNode left, TreeNode right) {
        return new TreeNode(val, left, right);
    }

    /** BFS level-order values, skipping nulls. */
    private int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            result.add(cur.val);
            if (cur.left != null) q.add(cur.left);
            if (cur.right != null) q.add(cur.right);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    @Test
    void searchBST_emptyTree() {
        assertNull(solution.searchBST(null, 1));
    }

    @Test
    void searchBST_rootIsTarget() {
        TreeNode root = node(4, node(2), node(7));
        assertSame(root, solution.searchBST(root, 4));
    }

    @Test
    void searchBST_returnsWholeSubtree() {
        // [4, 2, 7, 1, 3], val = 2 -> [2, 1, 3]
        TreeNode target = node(2, node(1), node(3));
        TreeNode root = node(4, target, node(7));
        TreeNode result = solution.searchBST(root, 2);
        assertSame(target, result);
        assertArrayEquals(new int[]{2, 1, 3}, levelOrder(result));
    }

    @Test
    void searchBST_targetInRightSubtree() {
        TreeNode target = node(7);
        TreeNode root = node(4, node(2, node(1), node(3)), target);
        assertSame(target, solution.searchBST(root, 7));
    }

    @Test
    void searchBST_targetIsLeaf() {
        TreeNode target = node(3);
        TreeNode root = node(4, node(2, node(1), target), node(7));
        TreeNode result = solution.searchBST(root, 3);
        assertSame(target, result);
        assertNull(result.left);
        assertNull(result.right);
    }

    @Test
    void searchBST_notFound() {
        // [4, 2, 7, 1, 3], val = 5 -> null
        TreeNode root = node(4, node(2, node(1), node(3)), node(7));
        assertNull(solution.searchBST(root, 5));
    }
}

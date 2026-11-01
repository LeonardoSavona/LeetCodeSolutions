package leonardo.savona.problems.p897;

import leonardo.savona.base.BaseTest;
import leonardo.savona.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    private TreeNode tree(Integer... vals) {
        if (vals.length == 0 || vals[0] == null) return null;
        TreeNode root = new TreeNode(vals[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (i < vals.length) {
            TreeNode node = q.poll();
            if (i < vals.length && vals[i] != null) { node.left = new TreeNode(vals[i]); q.add(node.left); }
            i++;
            if (i < vals.length && vals[i] != null) { node.right = new TreeNode(vals[i]); q.add(node.right); }
            i++;
        }
        return root;
    }

    private List<Integer> rightSpine(TreeNode node) {
        List<Integer> values = new ArrayList<>();
        for (; node != null; node = node.right) {
            assertNull(node.left);
            values.add(node.val);
        }
        return values;
    }

    @Test
    void increasingBST_example1() {
        TreeNode root = tree(5, 3, 6, 2, 4, null, 8, 1, null, null, null, 7, 9);
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9), rightSpine(solution.increasingBST(root)));
    }

    @Test
    void increasingBST_example2() {
        assertEquals(List.of(1, 5, 7), rightSpine(solution.increasingBST(tree(5, 1, 7))));
    }

    @Test
    void increasingBST_single() {
        assertEquals(List.of(1), rightSpine(solution.increasingBST(tree(1))));
    }

    @Test
    void increasingBST_leftChain() {
        assertEquals(List.of(1, 2, 3), rightSpine(solution.increasingBST(tree(3, 2, null, 1))));
    }

    @Test
    void increasingBST_alreadyIncreasing() {
        assertEquals(List.of(1, 2, 3), rightSpine(solution.increasingBST(tree(1, null, 2, null, 3))));
    }

    @Test
    void increasingBST_zigZag() {
        assertEquals(List.of(1, 2, 3, 4), rightSpine(solution.increasingBST(tree(4, 1, null, null, 3, 2))));
    }
}

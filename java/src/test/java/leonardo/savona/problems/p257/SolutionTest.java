package leonardo.savona.problems.p257;

import leonardo.savona.base.BaseTest;
import leonardo.savona.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
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

    private List<String> sorted(List<String> paths) {
        List<String> copy = new ArrayList<>(paths);
        Collections.sort(copy);
        return copy;
    }

    @Test
    void binaryTreePaths_example1() {
        assertEquals(List.of("1->2->5", "1->3"), sorted(solution.binaryTreePaths(tree(1, 2, 3, null, 5))));
    }

    @Test
    void binaryTreePaths_single() {
        assertEquals(List.of("1"), solution.binaryTreePaths(tree(1)));
    }

    @Test
    void binaryTreePaths_leftChain() {
        assertEquals(List.of("1->2->3"), solution.binaryTreePaths(tree(1, 2, null, 3)));
    }

    @Test
    void binaryTreePaths_perfectTree() {
        assertEquals(List.of("1->2->4", "1->2->5", "1->3->6", "1->3->7"),
                sorted(solution.binaryTreePaths(tree(1, 2, 3, 4, 5, 6, 7))));
    }

    @Test
    void binaryTreePaths_negativeValues() {
        assertEquals(List.of("-1->-2", "-1->3"), sorted(solution.binaryTreePaths(tree(-1, -2, 3))));
    }
}

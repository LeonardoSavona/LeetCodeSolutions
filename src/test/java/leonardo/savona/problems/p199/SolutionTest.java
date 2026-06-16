package leonardo.savona.problems.p199;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    private Solution.TreeNode node(int val) { return solution.new TreeNode(val); }
    private Solution.TreeNode node(int val, Solution.TreeNode l, Solution.TreeNode r) { return solution.new TreeNode(val, l, r); }

    @Test
    void rightSideView_empty() {
        assertEquals(List.of(), solution.rightSideView(null));
    }

    @Test
    void rightSideView_singleNode() {
        assertEquals(List.of(1), solution.rightSideView(node(1)));
    }

    @Test
    void rightSideView_example1() {
        Solution.TreeNode root = node(1,
                node(2, null, node(5)),
                node(3, null, node(4)));
        assertEquals(List.of(1, 3, 4), solution.rightSideView(root));
    }

    @Test
    void rightSideView_example2() {
        Solution.TreeNode root = node(1, null, node(3));
        assertEquals(List.of(1, 3), solution.rightSideView(root));
    }

    @Test
    void rightSideView_leftDeeperThanRight() {
        Solution.TreeNode root = node(1,
                node(2, null, node(5)),
                node(3));
        assertEquals(List.of(1, 3, 5), solution.rightSideView(root));
    }

    @Test
    void rightSideView_leftSkewed() {
        Solution.TreeNode root = node(1, node(2, node(3), null), null);
        assertEquals(List.of(1, 2, 3), solution.rightSideView(root));
    }

    @Test
    void rightSideView_rightSkewed() {
        Solution.TreeNode root = node(1, null, node(2, null, node(3)));
        assertEquals(List.of(1, 2, 3), solution.rightSideView(root));
    }
}

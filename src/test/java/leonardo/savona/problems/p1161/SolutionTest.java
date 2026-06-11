package leonardo.savona.problems.p1161;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    private Solution.TreeNode node(int val) { return solution.new TreeNode(val); }
    private Solution.TreeNode node(int val, Solution.TreeNode l, Solution.TreeNode r) { return solution.new TreeNode(val, l, r); }

    @Test
    void maxLevelSum_singleNode() {
        Solution.TreeNode root = node(5);
        assertEquals(1, Solution.maxLevelSum(root));
    }

    @Test
    void maxLevelSum_exampleOne() {
        Solution.TreeNode root = node(1,
            node(7, node(7), node(-8)),
            node(0));
        assertEquals(2, Solution.maxLevelSum(root));
    }

    @Test
    void maxLevelSum_exampleTwo() {
        Solution.TreeNode root = node(989,
            null,
            node(10250,
                node(98693),
                node(-89388,
                    null,
                    node(-32127))));
        assertEquals(2, Solution.maxLevelSum(root));
    }

    @Test
    void maxLevelSum_rootHasMaxSum() {
        Solution.TreeNode root = node(100,
            node(-50),
            node(-50));
        assertEquals(1, Solution.maxLevelSum(root));
    }

    @Test
    void maxLevelSum_deepestLevelHasMaxSum() {
        Solution.TreeNode root = node(1,
            node(1,
                node(1, node(100), null),
                null),
            node(1));
        assertEquals(4, Solution.maxLevelSum(root));
    }

    @Test
    void maxLevelSum_negativeLevelsPickEarliest() {
        Solution.TreeNode root = node(-1,
            node(-2),
            node(-3));
        assertEquals(1, Solution.maxLevelSum(root));
    }
}

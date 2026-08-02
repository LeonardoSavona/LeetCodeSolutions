package leonardo.savona.problems.p1161;

import leonardo.savona.base.BaseTest;
import leonardo.savona.problems.common.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    private TreeNode node(int val) { return new TreeNode(val); }
    private TreeNode node(int val, TreeNode l, TreeNode r) { return new TreeNode(val, l, r); }

    @Test
    void maxLevelSum_singleNode() {
        TreeNode root = node(5);
        assertEquals(1, Solution.maxLevelSum(root));
    }

    @Test
    void maxLevelSum_exampleOne() {
        TreeNode root = node(1,
            node(7, node(7), node(-8)),
            node(0));
        assertEquals(2, Solution.maxLevelSum(root));
    }

    @Test
    void maxLevelSum_exampleTwo() {
        TreeNode root = node(989,
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
        TreeNode root = node(100,
            node(-50),
            node(-50));
        assertEquals(1, Solution.maxLevelSum(root));
    }

    @Test
    void maxLevelSum_deepestLevelHasMaxSum() {
        TreeNode root = node(1,
            node(1,
                node(1, node(100), null),
                null),
            node(1));
        assertEquals(4, Solution.maxLevelSum(root));
    }

    @Test
    void maxLevelSum_negativeLevelsPickEarliest() {
        TreeNode root = node(-1,
            node(-2),
            node(-3));
        assertEquals(1, Solution.maxLevelSum(root));
    }
}

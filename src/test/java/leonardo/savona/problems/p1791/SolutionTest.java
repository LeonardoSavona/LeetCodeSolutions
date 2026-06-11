package leonardo.savona.problems.p1791;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void findCenter_centerIsFirstNodeOfFirstEdge() {
        int[][] edges = {{1, 2}, {1, 3}, {1, 4}};
        assertEquals(1, solution.findCenter(edges));
    }

    @Test
    void findCenter_centerIsSecondNodeOfFirstEdge() {
        int[][] edges = {{2, 1}, {3, 1}, {4, 1}};
        assertEquals(1, solution.findCenter(edges));
    }

    @Test
    void findCenter_centerMatchesSecondEdgeFirstNode() {
        int[][] edges = {{3, 5}, {5, 2}, {5, 7}};
        assertEquals(5, solution.findCenter(edges));
    }

    @Test
    void findCenter_centerMatchesSecondEdgeSecondNode() {
        int[][] edges = {{4, 7}, {2, 7}, {7, 9}};
        assertEquals(7, solution.findCenter(edges));
    }

    @Test
    void findCenter_minimumTwoEdges() {
        int[][] edges = {{1, 2}, {2, 3}};
        assertEquals(2, solution.findCenter(edges));
    }

    @Test
    void findCenter_largeNodeValues() {
        int[][] edges = {{100000, 1}, {100000, 2}, {100000, 3}};
        assertEquals(100000, solution.findCenter(edges));
    }
}

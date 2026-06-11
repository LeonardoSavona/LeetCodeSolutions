package leonardo.savona.problems.p980;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    @Test
    void uniquePathsIII_example1() {
        Solution solution = new Solution();
        int[][] grid = {
            {1, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 2, -1}
        };
        assertEquals(2, solution.uniquePathsIII(grid));
    }

    @Test
    void uniquePathsIII_example2() {
        Solution solution = new Solution();
        int[][] grid = {
            {1, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 2}
        };
        assertEquals(4, solution.uniquePathsIII(grid));
    }

    @Test
    void uniquePathsIII_example3() {
        Solution solution = new Solution();
        int[][] grid = {
            {0, 1},
            {2, 0}
        };
        assertEquals(0, solution.uniquePathsIII(grid));
    }

    @Test
    void uniquePathsIII_startAdjacentToEnd() {
        Solution solution = new Solution();
        int[][] grid = {
            {1, 2}
        };
        assertEquals(1, solution.uniquePathsIII(grid));
    }

    @Test
    void uniquePathsIII_allObstacles() {
        Solution solution = new Solution();
        int[][] grid = {
            {1, -1},
            {-1, 2}
        };
        assertEquals(0, solution.uniquePathsIII(grid));
    }

    @Test
    void uniquePathsIII_singlePath() {
        Solution solution = new Solution();
        int[][] grid = {
            {1, 0, 0, 2}
        };
        assertEquals(1, solution.uniquePathsIII(grid));
    }
}

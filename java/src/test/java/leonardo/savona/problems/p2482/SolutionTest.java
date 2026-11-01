package leonardo.savona.problems.p2482;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void onesMinusZeros_exampleGrid2x3() {
        int[][] grid = {
            {0, 1, 1},
            {1, 0, 1}
        };
        int[][] result = solution.onesMinusZeros(grid);
        assertArrayEquals(new int[]{1, 1, 3}, result[0]);
        assertArrayEquals(new int[]{1, 1, 3}, result[1]);
    }

    @Test
    void onesMinusZeros_allOnes() {
        int[][] grid = {
            {1, 1},
            {1, 1}
        };
        int[][] result = solution.onesMinusZeros(grid);
        assertArrayEquals(new int[]{4, 4}, result[0]);
        assertArrayEquals(new int[]{4, 4}, result[1]);
    }

    @Test
    void onesMinusZeros_allZeros() {
        int[][] grid = {
            {0, 0},
            {0, 0}
        };
        int[][] result = solution.onesMinusZeros(grid);
        assertArrayEquals(new int[]{-4, -4}, result[0]);
        assertArrayEquals(new int[]{-4, -4}, result[1]);
    }

    @Test
    void onesMinusZeros_singleCell_one() {
        int[][] grid = {{1}};
        int[][] result = solution.onesMinusZeros(grid);
        assertArrayEquals(new int[]{2}, result[0]);
    }

    @Test
    void onesMinusZeros_singleCell_zero() {
        int[][] grid = {{0}};
        int[][] result = solution.onesMinusZeros(grid);
        assertArrayEquals(new int[]{-2}, result[0]);
    }

    @Test
    void onesMinusZeros_largerMixedGrid() {
        int[][] grid = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        int[][] result = solution.onesMinusZeros(grid);
        assertArrayEquals(new int[]{-2, -2, -2}, result[0]);
        assertArrayEquals(new int[]{-2, -2, -2}, result[1]);
        assertArrayEquals(new int[]{-2, -2, -2}, result[2]);
    }
}

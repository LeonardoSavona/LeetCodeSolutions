package leonardo.savona.problems.p48;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void rotate_1x1Matrix() {
        int[][] matrix = {{7}};
        solution.rotate(matrix);
        assertArrayEquals(new int[][]{{7}}, matrix);
    }

    @Test
    void rotate_2x2Matrix() {
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };
        solution.rotate(matrix);
        assertArrayEquals(new int[][]{{3, 1}, {4, 2}}, matrix);
    }

    @Test
    void rotate_3x3Matrix() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        solution.rotate(matrix);
        assertArrayEquals(new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}, matrix);
    }

    @Test
    void rotate_4x4Matrix() {
        int[][] matrix = {
            { 5,  1,  9, 11},
            { 2,  4,  8, 10},
            {13,  3,  6,  7},
            {15, 14, 12, 16}
        };
        solution.rotate(matrix);
        assertArrayEquals(new int[][]{
            {15, 13,  2,  5},
            {14,  3,  4,  1},
            {12,  6,  8,  9},
            {16,  7, 10, 11}
        }, matrix);
    }

    @Test
    void rotate_matrixWithNegativeValues() {
        int[][] matrix = {
            {-1, -2},
            {-3, -4}
        };
        solution.rotate(matrix);
        assertArrayEquals(new int[][]{{-3, -1}, {-4, -2}}, matrix);
    }

    @Test
    void rotate_3x3AllSameValues() {
        int[][] matrix = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        solution.rotate(matrix);
        assertArrayEquals(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}, matrix);
    }
}

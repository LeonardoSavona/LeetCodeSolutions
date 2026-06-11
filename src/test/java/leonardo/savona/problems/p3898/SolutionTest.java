package leonardo.savona.problems.p3898;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void findDegrees_singleVertex() {
        int[][] matrix = {{0}};
        assertArrayEquals(new int[]{0}, Solution.findDegrees(matrix));
    }

    @Test
    void findDegrees_singleRowAllZeros() {
        int[][] matrix = {{0, 0, 0}};
        assertArrayEquals(new int[]{0}, Solution.findDegrees(matrix));
    }

    @Test
    void findDegrees_typicalSmallMatrix() {
        int[][] matrix = {
            {0, 1, 1},
            {1, 0, 0},
            {1, 0, 0}
        };
        assertArrayEquals(new int[]{2, 1, 1}, Solution.findDegrees(matrix));
    }

    @Test
    void findDegrees_allOnes() {
        int[][] matrix = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };
        assertArrayEquals(new int[]{3, 3, 3}, Solution.findDegrees(matrix));
    }

    @Test
    void findDegrees_mixedValues() {
        int[][] matrix = {
            {0, 1, 0, 1},
            {1, 0, 1, 0},
            {0, 1, 0, 0}
        };
        assertArrayEquals(new int[]{2, 2, 1}, Solution.findDegrees(matrix));
    }

    @Test
    void findDegrees_singleColumn() {
        int[][] matrix = {
            {1},
            {0},
            {1},
            {1}
        };
        assertArrayEquals(new int[]{1, 0, 1, 1}, Solution.findDegrees(matrix));
    }
}

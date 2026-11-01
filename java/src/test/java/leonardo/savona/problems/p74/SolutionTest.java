package leonardo.savona.problems.p74;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[][] matrix = new int[][]{
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        assertTrue(solution.searchMatrix(matrix, 3));
    }

    @Test
    void test2() {
        int[][] matrix = new int[][]{
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        assertFalse(solution.searchMatrix(matrix, 13));
    }

    @Test
    void test3() {
        int[][] matrix = new int[][]{{1}};
        assertTrue(solution.searchMatrix(matrix, 1));
    }
}

package leonardo.savona.problems.p1572;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void diagonalSum_singleElement() {
        assertEquals(1, solution.diagonalSum(new int[][]{{1}}));
    }

    @Test
    void diagonalSum_twoByTwo() {
        assertEquals(10, solution.diagonalSum(new int[][]{{1, 2}, {3, 4}}));
    }

    @Test
    void diagonalSum_threeByThree() {
        assertEquals(25, solution.diagonalSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }

    @Test
    void diagonalSum_threeByThreeAllSame() {
        assertEquals(5, solution.diagonalSum(new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}}));
    }

    @Test
    void diagonalSum_fiveByFive() {
        int[][] mat = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };
        assertEquals(117, solution.diagonalSum(mat));
    }

    @Test
    void diagonalSum_threeByThreeFromLeetcode() {
        assertEquals(25, solution.diagonalSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }
}

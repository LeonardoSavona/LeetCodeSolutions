package leonardo.savona.problems.p1769;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void minOperations_singleBox() {
        assertArrayEquals(new int[]{0}, solution.minOperations("0"));
    }

    @Test
    void minOperations_singleBoxWithBall() {
        assertArrayEquals(new int[]{0}, solution.minOperations("1"));
    }

    @Test
    void minOperations_twoBoxesOneBall() {
        assertArrayEquals(new int[]{1, 0}, solution.minOperations("01"));
    }

    @Test
    void minOperations_exampleOne() {
        assertArrayEquals(new int[]{1, 1, 3}, solution.minOperations("110"));
    }

    @Test
    void minOperations_exampleTwo() {
        assertArrayEquals(new int[]{11, 8, 5, 4, 3, 4}, solution.minOperations("001011"));
    }

    @Test
    void minOperations_allZeros() {
        assertArrayEquals(new int[]{0, 0, 0, 0}, solution.minOperations("0000"));
    }
}

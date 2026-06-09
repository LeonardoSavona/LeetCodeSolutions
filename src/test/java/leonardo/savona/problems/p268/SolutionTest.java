package leonardo.savona.problems.p268;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void missingNumber_missingZero() {
        assertEquals(0, solution.missingNumber(new int[]{1}));
    }

    @Test
    void missingNumber_missingLast() {
        assertEquals(3, solution.missingNumber(new int[]{0, 1, 2}));
    }

    @Test
    void test1() {
        assertEquals(2, solution.missingNumber(new int[]{0, 1}));
    }

    @Test
    void missingNumber_missingMiddle() {
        assertEquals(2, solution.missingNumber(new int[]{3, 0, 1}));
    }

    @Test
    void missingNumber_typical() {
        assertEquals(8, solution.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }

    @Test
    void missingNumber_singleZero() {
        assertEquals(1, solution.missingNumber(new int[]{0}));
    }

    @Test
    void missingNumber_singleOne() {
        assertEquals(0, solution.missingNumber(new int[]{1}));
    }
}

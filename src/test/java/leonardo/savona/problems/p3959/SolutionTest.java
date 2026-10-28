package leonardo.savona.problems.p3959;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void checkGoodInteger_example1() {
        // 1 - 1 = 0
        assertFalse(solution.checkGoodInteger(1000));
    }

    @Test
    void checkGoodInteger_example2() {
        // 82 - 10 = 72
        assertTrue(solution.checkGoodInteger(19));
    }

    @Test
    void checkGoodInteger_singleDigitBelowThreshold() {
        // 49 - 7 = 42
        assertFalse(solution.checkGoodInteger(7));
    }

    @Test
    void checkGoodInteger_singleDigitAboveThreshold() {
        // 64 - 8 = 56
        assertTrue(solution.checkGoodInteger(8));
    }

    @Test
    void checkGoodInteger_justBelowThreshold() {
        // 50 - 10 = 40
        assertFalse(solution.checkGoodInteger(55));
    }

    @Test
    void checkGoodInteger_reachesThresholdWithManyDigits() {
        // 75 - 15 = 60
        assertTrue(solution.checkGoodInteger(555));
    }

    @Test
    void checkGoodInteger_exactlyFifty() {
        // 61 - 11 = 50
        assertTrue(solution.checkGoodInteger(65));
    }

    @Test
    void checkGoodInteger_fortyEight() {
        // 58 - 10 = 48
        assertFalse(solution.checkGoodInteger(73));
    }
}

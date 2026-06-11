package leonardo.savona.problems.p2520;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void countDigits_allDigitsDivide() {
        assertEquals(3, solution.countDigits(124));
    }

    @Test
    void countDigits_someDigitsDivide() {
        assertEquals(1, solution.countDigits(7));
    }

    @Test
    void countDigits_singleDigitOne() {
        assertEquals(1, solution.countDigits(1));
    }

    @Test
    void countDigits_repeatedDigit() {
        assertEquals(2, solution.countDigits(33));
    }

    @Test
    void countDigits_twoDigitsBothDivide() {
        assertEquals(2, solution.countDigits(12));
    }

    @Test
    void countDigits_largeNumber() {
        assertEquals(4, solution.countDigits(1111));
    }
}

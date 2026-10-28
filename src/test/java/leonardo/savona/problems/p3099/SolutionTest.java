package leonardo.savona.problems.p3099;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void sumOfTheDigitsOfHarshadNumber_example1() {
        assertEquals(9, solution.sumOfTheDigitsOfHarshadNumber(18));
    }

    @Test
    void sumOfTheDigitsOfHarshadNumber_example2() {
        assertEquals(-1, solution.sumOfTheDigitsOfHarshadNumber(23));
    }

    @Test
    void sumOfTheDigitsOfHarshadNumber_singleDigit() {
        assertEquals(7, solution.sumOfTheDigitsOfHarshadNumber(7));
    }

    @Test
    void sumOfTheDigitsOfHarshadNumber_upperBound() {
        assertEquals(1, solution.sumOfTheDigitsOfHarshadNumber(100));
    }

    @Test
    void sumOfTheDigitsOfHarshadNumber_notDivisible() {
        // 1 + 1 = 2, 11 is odd
        assertEquals(-1, solution.sumOfTheDigitsOfHarshadNumber(11));
    }

    @Test
    void sumOfTheDigitsOfHarshadNumber_divisible() {
        // 1 + 2 = 3, 12 / 3 = 4
        assertEquals(3, solution.sumOfTheDigitsOfHarshadNumber(12));
    }
}

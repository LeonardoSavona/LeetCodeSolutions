package leonardo.savona.problems.p7;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void reverse_positiveNumber() {
        assertEquals(321, solution.reverse(123));
    }

    @Test
    void reverse_negativeNumber() {
        assertEquals(-321, solution.reverse(-123));
    }

    @Test
    void reverse_trailingZero() {
        assertEquals(21, solution.reverse(120));
    }

    @Test
    void reverse_singleDigitAndZero() {
        assertEquals(7, solution.reverse(7));
        assertEquals(-5, solution.reverse(-5));
        assertEquals(0, solution.reverse(0));
    }

    @Test
    void reverse_overflowPositiveReturnsZero() {
        assertEquals(0, solution.reverse(Integer.MAX_VALUE));
    }

    @Test
    void reverse_overflowNegativeReturnsZero() {
        assertEquals(0, solution.reverse(1534236469));
    }
}

package leonardo.savona.problems.p8;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void myAtoi_positiveNumber() {
        assertEquals(42, solution.myAtoi("42"));
    }

    @Test
    void myAtoi_negativeNumberWithLeadingSpaces() {
        assertEquals(-42, solution.myAtoi("   -42"));
    }

    @Test
    void myAtoi_numberWithTrailingNonDigits() {
        assertEquals(4193, solution.myAtoi("4193 with words"));
    }

    @Test
    void myAtoi_overflowClampsToMaxInt() {
        assertEquals(Integer.MAX_VALUE, solution.myAtoi("91283472332"));
    }

    @Test
    void myAtoi_underflowClampsToMinInt() {
        assertEquals(Integer.MIN_VALUE, solution.myAtoi("-91283472332"));
    }

    @Test
    void myAtoi_emptyAndNonNumericStrings() {
        assertEquals(0, solution.myAtoi(""));
        assertEquals(0, solution.myAtoi("   "));
        assertEquals(0, solution.myAtoi("words and 987"));
    }
}

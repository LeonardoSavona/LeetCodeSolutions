package leonardo.savona.problems.p67;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void addBinary_singleDigitNoCarry() {
        assertEquals("1", solution.addBinary("1", "0"));
    }

    @Test
    void addBinary_singleDigitWithCarry() {
        assertEquals("10", solution.addBinary("1", "1"));
    }

    @Test
    void addBinary_typicalCase() {
        assertEquals("100", solution.addBinary("11", "1"));
    }

    @Test
    void addBinary_differentLengthsWithCarryPropagation() {
        assertEquals("10101", solution.addBinary("1010", "1011"));
    }

    @Test
    void addBinary_bothZero() {
        assertEquals("0", solution.addBinary("0", "0"));
    }

    @Test
    void addBinary_longStringsWithMultipleCarries() {
        assertEquals("1111", solution.addBinary("1111", "0"));
    }
}

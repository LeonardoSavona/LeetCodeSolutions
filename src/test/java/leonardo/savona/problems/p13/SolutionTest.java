package leonardo.savona.problems.p13;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void romanToInt_singleSymbol() {
        assertEquals(1, solution.romanToInt("I"));
        assertEquals(5, solution.romanToInt("V"));
        assertEquals(10, solution.romanToInt("X"));
        assertEquals(50, solution.romanToInt("L"));
        assertEquals(100, solution.romanToInt("C"));
        assertEquals(500, solution.romanToInt("D"));
        assertEquals(1000, solution.romanToInt("M"));
    }

    @Test
    void romanToInt_subtractiveNotation() {
        assertEquals(4, solution.romanToInt("IV"));
        assertEquals(9, solution.romanToInt("IX"));
        assertEquals(40, solution.romanToInt("XL"));
        assertEquals(90, solution.romanToInt("XC"));
        assertEquals(400, solution.romanToInt("CD"));
        assertEquals(900, solution.romanToInt("CM"));
    }

    @Test
    void romanToInt_typicalSmallValues() {
        assertEquals(3, solution.romanToInt("III"));
        assertEquals(8, solution.romanToInt("VIII"));
        assertEquals(14, solution.romanToInt("XIV"));
        assertEquals(58, solution.romanToInt("LVIII"));
    }

    @Test
    void romanToInt_typicalLargeValues() {
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
        assertEquals(3749, solution.romanToInt("MMMDCCXLIX"));
        assertEquals(2024, solution.romanToInt("MMXXIV"));
    }

    @Test
    void romanToInt_maximumValue() {
        assertEquals(3999, solution.romanToInt("MMMCMXCIX"));
    }

    @Test
    void romanToInt_mixedAddAndSubtract() {
        assertEquals(1776, solution.romanToInt("MDCCLXXVI"));
        assertEquals(399, solution.romanToInt("CCCXCIX"));
        assertEquals(44, solution.romanToInt("XLIV"));
    }
}

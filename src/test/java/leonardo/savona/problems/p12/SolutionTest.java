package leonardo.savona.problems.p12;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void intToRoman_one() {
        assertEquals("I", solution.intToRoman(1));
    }

    @Test
    void intToRoman_singleSymbols() {
        assertEquals("V", solution.intToRoman(5));
        assertEquals("X", solution.intToRoman(10));
        assertEquals("L", solution.intToRoman(50));
        assertEquals("C", solution.intToRoman(100));
        assertEquals("D", solution.intToRoman(500));
        assertEquals("M", solution.intToRoman(1000));
    }

    @Test
    void intToRoman_subtractiveNotation() {
        assertEquals("IV", solution.intToRoman(4));
        assertEquals("IX", solution.intToRoman(9));
        assertEquals("XL", solution.intToRoman(40));
        assertEquals("XC", solution.intToRoman(90));
        assertEquals("CD", solution.intToRoman(400));
        assertEquals("CM", solution.intToRoman(900));
    }

    @Test
    void intToRoman_typicalCases() {
        assertEquals("III", solution.intToRoman(3));
        assertEquals("LVIII", solution.intToRoman(58));
        assertEquals("MCMXCIV", solution.intToRoman(1994));
    }

    @Test
    void intToRoman_maxValue() {
        assertEquals("MMMCMXCIX", solution.intToRoman(3999));
    }

    @Test
    void intToRoman_multipleThousands() {
        assertEquals("MMM", solution.intToRoman(3000));
        assertEquals("MMCDXXI", solution.intToRoman(2421));
    }
}

package leonardo.savona.problems.p3280;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void convertDateToBinary_exampleDate_2080_02_29() {
        assertEquals("100000100000-10-11101", solution.convertDateToBinary("2080-02-29"));
    }

    @Test
    void convertDateToBinary_exampleDate_1900_01_01() {
        assertEquals("11101101100-1-1", solution.convertDateToBinary("1900-01-01"));
    }

    @Test
    void convertDateToBinary_exampleDate_2000_12_31() {
        assertEquals("11111010000-1100-11111", solution.convertDateToBinary("2000-12-31"));
    }

    @Test
    void convertDateToBinary_minDate_1000_01_01() {
        assertEquals("1111101000-1-1", solution.convertDateToBinary("1000-01-01"));
    }

    @Test
    void convertDateToBinary_maxDate_9999_12_31() {
        assertEquals("10011100001111-1100-11111", solution.convertDateToBinary("9999-12-31"));
    }

    @Test
    void convertDateToBinary_midYear_2024_06_15() {
        assertEquals("11111101000-110-1111", solution.convertDateToBinary("2024-06-15"));
    }
}

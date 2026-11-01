package leonardo.savona.problems.p2469;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void convertTemperature_zerocelsius() {
        double[] result = solution.convertTemperature(0.0);
        assertEquals(273.15, result[0], 1e-9);
        assertEquals(32.00, result[1], 1e-9);
    }

    @Test
    void convertTemperature_hundredCelsius() {
        double[] result = solution.convertTemperature(100.0);
        assertEquals(373.15, result[0], 1e-9);
        assertEquals(212.00, result[1], 1e-9);
    }

    @Test
    void convertTemperature_negativeCelsius() {
        double[] result = solution.convertTemperature(-40.0);
        assertEquals(233.15, result[0], 1e-9);
        assertEquals(-40.00, result[1], 1e-9);
    }

    @Test
    void convertTemperature_decimalCelsius() {
        double[] result = solution.convertTemperature(36.6);
        assertEquals(36.6 + 273.15, result[0], 1e-9);
        assertEquals(36.6 * 1.80 + 32.00, result[1], 1e-9);
    }

    @Test
    void convertTemperature_resultLengthIsTwo() {
        double[] result = solution.convertTemperature(25.0);
        assertEquals(2, result.length);
    }

    @Test
    void convertTemperature_absoluteZero() {
        double[] result = solution.convertTemperature(-273.15);
        assertEquals(0.0, result[0], 1e-9);
        assertEquals(-273.15 * 1.80 + 32.00, result[1], 1e-9);
    }
}

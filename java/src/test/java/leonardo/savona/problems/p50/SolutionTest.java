package leonardo.savona.problems.p50;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void myPow_example1() {
        assertEquals(1024.0, solution.myPow(2.0, 10), 1e-5);
    }

    @Test
    void myPow_example2() {
        assertEquals(9.261, solution.myPow(2.1, 3), 1e-5);
    }

    @Test
    void myPow_negativeExponent() {
        assertEquals(0.25, solution.myPow(2.0, -2), 1e-5);
    }

    @Test
    void myPow_zeroExponent() {
        assertEquals(1.0, solution.myPow(37.5, 0), 1e-5);
    }

    @Test
    void myPow_negativeBaseOddExponent() {
        assertEquals(-8.0, solution.myPow(-2.0, 3), 1e-5);
    }

    @Test
    void myPow_negativeBaseEvenExponent() {
        assertEquals(16.0, solution.myPow(-2.0, 4), 1e-5);
    }

    @Test
    void myPow_minIntExponent() {
        assertEquals(1.0, solution.myPow(1.0, Integer.MIN_VALUE), 1e-5);
        assertEquals(1.0, solution.myPow(-1.0, Integer.MIN_VALUE), 1e-5);
        assertEquals(0.0, solution.myPow(2.0, Integer.MIN_VALUE), 1e-5);
    }

    @Test
    void myPow_maxIntExponent() {
        assertEquals(1.0, solution.myPow(1.0, Integer.MAX_VALUE), 1e-5);
        assertEquals(-1.0, solution.myPow(-1.0, Integer.MAX_VALUE), 1e-5);
    }
}

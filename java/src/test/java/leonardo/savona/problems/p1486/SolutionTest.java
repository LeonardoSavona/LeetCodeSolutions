package leonardo.savona.problems.p1486;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void xorOperation_n5Start0() {
        assertEquals(8, solution.xorOperation(5, 0));
    }

    @Test
    void xorOperation_n4Start3() {
        assertEquals(8, solution.xorOperation(4, 3));
    }

    @Test
    void xorOperation_n1Start7() {
        assertEquals(7, solution.xorOperation(1, 7));
    }

    @Test
    void xorOperation_n2Start0() {
        assertEquals(2, solution.xorOperation(2, 0));
    }

    @Test
    void xorOperation_n10Start5() {
        int expected = 0;
        for (int i = 0; i < 10; i++) expected ^= (5 + 2 * i);
        assertEquals(expected, solution.xorOperation(10, 5));
    }

    @Test
    void xorOperation_n1Start0() {
        assertEquals(0, solution.xorOperation(1, 0));
    }
}

package leonardo.savona.problems.p3370;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void smallestNumber_n1() {
        assertEquals(1, solution.smallestNumber(1));
    }

    @Test
    void smallestNumber_n2() {
        assertEquals(3, solution.smallestNumber(2));
    }

    @Test
    void smallestNumber_n5() {
        assertEquals(7, solution.smallestNumber(5));
    }

    @Test
    void smallestNumber_exactPowerOf2Minus1() {
        assertEquals(7, solution.smallestNumber(7));
    }

    @Test
    void smallestNumber_n8() {
        assertEquals(15, solution.smallestNumber(8));
    }

    @Test
    void smallestNumber_n1000() {
        assertEquals(1023, solution.smallestNumber(1000));
    }
}

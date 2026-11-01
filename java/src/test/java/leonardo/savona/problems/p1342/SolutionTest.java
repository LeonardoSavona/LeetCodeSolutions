package leonardo.savona.problems.p1342;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void numberOfSteps_zero() {
        assertEquals(0, solution.numberOfSteps(0));
    }

    @Test
    void numberOfSteps_one() {
        assertEquals(1, solution.numberOfSteps(1));
    }

    @Test
    void numberOfSteps_evenNumber() {
        assertEquals(6, solution.numberOfSteps(14));
    }

    @Test
    void numberOfSteps_powerOfTwo() {
        assertEquals(4, solution.numberOfSteps(8));
    }

    @Test
    void numberOfSteps_largeNumber() {
        assertEquals(12, solution.numberOfSteps(123));
    }

    @Test
    void numberOfSteps_allOnesBinary() {
        assertEquals(5, solution.numberOfSteps(7));
    }
}

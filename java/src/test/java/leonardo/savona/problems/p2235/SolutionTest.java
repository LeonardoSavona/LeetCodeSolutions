package leonardo.savona.problems.p2235;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void sum_bothPositive() {
        assertEquals(5, solution.sum(2, 3));
    }

    @Test
    void sum_bothZero() {
        assertEquals(0, solution.sum(0, 0));
    }

    @Test
    void sum_positiveAndNegative() {
        assertEquals(-1, solution.sum(3, -4));
    }

    @Test
    void sum_bothNegative() {
        assertEquals(-10, solution.sum(-3, -7));
    }

    @Test
    void sum_largeValues() {
        assertEquals(2000, solution.sum(1000, 1000));
    }

    @Test
    void sum_oneZero() {
        assertEquals(42, solution.sum(42, 0));
    }
}

package leonardo.savona.problems.p2894;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void differenceOfSums_typicalCase() {
        assertEquals(19, solution.differenceOfSums(10, 3));
    }

    @Test
    void differenceOfSums_mEqualsOne() {
        assertEquals(-15, solution.differenceOfSums(5, 1));
    }

    @Test
    void differenceOfSums_mLargerThanN() {
        assertEquals(6, solution.differenceOfSums(3, 5));
    }

    @Test
    void differenceOfSums_singleElementNotDivisible() {
        assertEquals(1, solution.differenceOfSums(1, 2));
    }

    @Test
    void differenceOfSums_singleElementDivisible() {
        assertEquals(-1, solution.differenceOfSums(1, 1));
    }

    @Test
    void differenceOfSums_halfDivisible() {
        assertEquals(-2, solution.differenceOfSums(4, 2));
    }
}

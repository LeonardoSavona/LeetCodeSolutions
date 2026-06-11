package leonardo.savona.problems.p3065;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {
    private final Solution solution = new Solution();

    @Test
    void minOperations_allElementsBelowK() {
        assertEquals(4, solution.minOperations(new int[]{1, 2, 3, 4}, 5));
    }

    @Test
    void minOperations_noElementBelowK() {
        assertEquals(0, solution.minOperations(new int[]{5, 6, 7, 8}, 5));
    }

    @Test
    void minOperations_someElementsBelowK() {
        assertEquals(3, solution.minOperations(new int[]{2, 11, 10, 1, 3}, 10));
    }

    @Test
    void minOperations_singleElementBelowK() {
        assertEquals(1, solution.minOperations(new int[]{3}, 5));
    }

    @Test
    void minOperations_singleElementEqualToK() {
        assertEquals(0, solution.minOperations(new int[]{5}, 5));
    }

    @Test
    void minOperations_mixedWithExactKValue() {
        assertEquals(3, solution.minOperations(new int[]{1, 2, 3, 4, 4, 5, 6}, 4));
    }
}

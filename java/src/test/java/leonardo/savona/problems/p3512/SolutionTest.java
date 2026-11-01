package leonardo.savona.problems.p3512;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void minOperations_sumAlreadyDivisible() {
        assertEquals(0, solution.minOperations(new int[]{3, 3, 3}, 3));
    }

    @Test
    void minOperations_singleElement() {
        assertEquals(2, solution.minOperations(new int[]{5}, 3));
    }

    @Test
    void minOperations_typicalCase() {
        assertEquals(4, solution.minOperations(new int[]{1, 2, 3, 4}, 6));
    }

    @Test
    void minOperations_kEqualsOne() {
        assertEquals(0, solution.minOperations(new int[]{7, 13, 99}, 1));
    }

    @Test
    void minOperations_remainderOne() {
        assertEquals(1, solution.minOperations(new int[]{1, 1, 2}, 3));
    }

    @Test
    void minOperations_largeK() {
        assertEquals(4, solution.minOperations(new int[]{2, 2}, 8));
    }
}

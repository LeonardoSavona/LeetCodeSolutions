package leonardo.savona.problems.p3190;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void minimumOperations_allDivisibleByThree() {
        assertEquals(0, solution.minimumOperations(new int[]{3, 6, 9, 12}));
    }

    @Test
    void minimumOperations_noneDivisibleByThree() {
        assertEquals(3, solution.minimumOperations(new int[]{1, 2, 4}));
    }

    @Test
    void minimumOperations_mixedElements() {
        assertEquals(3, solution.minimumOperations(new int[]{1, 2, 3, 4}));
    }

    @Test
    void minimumOperations_singleElementDivisible() {
        assertEquals(0, solution.minimumOperations(new int[]{6}));
    }

    @Test
    void minimumOperations_singleElementNotDivisible() {
        assertEquals(1, solution.minimumOperations(new int[]{5}));
    }

    @Test
    void minimumOperations_largeArray() {
        assertEquals(2, solution.minimumOperations(new int[]{3, 1, 6, 9, 7, 12}));
    }
}

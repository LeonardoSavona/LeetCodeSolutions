package leonardo.savona.problems.p2011;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void finalValueAfterOperations_allIncrements() {
        assertEquals(3, solution.finalValueAfterOperations(new String[]{"++X", "X++", "X++"}));
    }

    @Test
    void finalValueAfterOperations_allDecrements() {
        assertEquals(-3, solution.finalValueAfterOperations(new String[]{"--X", "X--", "--X"}));
    }

    @Test
    void finalValueAfterOperations_mixedOperations() {
        assertEquals(2, solution.finalValueAfterOperations(new String[]{"X++", "++X", "--X", "X++"}));
    }

    @Test
    void finalValueAfterOperations_singleIncrement() {
        assertEquals(1, solution.finalValueAfterOperations(new String[]{"++X"}));
    }

    @Test
    void finalValueAfterOperations_singleDecrement() {
        assertEquals(-1, solution.finalValueAfterOperations(new String[]{"X--"}));
    }

    @Test
    void finalValueAfterOperations_emptyArray() {
        assertEquals(0, solution.finalValueAfterOperations(new String[]{}));
    }
}

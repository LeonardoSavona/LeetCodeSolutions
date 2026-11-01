package leonardo.savona.problems.p3721;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void longestBalanced_singleElement_returnsOne() {
        assertEquals(0, solution.longestBalanced(new int[]{2}));
    }

    @Test
    void longestBalanced_allOdd_returnsZero() {
        assertEquals(0, solution.longestBalanced(new int[]{1, 3, 5, 7}));
    }

    @Test
    void longestBalanced_alternatingOddEven_returnsFullLength() {
        assertEquals(4, solution.longestBalanced(new int[]{1, 2, 3, 4}));
    }

    @Test
    void longestBalanced_typicalMixedArray() {
        assertEquals(5, solution.longestBalanced(new int[]{2, 1, 3, 4, 2}));
    }

    @Test
    void longestBalanced_repeatedValues_handlesCorrectly() {
        assertEquals(0, solution.longestBalanced(new int[]{1, 1, 1, 1}));
    }

    @Test
    void longestBalanced_longerSequence_returnsCorrectLength() {
        assertEquals(6, solution.longestBalanced(new int[]{3, 2, 1, 4, 5, 6, 7}));
    }
}

package leonardo.savona.problems.p3784;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void minCost_singleChar() {
        assertEquals(0L, solution.minCost("aaaa", new int[]{1, 2, 3, 4}));
    }

    @Test
    void minCost_twoDistinctCharsEqualCost() {
        assertEquals(2L, solution.minCost("ab", new int[]{2, 3}));
    }

    @Test
    void minCost_chooseOptimalTarget() {
        assertEquals(3L, solution.minCost("aab", new int[]{1, 2, 3}));
    }

    @Test
    void minCost_allDifferentChars() {
        assertEquals(3L, solution.minCost("abc", new int[]{1, 2, 3}));
    }

    @Test
    void minCost_longerString() {
        assertEquals(6L, solution.minCost("abcabc", new int[]{1, 2, 3, 1, 2, 3}));
    }

    @Test
    void minCost_singleElement() {
        assertEquals(0L, solution.minCost("z", new int[]{100}));
    }
}

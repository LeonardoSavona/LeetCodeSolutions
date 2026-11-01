package leonardo.savona.problems.p3427;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void subarraySum_example1() {
        assertEquals(39, solution.subarraySum(new int[]{2, 3, 1, 2, 4, 3}));
    }

    @Test
    void subarraySum_singleElement() {
        assertEquals(5, solution.subarraySum(new int[]{5}));
    }

    @Test
    void subarraySum_allZeros() {
        assertEquals(0, solution.subarraySum(new int[]{0, 0, 0}));
    }

    @Test
    void subarraySum_largeWindowValue() {
        assertEquals(20, solution.subarraySum(new int[]{1, 2, 3, 4}));
    }

    @Test
    void subarraySum_singleZero() {
        assertEquals(0, solution.subarraySum(new int[]{0}));
    }

    @Test
    void subarraySum_increasingValues() {
        assertEquals(14, solution.subarraySum(new int[]{1, 1, 2, 3}));
    }
}

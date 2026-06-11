package leonardo.savona.problems.p3701;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void alternatingSum_singleElement() {
        assertEquals(5, solution.alternatingSum(new int[]{5}));
    }

    @Test
    void alternatingSum_twoElements() {
        assertEquals(2, solution.alternatingSum(new int[]{5, 3}));
    }

    @Test
    void alternatingSum_allPositive() {
        assertEquals(3, solution.alternatingSum(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void alternatingSum_evenLength() {
        assertEquals(-4, solution.alternatingSum(new int[]{2, 4, 6, 8}));
    }

    @Test
    void alternatingSum_withZeros() {
        assertEquals(0, solution.alternatingSum(new int[]{0, 0, 0}));
    }

    @Test
    void alternatingSum_largeValues() {
        assertEquals(1000, solution.alternatingSum(new int[]{1000, 500, 500}));
    }
}

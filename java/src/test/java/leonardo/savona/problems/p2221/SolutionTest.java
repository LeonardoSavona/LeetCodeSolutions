package leonardo.savona.problems.p2221;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void triangularSum_singleElement() {
        assertEquals(7, solution.triangularSum(new int[]{7}));
    }

    @Test
    void triangularSum_twoElements() {
        assertEquals(4, solution.triangularSum(new int[]{1, 3}));
    }

    @Test
    void triangularSum_exampleFromProblem() {
        assertEquals(8, solution.triangularSum(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void triangularSum_allZeros() {
        assertEquals(0, solution.triangularSum(new int[]{0, 0, 0}));
    }

    @Test
    void triangularSum_withCarryOver() {
        assertEquals(0, solution.triangularSum(new int[]{5, 5, 5}));
    }

    @Test
    void triangularSum_longerArray() {
        assertEquals(0, solution.triangularSum(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}));
    }
}

package leonardo.savona.problems.p136;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void singleNumber_singleElement() {
        assertEquals(1, solution.singleNumber(new int[]{1}));
    }

    @Test
    void singleNumber_threeElements() {
        assertEquals(1, solution.singleNumber(new int[]{2, 2, 1}));
    }

    @Test
    void singleNumber_fiveElements() {
        assertEquals(4, solution.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    @Test
    void singleNumber_negativeNumbers() {
        assertEquals(-3, solution.singleNumber(new int[]{-1, -1, -3}));
    }

    @Test
    void singleNumber_mixedPositiveAndNegative() {
        assertEquals(5, solution.singleNumber(new int[]{-2, 5, -2, 3, 3}));
    }

    @Test
    void singleNumber_largerArray() {
        assertEquals(7, solution.singleNumber(new int[]{6, 6, 8, 8, 3, 3, 7}));
    }
}

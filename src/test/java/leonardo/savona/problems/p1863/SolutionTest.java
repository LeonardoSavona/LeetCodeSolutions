package leonardo.savona.problems.p1863;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void subsetXORSum_singleElement() {
        assertEquals(5, solution.subsetXORSum(new int[]{5}));
    }

    @Test
    void subsetXORSum_twoElements() {
        assertEquals(6, solution.subsetXORSum(new int[]{1, 3}));
    }

    @Test
    void subsetXORSum_threeElements() {
        assertEquals(28, solution.subsetXORSum(new int[]{5, 1, 6}));
    }

    @Test
    void subsetXORSum_allOnes() {
        assertEquals(4, solution.subsetXORSum(new int[]{1, 1, 1}));
    }

    @Test
    void subsetXORSum_typicalCase() {
        assertEquals(480, solution.subsetXORSum(new int[]{3, 4, 5, 6, 7, 8}));
    }

    @Test
    void subsetXORSum_twoPowerOfTwo() {
        assertEquals(12, solution.subsetXORSum(new int[]{2, 4}));
    }
}

package leonardo.savona.problems.p1512;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void numIdenticalPairs_allSame() {
        assertEquals(6, solution.numIdenticalPairs(new int[]{1, 1, 1, 1}));
    }

    @Test
    void numIdenticalPairs_typicalMixed() {
        assertEquals(4, solution.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
    }

    @Test
    void numIdenticalPairs_noGoodPairs() {
        assertEquals(0, solution.numIdenticalPairs(new int[]{1, 2, 3}));
    }

    @Test
    void numIdenticalPairs_singleElement() {
        assertEquals(0, solution.numIdenticalPairs(new int[]{5}));
    }

    @Test
    void numIdenticalPairs_twoEqualElements() {
        assertEquals(1, solution.numIdenticalPairs(new int[]{7, 7}));
    }

    @Test
    void numIdenticalPairs_multiplePairs() {
        assertEquals(3, solution.numIdenticalPairs(new int[]{1, 1, 1}));
    }
}

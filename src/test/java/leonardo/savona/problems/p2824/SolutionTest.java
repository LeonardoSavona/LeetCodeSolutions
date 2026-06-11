package leonardo.savona.problems.p2824;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void countPairs_typicalCase() {
        assertEquals(3, solution.countPairs(List.of(-1, 1, 2, 3, 1), 2));
    }

    @Test
    void countPairs_allPairsQualify() {
        assertEquals(3, solution.countPairs(List.of(1, 1, 1), 5));
    }

    @Test
    void countPairs_noPairsQualify() {
        assertEquals(0, solution.countPairs(List.of(5, 6, 7), 5));
    }

    @Test
    void countPairs_singleElement() {
        assertEquals(0, solution.countPairs(List.of(3), 10));
    }

    @Test
    void countPairs_negativeNumbers() {
        assertEquals(6, solution.countPairs(List.of(-3, -2, -1, 0), 0));
    }

    @Test
    void countPairs_targetBoundary() {
        assertEquals(1, solution.countPairs(List.of(1, 2, 3), 4));
    }
}

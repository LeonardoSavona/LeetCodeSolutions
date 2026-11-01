package leonardo.savona.problems.p961;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void repeatedNTimes_repeatedAtStart() {
        assertEquals(5, solution.repeatedNTimes(new int[]{5, 1, 5, 2}));
    }

    @Test
    void repeatedNTimes_repeatedAtEnd() {
        assertEquals(3, solution.repeatedNTimes(new int[]{1, 2, 3, 3}));
    }

    @Test
    void repeatedNTimes_largerArray() {
        assertEquals(2, solution.repeatedNTimes(new int[]{1, 2, 3, 2, 2, 4, 2, 5}));
    }

    @Test
    void repeatedNTimes_repeatedAdjacentElements() {
        assertEquals(7, solution.repeatedNTimes(new int[]{1, 7, 7, 2}));
    }

    @Test
    void repeatedNTimes_minimalArraySingleDistinct() {
        assertEquals(1, solution.repeatedNTimes(new int[]{1, 1}));
    }

    @Test
    void repeatedNTimes_repeatedInterspersed() {
        assertEquals(4, solution.repeatedNTimes(new int[]{4, 3, 4, 2, 1, 4, 4, 5}));
    }
}

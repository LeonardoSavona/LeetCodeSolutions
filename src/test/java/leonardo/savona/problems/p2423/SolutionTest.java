package leonardo.savona.problems.p2423;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void equalFrequency_singleChar_returnsTrue() {
        assertTrue(solution.equalFrequency("a"));
    }

    @Test
    void equalFrequency_allSameChar_returnsTrue() {
        assertTrue(solution.equalFrequency("bbb"));
    }

    @Test
    void equalFrequency_removeOneToEqualize_returnsTrue() {
        assertTrue(solution.equalFrequency("abcc"));
    }

    @Test
    void equalFrequency_alreadyEqualFrequency_returnsFalse() {
        assertFalse(solution.equalFrequency("aabb"));
    }

    @Test
    void equalFrequency_cannotEqualize_returnsFalse() {
        assertFalse(solution.equalFrequency("aazz"));
    }

    @Test
    void equalFrequency_removeHighestToEqualize_returnsTrue() {
        assertTrue(solution.equalFrequency("zz"));
    }
}

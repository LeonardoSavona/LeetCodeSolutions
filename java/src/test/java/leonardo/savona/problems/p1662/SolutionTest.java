package leonardo.savona.problems.p1662;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void arrayStringsAreEqual_equivalentMultiWordArrays() {
        assertTrue(solution.arrayStringsAreEqual(
                new String[]{"ab", "c"},
                new String[]{"a", "bc"}
        ));
    }

    @Test
    void arrayStringsAreEqual_notEquivalentArrays() {
        assertFalse(solution.arrayStringsAreEqual(
                new String[]{"a", "cb"},
                new String[]{"ab", "c"}
        ));
    }

    @Test
    void arrayStringsAreEqual_singleWordEachEqual() {
        assertTrue(solution.arrayStringsAreEqual(
                new String[]{"abc"},
                new String[]{"abc"}
        ));
    }

    @Test
    void arrayStringsAreEqual_singleWordEachNotEqual() {
        assertFalse(solution.arrayStringsAreEqual(
                new String[]{"abc"},
                new String[]{"abd"}
        ));
    }

    @Test
    void arrayStringsAreEqual_singleCharEachEqual() {
        assertTrue(solution.arrayStringsAreEqual(
                new String[]{"a"},
                new String[]{"a"}
        ));
    }

    @Test
    void arrayStringsAreEqual_differentTotalLengths() {
        assertFalse(solution.arrayStringsAreEqual(
                new String[]{"abc", "d"},
                new String[]{"ab", "c"}
        ));
    }
}

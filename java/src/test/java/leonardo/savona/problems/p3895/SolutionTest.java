package leonardo.savona.problems.p3895;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void countDigitOccurrences_singleElementMatchingDigit() {
        assertEquals(1, solution.countDigitOccurrences(new int[]{5}, 5));
    }

    @Test
    void countDigitOccurrences_singleElementNonMatchingDigit() {
        assertEquals(0, solution.countDigitOccurrences(new int[]{3}, 7));
    }

    @Test
    void countDigitOccurrences_digitAppearsMultipleTimesInOneNumber() {
        assertEquals(3, solution.countDigitOccurrences(new int[]{111}, 1));
    }

    @Test
    void countDigitOccurrences_digitSpreadAcrossMultipleNumbers() {
        assertEquals(4, solution.countDigitOccurrences(new int[]{12, 21, 31, 13}, 1));
    }

    @Test
    void countDigitOccurrences_noOccurrences() {
        assertEquals(0, solution.countDigitOccurrences(new int[]{222, 333, 444}, 9));
    }

    @Test
    void countDigitOccurrences_mixedMultiDigitNumbers() {
        assertEquals(5, solution.countDigitOccurrences(new int[]{123, 321, 13, 31, 1}, 1));
    }
}

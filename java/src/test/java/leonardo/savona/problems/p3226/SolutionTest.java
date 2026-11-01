package leonardo.savona.problems.p3226;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void minChanges_sameValues_returnsZero() {
        assertEquals(0, solution.minChanges(13, 13));
    }

    @Test
    void minChanges_zeroBoth_returnsZero() {
        assertEquals(0, solution.minChanges(0, 0));
    }

    @Test
    void minChanges_goalHasBitNotInStart_returnsMinusOne() {
        assertEquals(-1, solution.minChanges(4, 7));
    }

    @Test
    void minChanges_startHasExtraBits_returnsCount() {
        assertEquals(3, solution.minChanges(7, 0));
    }

    @Test
    void minChanges_typicalCase_returnsCorrectCount() {
        assertEquals(1, solution.minChanges(13, 5));
    }

    @Test
    void minChanges_startSupersetOfGoal_returnsCorrectCount() {
        assertEquals(2, solution.minChanges(15, 5));
    }
}

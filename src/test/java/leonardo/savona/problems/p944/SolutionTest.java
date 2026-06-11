package leonardo.savona.problems.p944;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void minDeletionSize_allColumnsSorted() {
        assertEquals(1, solution.minDeletionSize(new String[]{"cba", "daf", "ghi"}));
    }

    @Test
    void minDeletionSize_noColumnsToDelete() {
        assertEquals(1, solution.minDeletionSize(new String[]{"abc", "bce", "cae"}));
    }

    @Test
    void minDeletionSize_allColumnsUnsorted() {
        assertEquals(3, solution.minDeletionSize(new String[]{"zyx", "wvu", "tsr"}));
    }

    @Test
    void minDeletionSize_singleRow() {
        assertEquals(0, solution.minDeletionSize(new String[]{"abc"}));
    }

    @Test
    void minDeletionSize_singleColumn() {
        assertEquals(1, solution.minDeletionSize(new String[]{"b", "a", "c"}));
    }

    @Test
    void minDeletionSize_identicalRows() {
        assertEquals(0, solution.minDeletionSize(new String[]{"abc", "abc", "abc"}));
    }
}

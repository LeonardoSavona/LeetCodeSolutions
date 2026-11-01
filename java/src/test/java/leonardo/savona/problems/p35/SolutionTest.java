package leonardo.savona.problems.p35;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void searchInsert_targetPresent() {
        assertEquals(2, solution.searchInsert(new int[]{1, 3, 5, 6}, 5));
    }

    @Test
    void searchInsert_targetNotPresentMiddle() {
        assertEquals(1, solution.searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

    @Test
    void searchInsert_targetNotPresentEnd() {
        assertEquals(4, solution.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

    @Test
    void searchInsert_targetNotPresentBeginning() {
        assertEquals(0, solution.searchInsert(new int[]{1, 3, 5, 6}, 0));
    }

    @Test
    void searchInsert_singleElementEqual() {
        assertEquals(0, solution.searchInsert(new int[]{1}, 1));
    }

    @Test
    void searchInsert_singleElementGreater() {
        assertEquals(0, solution.searchInsert(new int[]{5}, 3));
    }
}

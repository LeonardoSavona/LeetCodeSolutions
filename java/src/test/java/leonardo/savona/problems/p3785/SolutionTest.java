package leonardo.savona.problems.p3785;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void minSwaps_noForbiddenConflicts_returnsZero() {
        int[] nums = {1, 2, 3};
        int[] forbidden = {4, 5, 6};
        assertEquals(0, solution.minSwaps(nums, forbidden));
    }

    @Test
    void minSwaps_singleElement_conflict_returnsMinusOne() {
        int[] nums = {1};
        int[] forbidden = {1};
        assertEquals(-1, solution.minSwaps(nums, forbidden));
    }

    @Test
    void minSwaps_allConflicting_drivenByHalfRoundUp() {
        int[] nums = {1, 2, 3, 4};
        int[] forbidden = {1, 2, 3, 4};
        assertEquals(2, solution.minSwaps(nums, forbidden));
    }

    @Test
    void minSwaps_someConflicts_drivenByHalfRoundUp() {
        int[] nums = {1, 2, 3, 4};
        int[] forbidden = {1, 2, 5, 6};
        assertEquals(1, solution.minSwaps(nums, forbidden));
    }

    @Test
    void minSwaps_repeatedConflictValue_drivenByMaxFreq() {
        int[] nums = {1, 1, 1, 4};
        int[] forbidden = {1, 1, 1, 5};
        assertEquals(-1, solution.minSwaps(nums, forbidden));
    }

    @Test
    void minSwaps_mixedConflicts_returnsCorrectResult() {
        int[] nums = {3, 1, 2, 3, 3};
        int[] forbidden = {3, 4, 6, 3, 3};
        assertEquals(-1, solution.minSwaps(nums, forbidden));
    }
}

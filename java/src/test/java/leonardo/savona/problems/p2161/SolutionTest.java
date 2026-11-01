package leonardo.savona.problems.p2161;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void pivotArray_typicalCase() {
        assertArrayEquals(new int[]{9, 5, 3, 10, 12}, solution.pivotArray(new int[]{9, 12, 5, 10, 3}, 10));
    }

    @Test
    void pivotArray_multiplePivotOccurrences() {
        assertArrayEquals(new int[]{1, 2, 4, 4, 8, 6}, solution.pivotArray(new int[]{4, 1, 8, 4, 2, 6}, 4));
    }

    @Test
    void pivotArray_allEqualToPivot() {
        assertArrayEquals(new int[]{5, 5, 5}, solution.pivotArray(new int[]{5, 5, 5}, 5));
    }

    @Test
    void pivotArray_singleElement_equalToPivot() {
        assertArrayEquals(new int[]{3}, solution.pivotArray(new int[]{3}, 3));
    }

    @Test
    void pivotArray_noElementsLessThanPivot() {
        assertArrayEquals(new int[]{7, 9, 8}, solution.pivotArray(new int[]{9, 8, 7}, 7));
    }

    @Test
    void pivotArray_noElementsGreaterThanPivot() {
        assertArrayEquals(new int[]{2, 1, 3}, solution.pivotArray(new int[]{3, 2, 1}, 3));
    }
}

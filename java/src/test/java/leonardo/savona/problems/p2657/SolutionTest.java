package leonardo.savona.problems.p2657;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void findThePrefixCommonArray_singleElement_bothSame() {
        assertArrayEquals(new int[]{1}, solution.findThePrefixCommonArray(new int[]{1}, new int[]{1}));
    }

    @Test
    void findThePrefixCommonArray_twoElements_noInitialOverlap() {
        assertArrayEquals(new int[]{0, 2}, solution.findThePrefixCommonArray(new int[]{1, 2}, new int[]{2, 1}));
    }

    @Test
    void findThePrefixCommonArray_typicalCase_fourElements() {
        assertArrayEquals(new int[]{0, 2, 3, 4}, solution.findThePrefixCommonArray(new int[]{1, 3, 2, 4}, new int[]{3, 1, 2, 4}));
    }

    @Test
    void findThePrefixCommonArray_typicalCase_identicalArrays() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, solution.findThePrefixCommonArray(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}));
    }

    @Test
    void findThePrefixCommonArray_reversedArrays_growsSlowly() {
        assertArrayEquals(new int[]{0, 0, 2, 4}, solution.findThePrefixCommonArray(new int[]{1, 2, 3, 4}, new int[]{4, 3, 2, 1}));
    }

    @Test
    void findThePrefixCommonArray_largerInput_correctCounts() {
        int[] A = {2, 3, 1, 4, 5};
        int[] B = {3, 2, 4, 1, 5};
        assertArrayEquals(new int[]{0, 2, 2, 4, 5}, solution.findThePrefixCommonArray(A, B));
    }
}

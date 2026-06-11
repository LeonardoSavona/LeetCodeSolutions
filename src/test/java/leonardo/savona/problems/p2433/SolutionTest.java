package leonardo.savona.problems.p2433;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void findArray_singleElement() {
        assertArrayEquals(new int[]{5}, solution.findArray(new int[]{5}));
    }

    @Test
    void findArray_twoElements() {
        assertArrayEquals(new int[]{5, 2}, solution.findArray(new int[]{5, 7}));
    }

    @Test
    void findArray_allSamePrefix() {
        assertArrayEquals(new int[]{3, 0, 0, 0}, solution.findArray(new int[]{3, 3, 3, 3}));
    }

    @Test
    void findArray_typicalCase() {
        assertArrayEquals(new int[]{5, 2, 0, 3, 1}, solution.findArray(new int[]{5, 7, 7, 4, 5}));
    }

    @Test
    void findArray_zeroPrefixes() {
        assertArrayEquals(new int[]{0, 0, 0}, solution.findArray(new int[]{0, 0, 0}));
    }

    @Test
    void findArray_largeBitValues() {
        assertArrayEquals(new int[]{1000000000, 1000000003}, solution.findArray(new int[]{1000000000, 3}));
    }
}

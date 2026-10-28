package leonardo.savona.problems.p852;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void peakIndexInMountainArray_minimal() {
        assertEquals(1, solution.peakIndexInMountainArray(new int[]{0, 1, 0}));
    }

    @Test
    void peakIndexInMountainArray_example2() {
        assertEquals(1, solution.peakIndexInMountainArray(new int[]{0, 2, 1, 0}));
    }

    @Test
    void peakIndexInMountainArray_example3() {
        assertEquals(1, solution.peakIndexInMountainArray(new int[]{0, 10, 5, 2}));
    }

    @Test
    void peakIndexInMountainArray_peakNearEnd() {
        assertEquals(4, solution.peakIndexInMountainArray(new int[]{1, 2, 3, 4, 5, 3}));
    }

    @Test
    void peakIndexInMountainArray_peakInMiddle() {
        assertEquals(3, solution.peakIndexInMountainArray(new int[]{1, 3, 5, 7, 6, 4, 2}));
    }

    @Test
    void peakIndexInMountainArray_longDescent() {
        assertEquals(3, solution.peakIndexInMountainArray(
                new int[]{55, 59, 63, 99, 97, 94, 84, 81, 79, 66, 40, 38, 33, 23, 22, 21, 17, 9, 7}));
    }
}

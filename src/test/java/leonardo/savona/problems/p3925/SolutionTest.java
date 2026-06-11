package leonardo.savona.problems.p3925;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void concatWithReverse_singleElement() {
        assertArrayEquals(new int[]{7, 7}, Solution.concatWithReverse(new int[]{7}));
    }

    @Test
    void concatWithReverse_twoElements() {
        assertArrayEquals(new int[]{1, 2, 2, 1}, Solution.concatWithReverse(new int[]{1, 2}));
    }

    @Test
    void concatWithReverse_typicalCase() {
        assertArrayEquals(new int[]{1, 2, 3, 3, 2, 1}, Solution.concatWithReverse(new int[]{1, 2, 3}));
    }

    @Test
    void concatWithReverse_allSameElements() {
        assertArrayEquals(new int[]{5, 5, 5, 5, 5, 5}, Solution.concatWithReverse(new int[]{5, 5, 5}));
    }

    @Test
    void concatWithReverse_longerArray() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 5, 4, 3, 2, 1}, Solution.concatWithReverse(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void concatWithReverse_resultLengthIsDoubled() {
        int[] input = new int[]{10, 20, 30};
        int[] result = Solution.concatWithReverse(input);
        assertEquals(input.length * 2, result.length);
    }
}

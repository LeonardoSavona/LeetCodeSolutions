package leonardo.savona.problems.p260;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void singleNumber_typicalCase() {
        int[] result = solution.singleNumber(new int[]{1, 2, 1, 3, 2, 5});
        Arrays.sort(result);
        assertArrayEquals(new int[]{3, 5}, result);
    }

    @Test
    void singleNumber_negativesAndPositives() {
        int[] result = solution.singleNumber(new int[]{-1, -1, 7, 3, 3, 9, 9, 7, 4, -3});
        Arrays.sort(result);
        assertArrayEquals(new int[]{-3, 4}, result);
    }

    @Test
    void singleNumber_twoElementsOnly() {
        int[] result = solution.singleNumber(new int[]{5, 7});
        Arrays.sort(result);
        assertArrayEquals(new int[]{5, 7}, result);
    }

    @Test
    void singleNumber_withZero() {
        int[] result = solution.singleNumber(new int[]{0, 1, 0, 2, 2, 3, 3, 4});
        Arrays.sort(result);
        assertArrayEquals(new int[]{1, 4}, result);
    }

    @Test
    void singleNumber_largerInput() {
        int[] result = solution.singleNumber(new int[]{10, 20, 10, 30, 20, 40, 40, 50, 50, 60});
        Arrays.sort(result);
        assertArrayEquals(new int[]{30, 60}, result);
    }

    @Test
    void singleNumber_resultHasTwoElements() {
        int[] result = solution.singleNumber(new int[]{4, 4, 8, 8, 15, 16});
        assertNotNull(result);
        assertEquals(2, result.length);
        Arrays.sort(result);
        assertArrayEquals(new int[]{15, 16}, result);
    }
}

package leonardo.savona.problems.p338;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void countBits_zero() {
        assertArrayEquals(new int[]{0}, solution.countBits(0));
    }

    @Test
    void countBits_two() {
        assertArrayEquals(new int[]{0, 1, 1}, solution.countBits(2));
    }

    @Test
    void countBits_five() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, solution.countBits(5));
    }

    @Test
    void countBits_large() {
        int[] result = solution.countBits(1000);
        assertEquals(1001, result.length);
        assertEquals(Integer.bitCount(1000), result[1000]);
    }
}

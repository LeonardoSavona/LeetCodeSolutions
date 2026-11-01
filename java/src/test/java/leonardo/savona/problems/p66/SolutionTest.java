package leonardo.savona.problems.p66;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void plusOne_singleDigit() {
        assertArrayEquals(new int[]{2}, solution.plusOne(new int[]{1}));
    }

    @Test
    void plusOne_noCarry() {
        assertArrayEquals(new int[]{1, 2, 4}, solution.plusOne(new int[]{1, 2, 3}));
    }

    @Test
    void plusOne_lastDigitNine() {
        assertArrayEquals(new int[]{1, 3, 0}, solution.plusOne(new int[]{1, 2, 9}));
    }

    @Test
    void plusOne_allNines() {
        assertArrayEquals(new int[]{1, 0, 0, 0}, solution.plusOne(new int[]{9, 9, 9}));
    }

    @Test
    void plusOne_singleNine() {
        assertArrayEquals(new int[]{1, 0}, solution.plusOne(new int[]{9}));
    }

    @Test
    void plusOne_multipleTrailingNines() {
        assertArrayEquals(new int[]{2, 0, 0}, solution.plusOne(new int[]{1, 9, 9}));
    }
}

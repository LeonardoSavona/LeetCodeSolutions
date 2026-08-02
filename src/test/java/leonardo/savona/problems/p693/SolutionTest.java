package leonardo.savona.problems.p693;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void hasAlternatingBits_five() {
        // 101b
        assertTrue(solution.hasAlternatingBits(5));
    }

    @Test
    void hasAlternatingBits_seven() {
        // 111b
        assertFalse(solution.hasAlternatingBits(7));
    }

    @Test
    void hasAlternatingBits_eleven() {
        // 1011b
        assertFalse(solution.hasAlternatingBits(11));
    }

    @Test
    void hasAlternatingBits_ten() {
        // 1010b
        assertTrue(solution.hasAlternatingBits(10));
    }

    @Test
    void hasAlternatingBits_one() {
        assertTrue(solution.hasAlternatingBits(1));
    }

    @Test
    void hasAlternatingBits_largeAlternating() {
        // 1431655765 = 0101...01b, the largest alternating positive int
        assertTrue(solution.hasAlternatingBits(1431655765));
    }
}

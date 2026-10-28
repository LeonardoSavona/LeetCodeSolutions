package leonardo.savona.problems.p3945;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void digitFrequencyScore_example1() {
        // 1 * 1 + 2 * 2
        assertEquals(5, solution.digitFrequencyScore(122));
    }

    @Test
    void digitFrequencyScore_example2() {
        // 0 * 1 + 1 * 2
        assertEquals(2, solution.digitFrequencyScore(101));
    }

    @Test
    void digitFrequencyScore_singleDigit() {
        assertEquals(1, solution.digitFrequencyScore(1));
    }

    @Test
    void digitFrequencyScore_upperBound() {
        assertEquals(1, solution.digitFrequencyScore(1_000_000_000));
    }

    @Test
    void digitFrequencyScore_allNines() {
        // 9 * 9
        assertEquals(81, solution.digitFrequencyScore(999_999_999));
    }

    @Test
    void digitFrequencyScore_allDistinct() {
        assertEquals(45, solution.digitFrequencyScore(987_654_321));
    }
}

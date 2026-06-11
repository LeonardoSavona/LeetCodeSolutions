package leonardo.savona.problems.p2220;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void minBitFlips_sameNumber() {
        assertEquals(0, solution.minBitFlips(5, 5));
    }

    @Test
    void minBitFlips_singleBitDifference() {
        assertEquals(1, solution.minBitFlips(4, 5));
    }

    @Test
    void minBitFlips_exampleFromProblem() {
        assertEquals(3, solution.minBitFlips(10, 7));
    }

    @Test
    void minBitFlips_allBitsDifferent() {
        assertEquals(1, solution.minBitFlips(0, 1));
    }

    @Test
    void minBitFlips_multipleBitsDifferent() {
        assertEquals(3, solution.minBitFlips(3, 4));
    }

    @Test
    void minBitFlips_largeDifference() {
        assertEquals(4, solution.minBitFlips(0, 15));
    }
}

package leonardo.savona.problems.p1281;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void subtractProductAndSum_singleDigit() {
        assertEquals(0, solution.subtractProductAndSum(5));
    }

    @Test
    void subtractProductAndSum_twoDigits() {
        assertEquals(15, solution.subtractProductAndSum(234));
    }

    @Test
    void subtractProductAndSum_exampleFromProblem() {
        assertEquals(21, solution.subtractProductAndSum(4421));
    }

    @Test
    void subtractProductAndSum_withZeroDigit() {
        assertEquals(-6, solution.subtractProductAndSum(105));
    }

    @Test
    void subtractProductAndSum_allSameDigits() {
        assertEquals(3, solution.subtractProductAndSum(33));
    }

    @Test
    void subtractProductAndSum_largeNumber() {
        assertEquals(702, solution.subtractProductAndSum(999));
    }
}

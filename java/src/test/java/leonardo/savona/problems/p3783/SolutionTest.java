package leonardo.savona.problems.p3783;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void mirrorDistance_palindrome() {
        assertEquals(0, solution.mirrorDistance(121));
    }

    @Test
    void mirrorDistance_singleDigit() {
        assertEquals(0, solution.mirrorDistance(7));
    }

    @Test
    void mirrorDistance_twoDigitNonPalindrome() {
        assertEquals(72, solution.mirrorDistance(19));
    }

    @Test
    void mirrorDistance_typicalCase() {
        assertEquals(27, solution.mirrorDistance(14));
    }

    @Test
    void mirrorDistance_largeNumber() {
        assertEquals(9, solution.mirrorDistance(10));
    }

    @Test
    void mirrorDistance_multiDigitPalindrome() {
        assertEquals(0, solution.mirrorDistance(12321));
    }
}

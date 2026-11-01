package leonardo.savona.problems.p2396;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void isStrictlyPalindromic_four_returnsFalse() {
        assertFalse(Solution.isStrictlyPalindromic(4));
    }

    @Test
    void isStrictlyPalindromic_smallNumber_returnsFalse() {
        assertFalse(Solution.isStrictlyPalindromic(9));
    }

    @Test
    void isStrictlyPalindromic_largeNumber_returnsFalse() {
        assertFalse(Solution.isStrictlyPalindromic(100));
    }

    @Test
    void isStrictlyPalindromic_nEquals5_returnsFalse() {
        assertFalse(Solution.isStrictlyPalindromic(5));
    }

    @Test
    void isStrictlyPalindromic_nEquals50_returnsFalse() {
        assertFalse(Solution.isStrictlyPalindromic(50));
    }

    @Test
    void isStrictlyPalindromic_maxConstraint_returnsFalse() {
        assertFalse(Solution.isStrictlyPalindromic(1000000));
    }
}

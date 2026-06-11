package leonardo.savona.problems.p9;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void isPalindrome_singleDigit() {
        assertTrue(solution.isPalindrome(0));
        assertTrue(solution.isPalindrome(5));
        assertTrue(solution.isPalindrome(9));
    }

    @Test
    void isPalindrome_negativeNumber() {
        assertFalse(solution.isPalindrome(-1));
        assertFalse(solution.isPalindrome(-121));
    }

    @Test
    void isPalindrome_typicalPalindrome() {
        assertTrue(solution.isPalindrome(121));
        assertTrue(solution.isPalindrome(1221));
        assertTrue(solution.isPalindrome(12321));
    }

    @Test
    void isPalindrome_notPalindrome() {
        assertFalse(solution.isPalindrome(10));
        assertFalse(solution.isPalindrome(123));
        assertFalse(solution.isPalindrome(1231));
    }

    @Test
    void isPalindrome_largepalindrome() {
        assertTrue(solution.isPalindrome(1000000001));
    }

    @Test
    void isPalindrome_trailingZero() {
        assertFalse(solution.isPalindrome(100));
        assertFalse(solution.isPalindrome(1000));
    }
}

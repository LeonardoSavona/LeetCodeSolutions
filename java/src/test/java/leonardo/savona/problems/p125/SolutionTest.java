package leonardo.savona.problems.p125;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void isPalindrome_typicalAlphanumericMixed() {
        assertTrue(Solution.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void isPalindrome_notPalindrome() {
        assertFalse(Solution.isPalindrome("race a car"));
    }

    @Test
    void isPalindrome_emptyString() {
        assertTrue(Solution.isPalindrome(""));
    }

    @Test
    void isPalindrome_onlyNonAlphanumericChars() {
        assertTrue(Solution.isPalindrome(" "));
    }

    @Test
    void isPalindrome_singleAlphanumericChar() {
        assertTrue(Solution.isPalindrome("a"));
    }

    @Test
    void isPalindrome_mixedCasePalindrome() {
        assertTrue(Solution.isPalindrome("No 'x' in Nixon"));
    }
}

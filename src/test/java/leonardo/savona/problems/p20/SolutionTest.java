package leonardo.savona.problems.p20;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void isValid_emptyString() {
        assertTrue(solution.isValid(""));
    }

    @Test
    void isValid_singlePairParentheses() {
        assertTrue(solution.isValid("()"));
    }

    @Test
    void isValid_mixedValidBrackets() {
        assertTrue(solution.isValid("()[]{}"));
    }

    @Test
    void isValid_nestedValidBrackets() {
        assertTrue(solution.isValid("{[()]}"));
    }

    @Test
    void isValid_mismatchedBrackets() {
        assertFalse(solution.isValid("(]"));
    }

    @Test
    void isValid_unmatchedOpenBracket() {
        assertFalse(solution.isValid("([{"));
    }
}

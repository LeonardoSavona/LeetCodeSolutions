package leonardo.savona.problems.p392;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void isSubsequence_emptyS_returnsTrue() {
        assertTrue(solution.isSubsequence("", "ahbgdc"));
    }

    @Test
    void isSubsequence_emptyBothStrings_returnsTrue() {
        assertTrue(solution.isSubsequence("", ""));
    }

    @Test
    void isSubsequence_validSubsequence_returnsTrue() {
        assertTrue(solution.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    void isSubsequence_notASubsequence_returnsFalse() {
        assertFalse(solution.isSubsequence("axc", "ahbgdc"));
    }

    @Test
    void isSubsequence_sEqualsT_returnsTrue() {
        assertTrue(solution.isSubsequence("abc", "abc"));
    }

    @Test
    void isSubsequence_sLongerThanT_returnsFalse() {
        assertFalse(solution.isSubsequence("abcd", "abc"));
    }
}

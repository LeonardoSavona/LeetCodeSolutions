package leonardo.savona.problems.p28;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void strStr_needleAtStart() {
        assertEquals(0, solution.strStr("hello", "hel"));
    }

    @Test
    void strStr_needleInMiddle() {
        assertEquals(2, solution.strStr("hello", "ll"));
    }

    @Test
    void strStr_needleNotFound() {
        assertEquals(-1, solution.strStr("aaaaa", "bba"));
    }

    @Test
    void strStr_emptyNeedle() {
        assertEquals(0, solution.strStr("hello", ""));
    }

    @Test
    void strStr_needleEqualsHaystack() {
        assertEquals(0, solution.strStr("abc", "abc"));
    }

    @Test
    void strStr_needleLongerThanHaystack() {
        assertEquals(-1, solution.strStr("ab", "abc"));
    }
}

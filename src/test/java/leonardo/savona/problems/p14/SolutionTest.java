package leonardo.savona.problems.p14;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void longestCommonPrefix_commonPrefixExists() {
        assertEquals("fl", solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    @Test
    void longestCommonPrefix_noCommonPrefix() {
        assertEquals("", solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

    @Test
    void longestCommonPrefix_singleElement() {
        assertEquals("hello", solution.longestCommonPrefix(new String[]{"hello"}));
    }

    @Test
    void longestCommonPrefix_allIdentical() {
        assertEquals("test", solution.longestCommonPrefix(new String[]{"test", "test", "test"}));
    }

    @Test
    void longestCommonPrefix_firstStringIsShortest() {
        assertEquals("ab", solution.longestCommonPrefix(new String[]{"ab", "abc", "abcd"}));
    }

    @Test
    void longestCommonPrefix_emptyCommonPrefix() {
        assertEquals("", solution.longestCommonPrefix(new String[]{"a", "b"}));
    }
}

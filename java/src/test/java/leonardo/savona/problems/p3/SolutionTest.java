package leonardo.savona.problems.p3;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void lengthOfLongestSubstring_emptyString() {
        assertEquals(0, Solution.lengthOfLongestSubstring(""));
    }

    @Test
    void lengthOfLongestSubstring_singleCharacter() {
        assertEquals(1, Solution.lengthOfLongestSubstring("a"));
    }

    @Test
    void lengthOfLongestSubstring_allUniqueCharacters() {
        assertEquals(3, Solution.lengthOfLongestSubstring("abc"));
    }

    @Test
    void lengthOfLongestSubstring_allRepeatingCharacters() {
        assertEquals(1, Solution.lengthOfLongestSubstring("bbbb"));
    }

    @Test
    void lengthOfLongestSubstring_mixedWithRepeats() {
        assertEquals(3, Solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void lengthOfLongestSubstring_longestAtEnd() {
        assertEquals(6, Solution.lengthOfLongestSubstring("aabcdef"));
    }
}

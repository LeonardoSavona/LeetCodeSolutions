package leonardo.savona.problems.p242;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void isAnagram_example1() {
        assertTrue(solution.isAnagram("anagram", "nagaram"));
    }

    @Test
    void isAnagram_example2() {
        assertFalse(solution.isAnagram("rat", "car"));
    }

    @Test
    void isAnagram_sameString() {
        assertTrue(solution.isAnagram("abc", "abc"));
    }

    @Test
    void isAnagram_singleChar() {
        assertTrue(solution.isAnagram("a", "a"));
        assertFalse(solution.isAnagram("a", "b"));
    }

    @Test
    void isAnagram_differentLengths() {
        assertFalse(solution.isAnagram("ab", "a"));
        assertFalse(solution.isAnagram("a", "ab"));
    }

    @Test
    void isAnagram_sameLettersDifferentCounts() {
        assertFalse(solution.isAnagram("aabb", "abbb"));
    }

    @Test
    void isAnagram_repeatedChars() {
        assertTrue(solution.isAnagram("aabbcc", "ccbbaa"));
    }

    @Test
    void isAnagram_emptyStrings() {
        assertTrue(solution.isAnagram("", ""));
    }
}

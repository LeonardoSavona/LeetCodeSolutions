package leonardo.savona.problems.p1684;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void countConsistentStrings_allWordsConsistent() {
        assertEquals(2, solution.countConsistentStrings("ab", new String[]{"ad", "bd", "aaab", "baa", "badab"}));
    }

    @Test
    void countConsistentStrings_allWordsAllowed() {
        assertEquals(7, solution.countConsistentStrings("abc", new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"}));
    }

    @Test
    void countConsistentStrings_noWordsConsistent() {
        assertEquals(0, solution.countConsistentStrings("ab", new String[]{"cd", "ef", "gh"}));
    }

    @Test
    void countConsistentStrings_singleLetterAllowed() {
        assertEquals(3, solution.countConsistentStrings("a", new String[]{"a", "aa", "aaa", "b", "ab"}));
    }

    @Test
    void countConsistentStrings_emptyWords() {
        assertEquals(0, solution.countConsistentStrings("abc", new String[]{}));
    }

    @Test
    void countConsistentStrings_singleCharWords() {
        assertEquals(3, solution.countConsistentStrings("xyz", new String[]{"x", "y", "z", "a", "b"}));
    }
}

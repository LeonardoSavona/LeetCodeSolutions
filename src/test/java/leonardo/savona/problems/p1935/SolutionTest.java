package leonardo.savona.problems.p1935;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void canBeTypedWords_example() {
        assertEquals(1, solution.canBeTypedWords("hello world", "ad"));
    }

    @Test
    void canBeTypedWords_oneWordSurvives() {
        // "leet" needs l and t, "code" needs neither
        assertEquals(1, solution.canBeTypedWords("leet code", "lt"));
    }

    @Test
    void canBeTypedWords_everyWordBroken() {
        // both words contain e
        assertEquals(0, solution.canBeTypedWords("leet code", "e"));
    }

    @Test
    void canBeTypedWords_noBrokenLetters() {
        assertEquals(3, solution.canBeTypedWords("one two three", ""));
    }

    @Test
    void canBeTypedWords_singleWordTypable() {
        assertEquals(1, solution.canBeTypedWords("abc", "z"));
    }

    @Test
    void canBeTypedWords_lastWordBroken() {
        assertEquals(1, solution.canBeTypedWords("abc xyz", "x"));
    }
}

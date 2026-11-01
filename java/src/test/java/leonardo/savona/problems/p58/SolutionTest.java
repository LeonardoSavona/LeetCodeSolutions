package leonardo.savona.problems.p58;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void lengthOfLastWord_singleWord() {
        assertEquals(5, solution.lengthOfLastWord("Hello"));
    }

    @Test
    void lengthOfLastWord_twoWords() {
        assertEquals(5, solution.lengthOfLastWord("Hello World"));
    }

    @Test
    void lengthOfLastWord_trailingSpaces() {
        assertEquals(4, solution.lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    void lengthOfLastWord_multipleTrailingSpaces() {
        assertEquals(6, solution.lengthOfLastWord("luffy is still joyboy   "));
    }

    @Test
    void lengthOfLastWord_singleCharacter() {
        assertEquals(1, solution.lengthOfLastWord("a"));
    }

    @Test
    void lengthOfLastWord_singleCharacterWithSpaces() {
        assertEquals(1, solution.lengthOfLastWord("   a   "));
    }
}

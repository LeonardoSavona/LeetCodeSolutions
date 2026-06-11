package leonardo.savona.problems.p2000;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void reversePrefix_charFoundInMiddle() {
        assertEquals("dcbaefd", solution.reversePrefix("abcdefd", 'd'));
    }

    @Test
    void reversePrefix_charIsFirstChar() {
        assertEquals("abcde", solution.reversePrefix("abcde", 'a'));
    }

    @Test
    void reversePrefix_charIsLastChar() {
        assertEquals("edcba", solution.reversePrefix("abcde", 'e'));
    }

    @Test
    void reversePrefix_charNotPresent() {
        assertEquals("abcde", solution.reversePrefix("abcde", 'z'));
    }

    @Test
    void reversePrefix_singleCharWordMatch() {
        assertEquals("x", solution.reversePrefix("x", 'x'));
    }

    @Test
    void reversePrefix_duplicateCharUsesFirstOccurrence() {
        assertEquals("cbadef", solution.reversePrefix("abcdef", 'c'));
    }
}

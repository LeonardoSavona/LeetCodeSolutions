package leonardo.savona.problems.p1859;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void sortSentence_example1() {
        assertEquals("This is a sentence", solution.sortSentence("is2 sentence4 This1 a3"));
    }

    @Test
    void sortSentence_example2() {
        assertEquals("Me Myself and I", solution.sortSentence("Myself2 Me1 I4 and3"));
    }

    @Test
    void sortSentence_singleWord() {
        assertEquals("Hello", solution.sortSentence("Hello1"));
    }

    @Test
    void sortSentence_twoWords() {
        assertEquals("Good morning", solution.sortSentence("morning2 Good1"));
    }

    @Test
    void sortSentence_alreadyOrdered() {
        assertEquals("one two three", solution.sortSentence("one1 two2 three3"));
    }

    @Test
    void sortSentence_reverseOrder() {
        assertEquals("a b c d e", solution.sortSentence("e5 d4 c3 b2 a1"));
    }
}

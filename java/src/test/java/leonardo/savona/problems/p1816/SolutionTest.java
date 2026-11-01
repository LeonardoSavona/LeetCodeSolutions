package leonardo.savona.problems.p1816;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void truncateSentence_typicalThreeWords() {
        assertEquals("Hello how are", solution.truncateSentence("Hello how are you", 3));
    }

    @Test
    void truncateSentence_firstWordOnly() {
        assertEquals("Hello", solution.truncateSentence("Hello how are you", 1));
    }

    @Test
    void truncateSentence_allWords() {
        assertEquals("Hello how are you", solution.truncateSentence("Hello how are you", 4));
    }

    @Test
    void truncateSentence_singleWord() {
        assertEquals("chopper", solution.truncateSentence("chopper", 1));
    }

    @Test
    void truncateSentence_twoWordsFromLongerSentence() {
        assertEquals("What is", solution.truncateSentence("What is the answer", 2));
    }

    @Test
    void truncateSentence_exactSentenceLength() {
        assertEquals("a b c", solution.truncateSentence("a b c", 3));
    }
}

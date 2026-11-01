package leonardo.savona.problems.p2114;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void mostWordsFound_singleSentenceSingleWord() {
        assertEquals(1, solution.mostWordsFound(new String[]{"hello"}));
    }

    @Test
    void mostWordsFound_singleSentenceMultipleWords() {
        assertEquals(4, solution.mostWordsFound(new String[]{"the quick brown fox"}));
    }

    @Test
    void mostWordsFound_multipleSentencesPicksMax() {
        assertEquals(6, solution.mostWordsFound(new String[]{
            "alice and bob love leetcode",
            "i think so too",
            "this is great thanks very much"
        }));
    }

    @Test
    void mostWordsFound_allSentencesSameWordCount() {
        assertEquals(3, solution.mostWordsFound(new String[]{
            "one two three",
            "four five six",
            "seven eight nine"
        }));
    }

    @Test
    void mostWordsFound_maxAtFirstSentence() {
        assertEquals(5, solution.mostWordsFound(new String[]{
            "a b c d e",
            "x y",
            "hello world"
        }));
    }

    @Test
    void mostWordsFound_singleElementArray() {
        assertEquals(3, solution.mostWordsFound(new String[]{"please subscribe now"}));
    }
}

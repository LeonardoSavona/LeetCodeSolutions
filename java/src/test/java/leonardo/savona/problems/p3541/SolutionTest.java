package leonardo.savona.problems.p3541;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void maxFreqSum_singleVowel() {
        assertEquals(1, solution.maxFreqSum("a"));
    }

    @Test
    void maxFreqSum_singleConsonant() {
        assertEquals(1, solution.maxFreqSum("b"));
    }

    @Test
    void maxFreqSum_allVowels() {
        assertEquals(3, solution.maxFreqSum("aeiaaee"));
    }

    @Test
    void maxFreqSum_allConsonants() {
        assertEquals(3, solution.maxFreqSum("bbbcc"));
    }

    @Test
    void maxFreqSum_mixedTypical() {
        assertEquals(4, solution.maxFreqSum("aabbcc"));
    }

    @Test
    void maxFreqSum_repeatedVowelAndConsonant() {
        assertEquals(6, solution.maxFreqSum("aaabbbccc"));
    }
}

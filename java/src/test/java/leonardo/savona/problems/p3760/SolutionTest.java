package leonardo.savona.problems.p3760;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void maxDistinct_singleCharacter() {
        assertEquals(1, Solution.maxDistinct("a"));
    }

    @Test
    void maxDistinct_allSameCharacters() {
        assertEquals(1, Solution.maxDistinct("aaaa"));
    }

    @Test
    void maxDistinct_allDistinctCharacters() {
        assertEquals(4, Solution.maxDistinct("abcd"));
    }

    @Test
    void maxDistinct_repeatingPattern() {
        assertEquals(3, Solution.maxDistinct("abcabc"));
    }

    @Test
    void maxDistinct_mixedRepetitions() {
        assertEquals(2, Solution.maxDistinct("aabb"));
    }

    @Test
    void maxDistinct_longerStringWithDuplicates() {
        assertEquals(5, Solution.maxDistinct("abcdeabcde"));
    }
}

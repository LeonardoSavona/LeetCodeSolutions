package leonardo.savona.problems.p1528;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void restoreString_typicalCase() {
        assertEquals("leetcode", solution.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
    }

    @Test
    void restoreString_alreadyOrdered() {
        assertEquals("abc", solution.restoreString("abc", new int[]{0, 1, 2}));
    }

    @Test
    void restoreString_reverseOrder() {
        assertEquals("cba", solution.restoreString("abc", new int[]{2, 1, 0}));
    }

    @Test
    void restoreString_singleCharacter() {
        assertEquals("z", solution.restoreString("z", new int[]{0}));
    }

    @Test
    void restoreString_allSameIndicesShuffled() {
        assertEquals("anohi", solution.restoreString("nihao", new int[]{1, 4, 3, 0, 2}));
    }

    @Test
    void restoreString_twoCharactersSwapped() {
        assertEquals("ba", solution.restoreString("ab", new int[]{1, 0}));
    }
}

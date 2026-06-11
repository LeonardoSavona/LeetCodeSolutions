package leonardo.savona.problems.p771;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void numJewelsInStones_allStonesAreJewels() {
        assertEquals(3, solution.numJewelsInStones("aA", "aAAbbbb"));
    }

    @Test
    void numJewelsInStones_noStonesAreJewels() {
        assertEquals(0, solution.numJewelsInStones("z", "AAABBB"));
    }

    @Test
    void numJewelsInStones_mixedJewelsAndStones() {
        assertEquals(3, solution.numJewelsInStones("aA", "aAAbbbb"));
    }

    @Test
    void numJewelsInStones_singleJewelSingleStoneMatch() {
        assertEquals(1, solution.numJewelsInStones("a", "a"));
    }

    @Test
    void numJewelsInStones_singleJewelSingleStoneNoMatch() {
        assertEquals(0, solution.numJewelsInStones("a", "b"));
    }

    @Test
    void numJewelsInStones_emptyStones() {
        assertEquals(0, solution.numJewelsInStones("abc", ""));
    }
}

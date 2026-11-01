package leonardo.savona.problems.p2974;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void numberGame_example() {
        // Alice takes 2, Bob takes 3, Bob appends first
        assertArrayEquals(new int[]{3, 2, 5, 4}, solution.numberGame(new int[]{5, 4, 2, 3}));
    }

    @Test
    void numberGame_twoElements() {
        assertArrayEquals(new int[]{5, 2}, solution.numberGame(new int[]{2, 5}));
    }

    @Test
    void numberGame_alreadySorted() {
        assertArrayEquals(new int[]{2, 1, 4, 3}, solution.numberGame(new int[]{1, 2, 3, 4}));
    }

    @Test
    void numberGame_duplicateValues() {
        assertArrayEquals(new int[]{1, 1, 2, 2}, solution.numberGame(new int[]{1, 2, 2, 1}));
    }

    @Test
    void numberGame_reverseSorted() {
        assertArrayEquals(new int[]{20, 10, 40, 30}, solution.numberGame(new int[]{40, 30, 20, 10}));
    }

    @Test
    void numberGame_sixElements() {
        assertArrayEquals(new int[]{2, 1, 4, 3, 6, 5}, solution.numberGame(new int[]{6, 5, 4, 3, 2, 1}));
    }
}

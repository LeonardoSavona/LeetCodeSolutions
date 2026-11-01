package leonardo.savona.problems.p2574;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void leftRightDifference_example1() {
        assertArrayEquals(new int[]{15, 1, 11, 22}, solution.leftRightDifference(new int[]{10, 4, 8, 3}));
    }

    @Test
    void leftRightDifference_example2() {
        assertArrayEquals(new int[]{0}, solution.leftRightDifference(new int[]{1}));
    }

    @Test
    void leftRightDifference_twoElements() {
        assertArrayEquals(new int[]{3, 2}, solution.leftRightDifference(new int[]{2, 3}));
    }

    @Test
    void leftRightDifference_allSameValues() {
        assertArrayEquals(new int[]{12, 6, 0, 6, 12}, solution.leftRightDifference(new int[]{3, 3, 3, 3, 3}));
    }

    @Test
    void leftRightDifference_allZeros() {
        assertArrayEquals(new int[]{0, 0, 0}, solution.leftRightDifference(new int[]{0, 0, 0}));
    }

    @Test
    void leftRightDifference_increasingSequence() {
        assertArrayEquals(new int[]{14, 11, 6, 1, 10}, solution.leftRightDifference(new int[]{1, 2, 3, 4, 5}));
    }
}

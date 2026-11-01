package leonardo.savona.problems.p1365;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void smallerNumbersThanCurrent_typicalCase() {
        assertArrayEquals(new int[]{4, 0, 1, 1, 3}, solution.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3}));
    }

    @Test
    void smallerNumbersThanCurrent_allSameElements() {
        assertArrayEquals(new int[]{0, 0, 0}, solution.smallerNumbersThanCurrent(new int[]{7, 7, 7}));
    }

    @Test
    void smallerNumbersThanCurrent_singleElement() {
        assertArrayEquals(new int[]{0}, solution.smallerNumbersThanCurrent(new int[]{5}));
    }

    @Test
    void smallerNumbersThanCurrent_alreadySorted() {
        assertArrayEquals(new int[]{0, 1, 2, 3}, solution.smallerNumbersThanCurrent(new int[]{1, 2, 3, 4}));
    }

    @Test
    void smallerNumbersThanCurrent_reverseSorted() {
        assertArrayEquals(new int[]{3, 2, 1, 0}, solution.smallerNumbersThanCurrent(new int[]{4, 3, 2, 1}));
    }

    @Test
    void smallerNumbersThanCurrent_withZeroElement() {
        assertArrayEquals(new int[]{1, 0, 2}, solution.smallerNumbersThanCurrent(new int[]{3, 0, 5}));
    }
}

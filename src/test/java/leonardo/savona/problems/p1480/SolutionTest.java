package leonardo.savona.problems.p1480;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void runningSum_singleElement() {
        assertArrayEquals(new int[]{5}, solution.runningSum(new int[]{5}));
    }

    @Test
    void runningSum_allOnes() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, solution.runningSum(new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    void runningSum_typicalPositive() {
        assertArrayEquals(new int[]{1, 3, 6, 10, 15}, solution.runningSum(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void runningSum_withNegativeValues() {
        assertArrayEquals(new int[]{3, 1, 4, 2}, solution.runningSum(new int[]{3, -2, 3, -2}));
    }

    @Test
    void runningSum_withZero() {
        assertArrayEquals(new int[]{0, 1, 1, 2}, solution.runningSum(new int[]{0, 1, 0, 1}));
    }

    @Test
    void runningSum_largeValues() {
        assertArrayEquals(new int[]{1000, 2000, 3000}, solution.runningSum(new int[]{1000, 1000, 1000}));
    }
}

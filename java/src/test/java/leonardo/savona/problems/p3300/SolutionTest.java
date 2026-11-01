package leonardo.savona.problems.p3300;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void minElement_example1() {
        assertEquals(1, solution.minElement(new int[]{10, 12, 13, 14}));
    }

    @Test
    void minElement_example2() {
        assertEquals(1, solution.minElement(new int[]{1, 2, 3, 4}));
    }

    @Test
    void minElement_example3() {
        // 999 -> 27, 19 -> 10, 199 -> 19
        assertEquals(10, solution.minElement(new int[]{999, 19, 199}));
    }

    @Test
    void minElement_singleElement() {
        assertEquals(9, solution.minElement(new int[]{9}));
    }

    @Test
    void minElement_upperBound() {
        assertEquals(1, solution.minElement(new int[]{10000, 9999}));
    }

    @Test
    void minElement_minIsNotSmallestNumber() {
        // 9 -> 9, 100 -> 1
        assertEquals(1, solution.minElement(new int[]{9, 100}));
    }
}

package leonardo.savona.problems.p3467;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void transformArray_allEven() {
        assertArrayEquals(new int[]{0, 0, 0, 0}, solution.transformArray(new int[]{2, 4, 6, 8}));
    }

    @Test
    void transformArray_allOdd() {
        assertArrayEquals(new int[]{1, 1, 1}, solution.transformArray(new int[]{1, 3, 5}));
    }

    @Test
    void transformArray_mixedOddAndEven() {
        assertArrayEquals(new int[]{0, 0, 1, 1}, solution.transformArray(new int[]{4, 2, 1, 3}));
    }

    @Test
    void transformArray_singleEvenElement() {
        assertArrayEquals(new int[]{0}, solution.transformArray(new int[]{10}));
    }

    @Test
    void transformArray_singleOddElement() {
        assertArrayEquals(new int[]{1}, solution.transformArray(new int[]{7}));
    }

    @Test
    void transformArray_mixedWithLeadingOdds() {
        assertArrayEquals(new int[]{0, 0, 1, 1, 1}, solution.transformArray(new int[]{1, 3, 5, 2, 4}));
    }
}

package leonardo.savona.problems.p1920;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void buildArray_singleElement() {
        assertArrayEquals(new int[]{0}, solution.buildArray(new int[]{0}));
    }

    @Test
    void buildArray_twoElements() {
        assertArrayEquals(new int[]{0, 1}, solution.buildArray(new int[]{0, 1}));
    }

    @Test
    void buildArray_exampleOne() {
        assertArrayEquals(new int[]{0, 1, 2, 4, 5, 3}, solution.buildArray(new int[]{0, 2, 1, 5, 3, 4}));
    }

    @Test
    void buildArray_exampleTwo() {
        assertArrayEquals(new int[]{4, 5, 0, 1, 2, 3}, solution.buildArray(new int[]{5, 0, 1, 2, 3, 4}));
    }

    @Test
    void buildArray_identityPermutation() {
        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, solution.buildArray(new int[]{0, 1, 2, 3, 4}));
    }

    @Test
    void buildArray_reversePermutation() {
        assertArrayEquals(new int[]{0, 1, 2, 3}, solution.buildArray(new int[]{3, 2, 1, 0}));
    }
}

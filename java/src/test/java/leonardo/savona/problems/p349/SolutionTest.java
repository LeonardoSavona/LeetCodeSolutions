package leonardo.savona.problems.p349;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    /** The problem accepts any order, so compare sorted. */
    private int[] sorted(int[] values) {
        int[] copy = values.clone();
        Arrays.sort(copy);
        return copy;
    }

    @Test
    void intersection_example() {
        assertArrayEquals(new int[]{2}, sorted(solution.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }

    @Test
    void intersection_multipleValues() {
        // [4, 9, 5] and [9, 4, 9, 8, 4] -> {4, 9}
        assertArrayEquals(new int[]{4, 9}, sorted(solution.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
    }

    @Test
    void intersection_noCommonValues() {
        assertArrayEquals(new int[]{}, solution.intersection(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
    }

    @Test
    void intersection_resultHasNoDuplicates() {
        assertArrayEquals(new int[]{1}, sorted(solution.intersection(new int[]{1, 1, 1}, new int[]{1, 1, 1})));
    }

    @Test
    void intersection_singleElementEach() {
        assertArrayEquals(new int[]{7}, solution.intersection(new int[]{7}, new int[]{7}));
    }

    @Test
    void intersection_includesZeroAndUpperBound() {
        assertArrayEquals(new int[]{0, 1000}, sorted(solution.intersection(new int[]{0, 1000, 5}, new int[]{1000, 0})));
    }
}

package leonardo.savona.problems.p80;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void removeDuplicates_singleElement() {
        int[] nums = {1};
        assertEquals(1, solution.removeDuplicates(nums));
    }

    @Test
    void removeDuplicates_allUnique() {
        int[] nums = {1, 2, 3};
        int k = solution.removeDuplicates(nums);
        assertEquals(3, k);
        assertArrayEquals(new int[]{1, 2, 3}, Arrays.copyOf(nums, k));
    }

    @Test
    void removeDuplicates_keepsAtMostTwo() {
        // [1, 1, 1, 2, 2, 3] -> [1, 1, 2, 2, 3]
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = solution.removeDuplicates(nums);
        assertEquals(5, k);
        assertArrayEquals(new int[]{1, 1, 2, 2, 3}, Arrays.copyOf(nums, k));
    }

    @Test
    void removeDuplicates_longRuns() {
        // [0, 0, 1, 1, 1, 1, 2, 3, 3] -> [0, 0, 1, 1, 2, 3, 3]
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int k = solution.removeDuplicates(nums);
        assertEquals(7, k);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 3, 3}, Arrays.copyOf(nums, k));
    }

    @Test
    void removeDuplicates_allSame() {
        int[] nums = {5, 5, 5, 5};
        int k = solution.removeDuplicates(nums);
        assertEquals(2, k);
        assertArrayEquals(new int[]{5, 5}, Arrays.copyOf(nums, k));
    }

    @Test
    void removeDuplicates_negatives() {
        int[] nums = {-3, -3, -3, -1, 0, 0};
        int k = solution.removeDuplicates(nums);
        assertEquals(5, k);
        assertArrayEquals(new int[]{-3, -3, -1, 0, 0}, Arrays.copyOf(nums, k));
    }
}

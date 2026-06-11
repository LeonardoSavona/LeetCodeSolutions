package leonardo.savona.problems.p26;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void removeDuplicates_singleElement() {
        int[] nums = {1};
        int k = solution.removeDuplicates(nums);
        assertEquals(1, k);
        assertEquals(1, nums[0]);
    }

    @Test
    void removeDuplicates_allUnique() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = solution.removeDuplicates(nums);
        assertEquals(5, k);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, java.util.Arrays.copyOf(nums, k));
    }

    @Test
    void removeDuplicates_allDuplicates() {
        int[] nums = {3, 3, 3, 3};
        int k = solution.removeDuplicates(nums);
        assertEquals(1, k);
        assertEquals(3, nums[0]);
    }

    @Test
    void removeDuplicates_mixedDuplicates() {
        int[] nums = {1, 1, 2, 3, 3, 4};
        int k = solution.removeDuplicates(nums);
        assertEquals(4, k);
        assertArrayEquals(new int[]{1, 2, 3, 4}, java.util.Arrays.copyOf(nums, k));
    }

    @Test
    void removeDuplicates_negativesAndPositives() {
        int[] nums = {-3, -1, -1, 0, 0, 2, 2, 5};
        int k = solution.removeDuplicates(nums);
        assertEquals(5, k);
        assertArrayEquals(new int[]{-3, -1, 0, 2, 5}, java.util.Arrays.copyOf(nums, k));
    }

    @Test
    void removeDuplicates_twoElements_distinct() {
        int[] nums = {0, 1};
        int k = solution.removeDuplicates(nums);
        assertEquals(2, k);
        assertArrayEquals(new int[]{0, 1}, java.util.Arrays.copyOf(nums, k));
    }
}

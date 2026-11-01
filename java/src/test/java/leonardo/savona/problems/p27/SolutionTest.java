package leonardo.savona.problems.p27;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void removeElement_typicalCase() {
        int[] nums = {3, 2, 2, 3};
        int k = solution.removeElement(nums, 3);
        assertEquals(2, k);
        int[] result = Arrays.copyOf(nums, k);
        Arrays.sort(result);
        assertArrayEquals(new int[]{2, 2}, result);
    }

    @Test
    void removeElement_multipleOccurrences() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int k = solution.removeElement(nums, 2);
        assertEquals(5, k);
        int[] result = Arrays.copyOf(nums, k);
        Arrays.sort(result);
        assertArrayEquals(new int[]{0, 0, 1, 3, 4}, result);
    }

    @Test
    void removeElement_noElementMatches() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = solution.removeElement(nums, 6);
        assertEquals(5, k);
        int[] result = Arrays.copyOf(nums, k);
        Arrays.sort(result);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

    @Test
    void removeElement_allElementsMatch() {
        int[] nums = {7, 7, 7, 7};
        int k = solution.removeElement(nums, 7);
        assertEquals(0, k);
    }

    @Test
    void removeElement_emptyArray() {
        int[] nums = {};
        int k = solution.removeElement(nums, 1);
        assertEquals(0, k);
    }

    @Test
    void removeElement_singleElementNotMatching() {
        int[] nums = {5};
        int k = solution.removeElement(nums, 3);
        assertEquals(1, k);
        assertEquals(5, nums[0]);
    }
}

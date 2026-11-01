package leonardo.savona.problems.p88;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void merge_example() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        solution.merge(nums1, 3, new int[]{2, 5, 6}, 3);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    void merge_secondArrayEmpty() {
        int[] nums1 = {1};
        solution.merge(nums1, 1, new int[]{}, 0);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    void merge_firstArrayEmpty() {
        int[] nums1 = {0};
        solution.merge(nums1, 0, new int[]{1}, 1);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    void merge_allOfSecondGoesFirst() {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        solution.merge(nums1, 3, new int[]{1, 2, 3}, 3);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1);
    }

    @Test
    void merge_singleInsertInTheMiddle() {
        int[] nums1 = {1, 2, 4, 5, 6, 0};
        solution.merge(nums1, 5, new int[]{3}, 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1);
    }

    @Test
    void merge_duplicatesAcrossArrays() {
        int[] nums1 = {2, 2, 0, 0};
        solution.merge(nums1, 2, new int[]{2, 2}, 2);
        assertArrayEquals(new int[]{2, 2, 2, 2}, nums1);
    }
}

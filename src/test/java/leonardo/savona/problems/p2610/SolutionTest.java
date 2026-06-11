package leonardo.savona.problems.p2610;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void findMatrix_singleElement() {
        List<List<Integer>> result = solution.findMatrix(new int[]{1});
        assertEquals(1, result.size());
        assertEquals(List.of(1), result.get(0));
    }

    @Test
    void findMatrix_allDistinct() {
        List<List<Integer>> result = solution.findMatrix(new int[]{1, 2, 3, 4});
        assertEquals(1, result.size());
        assertEquals(4, result.get(0).size());
        assertTrue(result.get(0).containsAll(List.of(1, 2, 3, 4)));
    }

    @Test
    void findMatrix_allSame() {
        List<List<Integer>> result = solution.findMatrix(new int[]{3, 3, 3});
        assertEquals(3, result.size());
        for (List<Integer> row : result) {
            assertEquals(1, row.size());
            assertEquals(3, row.get(0));
        }
    }

    @Test
    void findMatrix_mixedDuplicates() {
        List<List<Integer>> result = solution.findMatrix(new int[]{1, 3, 4, 1, 2, 3, 1});
        assertEquals(3, result.size());
        for (List<Integer> row : result) {
            assertEquals(row.size(), row.stream().distinct().count());
        }
    }

    @Test
    void findMatrix_twoDuplicatesEach() {
        List<List<Integer>> result = solution.findMatrix(new int[]{1, 2, 1, 2});
        assertEquals(2, result.size());
        for (List<Integer> row : result) {
            assertEquals(row.size(), row.stream().distinct().count());
        }
    }

    @Test
    void findMatrix_rowCountEqualsMaxFrequency() {
        int[] nums = new int[]{5, 5, 5, 5, 5};
        List<List<Integer>> result = solution.findMatrix(nums);
        assertEquals(5, result.size());
        for (List<Integer> row : result) {
            assertEquals(1, row.size());
            assertEquals(5, row.get(0));
        }
    }
}

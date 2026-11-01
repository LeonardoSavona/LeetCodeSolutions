package leonardo.savona.problems.p118;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class SolutionTest extends BaseTest {
    private final Solution solution = new Solution();

    @Test
    void generate_oneRow() {
        List<List<Integer>> result = solution.generate(1);
        assertEquals(1, result.size());
        assertEquals(List.of(1), result.get(0));
    }

    @Test
    void generate_twoRows() {
        List<List<Integer>> result = solution.generate(2);
        assertEquals(2, result.size());
        assertEquals(List.of(1), result.get(0));
        assertEquals(List.of(1, 1), result.get(1));
    }

    @Test
    void generate_fiveRows() {
        List<List<Integer>> result = solution.generate(5);
        assertEquals(5, result.size());
        assertEquals(List.of(1), result.get(0));
        assertEquals(List.of(1, 1), result.get(1));
        assertEquals(List.of(1, 2, 1), result.get(2));
        assertEquals(List.of(1, 3, 3, 1), result.get(3));
        assertEquals(List.of(1, 4, 6, 4, 1), result.get(4));
    }

    @Test
    void generate_threeRows() {
        List<List<Integer>> result = solution.generate(3);
        assertEquals(3, result.size());
        assertEquals(List.of(1, 2, 1), result.get(2));
    }

    @Test
    void generate_rowSizesMatchRowIndex() {
        List<List<Integer>> result = solution.generate(6);
        for (int i = 0; i < result.size(); i++) {
            assertEquals(i + 1, result.get(i).size());
        }
    }

    @Test
    void generate_firstAndLastElementsAreOne() {
        List<List<Integer>> result = solution.generate(6);
        for (List<Integer> row : result) {
            assertEquals(1, row.get(0));
            assertEquals(1, row.get(row.size() - 1));
        }
    }
}

package leonardo.savona.problems.p119;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void getRow_rowIndexZero() {
        List<Integer> result = solution.getRow(0);
        assertEquals(List.of(1), result);
    }

    @Test
    void getRow_rowIndexOne() {
        List<Integer> result = solution.getRow(1);
        assertEquals(List.of(1, 1), result);
    }

    @Test
    void getRow_rowIndexTwo() {
        List<Integer> result = solution.getRow(2);
        assertEquals(List.of(1, 2, 1), result);
    }

    @Test
    void getRow_rowIndexFour() {
        List<Integer> result = solution.getRow(4);
        assertEquals(List.of(1, 4, 6, 4, 1), result);
    }

    @Test
    void getRow_rowIndexFive() {
        List<Integer> result = solution.getRow(5);
        assertEquals(List.of(1, 5, 10, 10, 5, 1), result);
    }

    @Test
    void getRow_sizeMatchesRowIndexPlusOne() {
        int rowIndex = 10;
        List<Integer> result = solution.getRow(rowIndex);
        assertEquals(rowIndex + 1, result.size());
        assertEquals(1, result.get(0));
        assertEquals(1, result.get(rowIndex));
    }
}

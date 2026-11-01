package leonardo.savona.problems.p1;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void twoSum_typicalCase() {
        assertArrayEquals(new int[]{0, 1}, Solution.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void twoSum_targetAtEnd() {
        assertArrayEquals(new int[]{1, 2}, Solution.twoSum(new int[]{3, 2, 4}, 6));
    }

    @Test
    void twoSum_duplicateValues() {
        assertArrayEquals(new int[]{0, 1}, Solution.twoSum(new int[]{3, 3}, 6));
    }

    @Test
    void twoSum_negativeNumbers() {
        assertArrayEquals(new int[]{0, 2}, Solution.twoSum(new int[]{-3, 1, -1}, -4));
    }

    @Test
    void twoSum_noSolutionReturnsEmpty() {
        assertArrayEquals(new int[]{}, Solution.twoSum(new int[]{1, 2, 3}, 100));
    }

    @Test
    void twoSum_singlePair() {
        assertArrayEquals(new int[]{0, 1}, Solution.twoSum(new int[]{1, 9}, 10));
    }
}

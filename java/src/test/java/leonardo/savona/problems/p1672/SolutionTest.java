package leonardo.savona.problems.p1672;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void maximumWealth_singleCustomerSingleBank() {
        assertEquals(5, solution.maximumWealth(new int[][]{{5}}));
    }

    @Test
    void maximumWealth_singleCustomerMultipleBanks() {
        assertEquals(10, solution.maximumWealth(new int[][]{{1, 2, 3, 4}}));
    }

    @Test
    void maximumWealth_multipleCustomersFirstIsRichest() {
        assertEquals(10, solution.maximumWealth(new int[][]{{1, 5, 4}, {2, 3, 1}}));
    }

    @Test
    void maximumWealth_multipleCustomersLastIsRichest() {
        assertEquals(12, solution.maximumWealth(new int[][]{{2, 3}, {4, 8}}));
    }

    @Test
    void maximumWealth_allCustomersEqualWealth() {
        assertEquals(6, solution.maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}, {2, 2, 2}}));
    }

    @Test
    void maximumWealth_allZeros() {
        assertEquals(0, solution.maximumWealth(new int[][]{{0, 0}, {0, 0}}));
    }
}

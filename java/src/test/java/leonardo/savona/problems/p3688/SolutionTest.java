package leonardo.savona.problems.p3688;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void evenNumberBitwiseORs_allOdd() {
        assertEquals(0, solution.evenNumberBitwiseORs(new int[]{1, 3, 5, 7}));
    }

    @Test
    void evenNumberBitwiseORs_singleEven() {
        assertEquals(4, solution.evenNumberBitwiseORs(new int[]{4}));
    }

    @Test
    void evenNumberBitwiseORs_singleOdd() {
        assertEquals(0, solution.evenNumberBitwiseORs(new int[]{7}));
    }

    @Test
    void evenNumberBitwiseORs_mixedNumbers() {
        assertEquals(6, solution.evenNumberBitwiseORs(new int[]{1, 2, 3, 4}));
    }

    @Test
    void evenNumberBitwiseORs_allEven() {
        assertEquals(14, solution.evenNumberBitwiseORs(new int[]{2, 4, 8}));
    }

    @Test
    void evenNumberBitwiseORs_largeValues() {
        assertEquals(1073741822, solution.evenNumberBitwiseORs(new int[]{536870912, 1073741822, 3}));
    }
}

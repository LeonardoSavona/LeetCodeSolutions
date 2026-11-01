package leonardo.savona.problems.p1689;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void minPartitions_singleDigit() {
        assertEquals(3, solution.minPartitions("3"));
    }

    @Test
    void minPartitions_allSameDigit() {
        assertEquals(5, solution.minPartitions("5555"));
    }

    @Test
    void minPartitions_mixedDigits() {
        assertEquals(7, solution.minPartitions("32174"));
    }

    @Test
    void minPartitions_containsNine_returnsImmediately() {
        assertEquals(9, solution.minPartitions("12934"));
    }

    @Test
    void minPartitions_allOnes() {
        assertEquals(1, solution.minPartitions("1111111"));
    }

    @Test
    void minPartitions_largeNumberMaxIsEight() {
        assertEquals(8, solution.minPartitions("8271384"));
    }
}

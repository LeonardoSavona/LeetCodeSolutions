package leonardo.savona.problems.p191;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void hammingWeight_zero() {
        assertEquals(0, solution.hammingWeight(0));
    }

    @Test
    void hammingWeight_one() {
        assertEquals(1, solution.hammingWeight(1));
    }

    @Test
    void hammingWeight_powerOfTwo() {
        assertEquals(1, solution.hammingWeight(16));
    }

    @Test
    void hammingWeight_allOnes32Bits() {
        assertEquals(32, solution.hammingWeight(0xffffffff));
    }

    @Test
    void hammingWeight_typicalValue11() {
        assertEquals(3, solution.hammingWeight(11));
    }

    @Test
    void hammingWeight_typicalValue128() {
        assertEquals(3, solution.hammingWeight(0b10000011));
    }
}

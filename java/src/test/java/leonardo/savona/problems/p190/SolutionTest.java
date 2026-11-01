package leonardo.savona.problems.p190;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void reverseBits_allZeros() {
        assertEquals(0, solution.reverseBits(0));
    }

    @Test
    void reverseBits_allOnes() {
        assertEquals(0xFFFFFFFF, solution.reverseBits(0xFFFFFFFF));
    }

    @Test
    void reverseBits_singleLowBit() {
        // binary: 0...001 -> reversed: 1000...0
        assertEquals(0x80000000, solution.reverseBits(1));
    }

    @Test
    void reverseBits_singleHighBit() {
        // binary: 1000...0 -> reversed: 0...001
        assertEquals(1, solution.reverseBits(0x80000000));
    }

    @Test
    void reverseBits_leetcodeExample1() {
        // n = 43261596 (00000010100101000001111010011100)
        // reversed = 964176192 (00111001011110000010100101000000)
        assertEquals(964176192, solution.reverseBits(43261596));
    }

    @Test
    void reverseBits_leetcodeExample2() {
        // n = -3 (11111111111111111111111111111101)
        // reversed = -1073741825 (10111111111111111111111111111111)
        assertEquals(-1073741825, solution.reverseBits(-3));
    }
}

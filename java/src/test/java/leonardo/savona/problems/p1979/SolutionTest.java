package leonardo.savona.problems.p1979;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void findGCD_typicalCase() {
        assertEquals(2, solution.findGCD(new int[]{2, 5, 6, 9, 10}));
    }

    @Test
    void findGCD_allSameElements() {
        assertEquals(7, solution.findGCD(new int[]{7, 7, 7}));
    }

    @Test
    void findGCD_singleElement() {
        assertEquals(4, solution.findGCD(new int[]{4}));
    }

    @Test
    void findGCD_minAndMaxAreCoprime() {
        assertEquals(1, solution.findGCD(new int[]{3, 5, 7, 11}));
    }

    @Test
    void findGCD_minAndMaxShareLargeGcd() {
        assertEquals(6, solution.findGCD(new int[]{6, 12, 9, 18}));
    }

    @Test
    void findGCD_twoElements() {
        assertEquals(5, solution.findGCD(new int[]{5, 15}));
    }
}

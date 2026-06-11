package leonardo.savona.problems.p728;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void selfDividingNumbers_singleSelfDividing() {
        List<Integer> result = solution.selfDividingNumbers(1, 1);
        assertEquals(List.of(1), result);
    }

    @Test
    void selfDividingNumbers_singleNotSelfDividing() {
        List<Integer> result = solution.selfDividingNumbers(20, 20);
        assertTrue(result.isEmpty());
    }

    @Test
    void selfDividingNumbers_typicalRange() {
        List<Integer> result = solution.selfDividingNumbers(1, 22);
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22), result);
    }

    @Test
    void selfDividingNumbers_rangeWithNoResults() {
        List<Integer> result = solution.selfDividingNumbers(10, 19);
        assertEquals(List.of(11, 12, 15), result);
    }

    @Test
    void selfDividingNumbers_largerRange() {
        List<Integer> result = solution.selfDividingNumbers(47, 85);
        assertEquals(List.of(48, 55, 66, 77), result);
    }

    @Test
    void selfDividingNumbers_sameLeftRight() {
        List<Integer> result = solution.selfDividingNumbers(128, 128);
        assertEquals(List.of(128), result);
    }
}

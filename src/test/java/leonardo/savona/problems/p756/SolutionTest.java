package leonardo.savona.problems.p756;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void pyramidTransition_example1_returnsTrue() {
        String bottom = "BCD";
        List<String> allowed = List.of("BCC", "CDE", "CEA", "FFF");
        assertTrue(solution.pyramidTransition(bottom, allowed));
    }

    @Test
    void pyramidTransition_example2_returnsFalse() {
        String bottom = "AAAA";
        List<String> allowed = List.of("AAB", "AAC", "BCD", "BBE", "DEF");
        assertFalse(solution.pyramidTransition(bottom, allowed));
    }

    @Test
    void pyramidTransition_twoSameCharsBottom_returnsTrue() {
        String bottom = "AA";
        List<String> allowed = List.of("AAX", "BCY");
        assertTrue(solution.pyramidTransition(bottom, allowed));
    }

    @Test
    void pyramidTransition_twoCharBottomWithMatch_returnsTrue() {
        String bottom = "AB";
        List<String> allowed = List.of("ABX");
        assertTrue(solution.pyramidTransition(bottom, allowed));
    }

    @Test
    void pyramidTransition_twoCharBottomNoMatch_returnsFalse() {
        String bottom = "AB";
        List<String> allowed = List.of("CDX", "EFY");
        assertFalse(solution.pyramidTransition(bottom, allowed));
    }

    @Test
    void pyramidTransition_longerBottomMultiplePaths_returnsTrue() {
        String bottom = "XYZ";
        List<String> allowed = List.of("XYA", "YZB", "ABX");
        assertTrue(solution.pyramidTransition(bottom, allowed));
    }
}

package leonardo.savona.problems.p2769;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void theMaximumAchievableX_zeroT() {
        assertEquals(4, solution.theMaximumAchievableX(4, 0));
    }

    @Test
    void theMaximumAchievableX_numFourTOne() {
        assertEquals(6, solution.theMaximumAchievableX(4, 1));
    }

    @Test
    void theMaximumAchievableX_numSixTFive() {
        assertEquals(16, solution.theMaximumAchievableX(6, 5));
    }

    @Test
    void theMaximumAchievableX_numAndTBothOne() {
        assertEquals(3, solution.theMaximumAchievableX(1, 1));
    }

    @Test
    void theMaximumAchievableX_largeTSmallNum() {
        assertEquals(101, solution.theMaximumAchievableX(1, 50));
    }

    @Test
    void theMaximumAchievableX_bothLarge() {
        assertEquals(150, solution.theMaximumAchievableX(50, 50));
    }
}

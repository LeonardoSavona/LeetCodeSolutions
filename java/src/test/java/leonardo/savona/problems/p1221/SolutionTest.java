package leonardo.savona.problems.p1221;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {
    private final Solution solution = new Solution();

    @Test
    void balancedStringSplit_singleBalancedPair() {
        assertEquals(1, solution.balancedStringSplit("RL"));
    }

    @Test
    void balancedStringSplit_twoBalancedPairs() {
        assertEquals(4, solution.balancedStringSplit("RLRRLLRLRL"));
    }

    @Test
    void balancedStringSplit_longerSegments() {
        assertEquals(3, solution.balancedStringSplit("RLLLLRRRLR"));
    }

    @Test
    void balancedStringSplit_allGroupedTogether() {
        assertEquals(1, solution.balancedStringSplit("LLLLRRRR"));
    }

    @Test
    void balancedStringSplit_singleLrPair() {
        assertEquals(1, solution.balancedStringSplit("LR"));
    }

    @Test
    void balancedStringSplit_multipleSmallPairs() {
        assertEquals(3, solution.balancedStringSplit("RLRLRL"));
    }
}

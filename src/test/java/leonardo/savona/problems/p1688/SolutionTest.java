package leonardo.savona.problems.p1688;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void numberOfMatches_singleTeam() {
        assertEquals(0, solution.numberOfMatches(1));
    }

    @Test
    void numberOfMatches_twoTeams() {
        assertEquals(1, solution.numberOfMatches(2));
    }

    @Test
    void numberOfMatches_evenNumber() {
        assertEquals(6, solution.numberOfMatches(7));
    }

    @Test
    void numberOfMatches_oddNumber() {
        assertEquals(13, solution.numberOfMatches(14));
    }

    @Test
    void numberOfMatches_largeEven() {
        assertEquals(199, solution.numberOfMatches(200));
    }

    @Test
    void numberOfMatches_largeOdd() {
        assertEquals(99, solution.numberOfMatches(100));
    }
}

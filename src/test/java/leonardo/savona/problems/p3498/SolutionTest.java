package leonardo.savona.problems.p3498;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void reverseDegree_singleCharA() {
        assertEquals(26, solution.reverseDegree("a"));
    }

    @Test
    void reverseDegree_singleCharZ() {
        assertEquals(1, solution.reverseDegree("z"));
    }

    @Test
    void reverseDegree_twoCharsAZ() {
        assertEquals(28, solution.reverseDegree("az"));
    }

    @Test
    void reverseDegree_allSameA() {
        assertEquals(78, solution.reverseDegree("aa"));
    }

    @Test
    void reverseDegree_abcTypicalCase() {
        assertEquals(148, solution.reverseDegree("abc"));
    }

    @Test
    void reverseDegree_allZ() {
        assertEquals(3, solution.reverseDegree("zz"));
    }
}

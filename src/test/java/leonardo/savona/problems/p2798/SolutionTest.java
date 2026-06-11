package leonardo.savona.problems.p2798;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void numberOfEmployeesWhoMetTarget_allMeetTarget() {
        assertEquals(4, Solution.numberOfEmployeesWhoMetTarget(new int[]{5, 10, 15, 20}, 5));
    }

    @Test
    void numberOfEmployeesWhoMetTarget_noneMeetTarget() {
        assertEquals(0, Solution.numberOfEmployeesWhoMetTarget(new int[]{1, 2, 3, 4}, 10));
    }

    @Test
    void numberOfEmployeesWhoMetTarget_someMeetTarget() {
        assertEquals(3, Solution.numberOfEmployeesWhoMetTarget(new int[]{0, 5, 10, 15}, 5));
    }

    @Test
    void numberOfEmployeesWhoMetTarget_exactlyAtTarget() {
        assertEquals(1, Solution.numberOfEmployeesWhoMetTarget(new int[]{8}, 8));
    }

    @Test
    void numberOfEmployeesWhoMetTarget_zeroTarget() {
        assertEquals(5, Solution.numberOfEmployeesWhoMetTarget(new int[]{0, 1, 2, 3, 4}, 0));
    }

    @Test
    void numberOfEmployeesWhoMetTarget_singleElementBelowTarget() {
        assertEquals(0, Solution.numberOfEmployeesWhoMetTarget(new int[]{3}, 10));
    }
}

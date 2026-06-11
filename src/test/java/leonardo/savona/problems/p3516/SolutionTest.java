package leonardo.savona.problems.p3516;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void findClosest_person1Closer() {
        assertEquals(1, solution.findClosest(2, 7, 3));
    }

    @Test
    void findClosest_person2Closer() {
        assertEquals(2, solution.findClosest(1, 8, 6));
    }

    @Test
    void findClosest_equalDistance() {
        assertEquals(0, solution.findClosest(1, 9, 5));
    }

    @Test
    void findClosest_zAtSamePositionAsPerson1() {
        assertEquals(1, solution.findClosest(5, 10, 5));
    }

    @Test
    void findClosest_zAtSamePositionAsPerson2() {
        assertEquals(2, solution.findClosest(1, 5, 5));
    }

    @Test
    void findClosest_allSamePosition() {
        assertEquals(0, solution.findClosest(3, 3, 3));
    }
}

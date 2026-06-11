package leonardo.savona.problems.p2413;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void smallestEvenMultiple_oddInput() {
        assertEquals(6, solution.smallestEvenMultiple(3));
    }

    @Test
    void smallestEvenMultiple_evenInput() {
        assertEquals(4, solution.smallestEvenMultiple(4));
    }

    @Test
    void smallestEvenMultiple_one() {
        assertEquals(2, solution.smallestEvenMultiple(1));
    }

    @Test
    void smallestEvenMultiple_two() {
        assertEquals(2, solution.smallestEvenMultiple(2));
    }

    @Test
    void smallestEvenMultiple_largeOdd() {
        assertEquals(1998, solution.smallestEvenMultiple(999));
    }

    @Test
    void smallestEvenMultiple_largeEven() {
        assertEquals(1000, solution.smallestEvenMultiple(1000));
    }
}

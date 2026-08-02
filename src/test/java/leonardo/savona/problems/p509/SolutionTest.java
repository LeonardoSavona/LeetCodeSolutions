package leonardo.savona.problems.p509;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void fib_zero() {
        assertEquals(0, solution.fib(0));
    }

    @Test
    void fib_one() {
        assertEquals(1, solution.fib(1));
    }

    @Test
    void fib_two() {
        assertEquals(1, solution.fib(2));
    }

    @Test
    void fib_smallValues() {
        assertEquals(2, solution.fib(3));
        assertEquals(3, solution.fib(4));
        assertEquals(5, solution.fib(5));
    }

    @Test
    void fib_ten() {
        assertEquals(55, solution.fib(10));
    }

    @Test
    void fib_upperBound() {
        // n <= 30 per the constraints
        assertEquals(832040, solution.fib(30));
    }
}

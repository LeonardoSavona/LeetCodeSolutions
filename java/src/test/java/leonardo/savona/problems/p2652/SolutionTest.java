package leonardo.savona.problems.p2652;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void sumOfMultiples_n3_returnsThree() {
        assertEquals(3, solution.sumOfMultiples(3));
    }

    @Test
    void sumOfMultiples_n4_returnsThree() {
        assertEquals(3, solution.sumOfMultiples(4));
    }

    @Test
    void sumOfMultiples_n7_returnsTwentyFive() {
        assertEquals(3 + 5 + 6 + 7, solution.sumOfMultiples(7));
    }

    @Test
    void sumOfMultiples_n10_returnsSumOfAllMultiples() {
        assertEquals(3 + 5 + 6 + 7 + 9 + 10, solution.sumOfMultiples(10));
    }

    @Test
    void sumOfMultiples_n1_returnsZero() {
        assertEquals(0, solution.sumOfMultiples(1));
    }

    @Test
    void sumOfMultiples_n1000_returnsExpectedSum() {
        int expected = 0;
        for (int i = 3; i <= 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                expected += i;
            }
        }
        assertEquals(expected, solution.sumOfMultiples(1000));
    }
}

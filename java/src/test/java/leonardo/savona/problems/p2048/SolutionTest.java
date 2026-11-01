package leonardo.savona.problems.p2048;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void nextBeautifulNumber_fromZero() {
        assertEquals(1, Solution.nextBeautifulNumber(0));
    }

    @Test
    void nextBeautifulNumber_fromOne() {
        assertEquals(22, Solution.nextBeautifulNumber(1));
    }

    @Test
    void nextBeautifulNumber_fromTwentyTwo() {
        assertEquals(122, Solution.nextBeautifulNumber(22));
    }

    @Test
    void nextBeautifulNumber_fromOneHundred() {
        assertEquals(122, Solution.nextBeautifulNumber(100));
    }

    @Test
    void nextBeautifulNumber_fromOneThousand() {
        assertEquals(1333, Solution.nextBeautifulNumber(1000));
    }

    @Test
    void nextBeautifulNumber_fromThreeThousand() {
        assertEquals(3133, Solution.nextBeautifulNumber(3000));
    }
}

package leonardo.savona.problems.p3794;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void reversePrefix_typicalCase() {
        assertEquals("dcbaefd", solution.reversePrefix("abcdefd", 4));
    }

    @Test
    void reversePrefix_singleCharPrefix() {
        assertEquals("abcde", solution.reversePrefix("abcde", 1));
    }

    @Test
    void reversePrefix_fullStringPrefix() {
        assertEquals("edcba", solution.reversePrefix("abcde", 5));
    }

    @Test
    void reversePrefix_twoCharPrefix() {
        assertEquals("bacd", solution.reversePrefix("abcd", 2));
    }

    @Test
    void reversePrefix_singleCharString() {
        assertEquals("z", solution.reversePrefix("z", 1));
    }

    @Test
    void reversePrefix_prefixLargerThanHalfString() {
        assertEquals("fedcba", solution.reversePrefix("abcdef", 6));
    }
}

package leonardo.savona.problems.p3174;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void clearDigits_noDigits() {
        assertEquals("abc", solution.clearDigits("abc"));
    }

    @Test
    void clearDigits_example2() {
        assertEquals("", solution.clearDigits("cb34"));
    }

    @Test
    void clearDigits_digitInTheMiddle() {
        assertEquals("b", solution.clearDigits("a1b"));
    }

    @Test
    void clearDigits_interleaved() {
        // ab1 -> a, ac2 -> a
        assertEquals("a", solution.clearDigits("ab1c2"));
    }

    @Test
    void clearDigits_digitsAtTheEnd() {
        assertEquals("a", solution.clearDigits("abc12"));
    }

    @Test
    void clearDigits_singleLetter() {
        assertEquals("z", solution.clearDigits("z"));
    }
}

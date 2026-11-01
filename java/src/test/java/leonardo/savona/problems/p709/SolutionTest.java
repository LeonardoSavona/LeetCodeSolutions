package leonardo.savona.problems.p709;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void toLowerCase_allUpperCase() {
        assertEquals("hello", solution.toLowerCase("Hello"));
    }

    @Test
    void toLowerCase_mixedCase() {
        assertEquals("lovely", solution.toLowerCase("LOVELY"));
    }

    @Test
    void toLowerCase_alreadyLowerCase() {
        assertEquals("already", solution.toLowerCase("already"));
    }

    @Test
    void toLowerCase_singleCharacter() {
        assertEquals("a", solution.toLowerCase("A"));
    }

    @Test
    void toLowerCase_mixedCaseAndDigits() {
        assertEquals("hello world123", solution.toLowerCase("Hello World123"));
    }

    @Test
    void toLowerCase_emptyString() {
        assertEquals("", solution.toLowerCase(""));
    }
}

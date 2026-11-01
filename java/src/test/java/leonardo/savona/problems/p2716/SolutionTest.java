package leonardo.savona.problems.p2716;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void minimizedStringLength_example() {
        assertEquals(3, solution.minimizedStringLength("aaabc"));
    }

    @Test
    void minimizedStringLength_secondExample() {
        assertEquals(3, solution.minimizedStringLength("cbbd"));
    }

    @Test
    void minimizedStringLength_thirdExample() {
        assertEquals(4, solution.minimizedStringLength("baadccab"));
    }

    @Test
    void minimizedStringLength_singleCharacter() {
        assertEquals(1, solution.minimizedStringLength("a"));
    }

    @Test
    void minimizedStringLength_allDistinct() {
        assertEquals(5, solution.minimizedStringLength("abcde"));
    }

    @Test
    void minimizedStringLength_allSame() {
        assertEquals(1, solution.minimizedStringLength("zzzzzz"));
    }
}

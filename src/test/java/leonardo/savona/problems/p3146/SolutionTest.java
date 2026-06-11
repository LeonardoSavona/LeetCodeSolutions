package leonardo.savona.problems.p3146;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {
    private final Solution solution = new Solution();

    @Test
    void findPermutationDifference_example1() {
        assertEquals(6, solution.findPermutationDifference("abcd", "dabc"));
    }

    @Test
    void findPermutationDifference_example2() {
        assertEquals(12, solution.findPermutationDifference("abcde", "edbac"));
    }

    @Test
    void findPermutationDifference_sameStrings() {
        assertEquals(0, solution.findPermutationDifference("abc", "abc"));
    }

    @Test
    void findPermutationDifference_singleCharacter() {
        assertEquals(0, solution.findPermutationDifference("a", "a"));
    }

    @Test
    void findPermutationDifference_reversedString() {
        assertEquals(12, solution.findPermutationDifference("abcde", "edcba"));
    }

    @Test
    void findPermutationDifference_twoCharacters() {
        assertEquals(2, solution.findPermutationDifference("ab", "ba"));
    }
}

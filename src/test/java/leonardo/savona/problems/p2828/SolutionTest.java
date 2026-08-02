package leonardo.savona.problems.p2828;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void isAcronym_example() {
        assertTrue(solution.isAcronym(List.of("alice", "bob", "charlie"), "abc"));
    }

    @Test
    void isAcronym_lengthMismatch() {
        assertFalse(solution.isAcronym(List.of("an", "apple"), "a"));
    }

    @Test
    void isAcronym_longerExample() {
        assertTrue(solution.isAcronym(List.of("never", "gonna", "give", "up", "on", "you"), "ngguoy"));
    }

    @Test
    void isAcronym_wrongOrder() {
        assertFalse(solution.isAcronym(List.of("alice", "bob", "charlie"), "acb"));
    }

    @Test
    void isAcronym_singleWord() {
        assertTrue(solution.isAcronym(List.of("apple"), "a"));
    }

    @Test
    void isAcronym_stringLongerThanWordList() {
        assertFalse(solution.isAcronym(List.of("alice", "bob"), "abc"));
    }
}

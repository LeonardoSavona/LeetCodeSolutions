package leonardo.savona.problems.p2942;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void findWordsContaining_typicalCase() {
        String[] words = {"leet", "code"};
        List<Integer> result = solution.findWordsContaining(words, 'e');
        assertEquals(List.of(0, 1), result);
    }

    @Test
    void findWordsContaining_singleMatch() {
        String[] words = {"abc", "bcd", "aaaa", "cbc"};
        List<Integer> result = solution.findWordsContaining(words, 'a');
        assertEquals(List.of(0, 2), result);
    }

    @Test
    void findWordsContaining_noMatch() {
        String[] words = {"abc", "bcd", "aaaa", "cbc"};
        List<Integer> result = solution.findWordsContaining(words, 'z');
        assertTrue(result.isEmpty());
    }

    @Test
    void findWordsContaining_allWordsMatch() {
        String[] words = {"yes", "byte", "yak"};
        List<Integer> result = solution.findWordsContaining(words, 'y');
        assertEquals(List.of(0, 1, 2), result);
    }

    @Test
    void findWordsContaining_singleWordMatch() {
        String[] words = {"x"};
        List<Integer> result = solution.findWordsContaining(words, 'x');
        assertEquals(List.of(0), result);
    }

    @Test
    void findWordsContaining_singleWordNoMatch() {
        String[] words = {"hello"};
        List<Integer> result = solution.findWordsContaining(words, 'z');
        assertTrue(result.isEmpty());
    }
}

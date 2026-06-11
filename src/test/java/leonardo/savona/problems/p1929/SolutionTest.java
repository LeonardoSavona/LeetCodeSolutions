package leonardo.savona.problems.p1929;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void getConcatenation_typicalTwoElements() {
        assertArrayEquals(new int[]{1, 2, 1, 2}, solution.getConcatenation(new int[]{1, 2}));
    }

    @Test
    void getConcatenation_typicalMultipleElements() {
        assertArrayEquals(new int[]{1, 3, 2, 1, 3, 2}, solution.getConcatenation(new int[]{1, 3, 2}));
    }

    @Test
    void getConcatenation_singleElement() {
        assertArrayEquals(new int[]{7, 7}, solution.getConcatenation(new int[]{7}));
    }

    @Test
    void getConcatenation_singleZero() {
        assertArrayEquals(new int[]{0, 0}, solution.getConcatenation(new int[]{0}));
    }

    @Test
    void getConcatenation_allSameValues() {
        assertArrayEquals(new int[]{5, 5, 5, 5, 5, 5}, solution.getConcatenation(new int[]{5, 5, 5}));
    }

    @Test
    void getConcatenation_resultLengthIsDoubleInput() {
        int[] input = new int[]{4, 2, 9, 1};
        int[] result = solution.getConcatenation(input);
        assertEquals(input.length * 2, result.length);
        assertArrayEquals(new int[]{4, 2, 9, 1, 4, 2, 9, 1}, result);
    }
}

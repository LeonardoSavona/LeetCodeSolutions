package leonardo.savona.problems.p3731;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void findMissingElements_example1() {
        assertEquals(List.of(3), solution.findMissingElements(new int[]{1, 4, 2, 5}));
    }

    @Test
    void findMissingElements_noneMissing() {
        assertEquals(List.of(), solution.findMissingElements(new int[]{7, 8, 6, 9}));
    }

    @Test
    void findMissingElements_onlyBounds() {
        assertEquals(List.of(2, 3, 4), solution.findMissingElements(new int[]{5, 1}));
    }

    @Test
    void findMissingElements_twoConsecutive() {
        assertEquals(List.of(), solution.findMissingElements(new int[]{3, 4}));
    }

    @Test
    void findMissingElements_unsortedInput() {
        assertEquals(List.of(11, 13, 14), solution.findMissingElements(new int[]{15, 10, 12}));
    }

    @Test
    void findMissingElements_fullRange() {
        List<Integer> expected = IntStream.range(2, 100).boxed().toList();
        assertEquals(expected, solution.findMissingElements(new int[]{100, 1}));
    }
}

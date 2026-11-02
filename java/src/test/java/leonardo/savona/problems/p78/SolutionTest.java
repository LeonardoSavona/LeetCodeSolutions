package leonardo.savona.problems.p78;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    private Set<List<Integer>> normalize(List<List<Integer>> subsets) {
        Set<List<Integer>> result = new HashSet<>();
        for (List<Integer> subset : subsets) {
            List<Integer> copy = new ArrayList<>(subset);
            Collections.sort(copy);
            result.add(copy);
        }
        return result;
    }

    private void assertSubsets(List<List<Integer>> expected, List<List<Integer>> actual) {
        assertEquals(expected.size(), actual.size());
        assertEquals(normalize(expected), normalize(actual));
    }

    @Test
    void subsets_example1() {
        assertSubsets(List.of(List.of(), List.of(1), List.of(2), List.of(1, 2),
                        List.of(3), List.of(1, 3), List.of(2, 3), List.of(1, 2, 3)),
                solution.subsets(new int[]{1, 2, 3}));
    }

    @Test
    void subsets_example2() {
        assertSubsets(List.of(List.of(), List.of(0)), solution.subsets(new int[]{0}));
    }

    @Test
    void subsets_twoElements() {
        assertSubsets(List.of(List.of(), List.of(1), List.of(2), List.of(1, 2)),
                solution.subsets(new int[]{1, 2}));
    }

    @Test
    void subsets_negativeValues() {
        assertSubsets(List.of(List.of(), List.of(-1), List.of(5), List.of(-1, 5)),
                solution.subsets(new int[]{-1, 5}));
    }

    @Test
    void subsets_maxLength() {
        List<List<Integer>> result = solution.subsets(IntStream.range(0, 10).toArray());
        assertEquals(1024, result.size());
        assertEquals(1024, normalize(result).size());
    }
}

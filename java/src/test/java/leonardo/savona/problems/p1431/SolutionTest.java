package leonardo.savona.problems.p1431;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void kidsWithCandies_typicalCase() {
        List<Boolean> result = solution.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
        assertEquals(List.of(true, true, true, false, true), result);
    }

    @Test
    void kidsWithCandies_allKidsCanReachMax() {
        List<Boolean> result = solution.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1);
        assertEquals(List.of(true, false, false, false, false), result);
    }

    @Test
    void kidsWithCandies_extraCandiesLarge() {
        List<Boolean> result = solution.kidsWithCandies(new int[]{1, 2, 3}, 10);
        assertEquals(List.of(true, true, true), result);
    }

    @Test
    void kidsWithCandies_singleKid() {
        List<Boolean> result = solution.kidsWithCandies(new int[]{5}, 3);
        assertEquals(List.of(true), result);
    }

    @Test
    void kidsWithCandies_allEqual() {
        List<Boolean> result = solution.kidsWithCandies(new int[]{3, 3, 3}, 0);
        assertEquals(List.of(true, true, true), result);
    }

    @Test
    void kidsWithCandies_noExtraCandies() {
        List<Boolean> result = solution.kidsWithCandies(new int[]{1, 5, 3, 2, 4}, 0);
        assertEquals(List.of(false, true, false, false, false), result);
    }
}

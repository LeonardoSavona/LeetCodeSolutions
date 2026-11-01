package leonardo.savona.problems.p3285;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void stableMountains_typicalCase() {
        int[] height = {1, 2, 3, 4, 5};
        int threshold = 2;
        List<Integer> result = solution.stableMountains(height, threshold);
        assertEquals(List.of(3, 4), result);
    }

    @Test
    void stableMountains_allStable() {
        int[] height = {10, 1, 2, 3};
        int threshold = 5;
        List<Integer> result = solution.stableMountains(height, threshold);
        assertEquals(List.of(1), result);
    }

    @Test
    void stableMountains_noneStable() {
        int[] height = {1, 1, 1, 1};
        int threshold = 3;
        List<Integer> result = solution.stableMountains(height, threshold);
        assertTrue(result.isEmpty());
    }

    @Test
    void stableMountains_thresholdZero() {
        int[] height = {1, 2, 3};
        int threshold = 0;
        List<Integer> result = solution.stableMountains(height, threshold);
        assertEquals(List.of(1, 2), result);
    }

    @Test
    void stableMountains_singleElement() {
        int[] height = {5};
        int threshold = 3;
        List<Integer> result = solution.stableMountains(height, threshold);
        assertTrue(result.isEmpty());
    }

    @Test
    void stableMountains_multipleStableMountains() {
        int[] height = {5, 1, 6, 2, 7, 3};
        int threshold = 4;
        List<Integer> result = solution.stableMountains(height, threshold);
        assertEquals(List.of(1, 3, 5), result);
    }
}

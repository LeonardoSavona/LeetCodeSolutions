package leonardo.savona.problems.p3289;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void getSneakyNumbers_typicalSmallNumbers() {
        int[] result = Solution.getSneakyNumbers(new int[]{0, 1, 2, 3, 1, 2});
        Arrays.sort(result);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void getSneakyNumbers_bothDuplicatesAtStart() {
        int[] result = Solution.getSneakyNumbers(new int[]{5, 5, 3, 3, 0, 1, 2, 4});
        Arrays.sort(result);
        assertArrayEquals(new int[]{3, 5}, result);
    }

    @Test
    void getSneakyNumbers_singlePairEach() {
        int[] result = Solution.getSneakyNumbers(new int[]{0, 0, 1, 1});
        Arrays.sort(result);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void getSneakyNumbers_largeNumbersAbove62() {
        int[] result = Solution.getSneakyNumbers(new int[]{63, 63, 64, 64, 0, 1, 2, 3});
        Arrays.sort(result);
        assertArrayEquals(new int[]{63, 64}, result);
    }

    @Test
    void getSneakyNumbers_oneDuplicateBelowAndOneAbove62() {
        int[] result = Solution.getSneakyNumbers(new int[]{10, 10, 70, 70, 0, 1, 2, 3, 4, 5});
        Arrays.sort(result);
        assertArrayEquals(new int[]{10, 70}, result);
    }

    @Test
    void getSneakyNumbers_duplicatesAtEnd() {
        int[] result = Solution.getSneakyNumbers(new int[]{0, 1, 2, 3, 4, 4, 3});
        Arrays.sort(result);
        assertArrayEquals(new int[]{3, 4}, result);
    }
}

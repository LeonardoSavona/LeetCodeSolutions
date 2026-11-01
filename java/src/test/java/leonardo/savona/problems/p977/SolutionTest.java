package leonardo.savona.problems.p977;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void sortedSquares_example() {
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, solution.sortedSquares(new int[]{-4, -1, 0, 3, 10}));
    }

    @Test
    void sortedSquares_mostlyNegative() {
        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, solution.sortedSquares(new int[]{-7, -3, 2, 3, 11}));
    }

    @Test
    void sortedSquares_allNegative() {
        assertArrayEquals(new int[]{1, 4, 9}, solution.sortedSquares(new int[]{-3, -2, -1}));
    }

    @Test
    void sortedSquares_allPositive() {
        assertArrayEquals(new int[]{1, 4, 9}, solution.sortedSquares(new int[]{1, 2, 3}));
    }

    @Test
    void sortedSquares_singleElement() {
        assertArrayEquals(new int[]{25}, solution.sortedSquares(new int[]{-5}));
    }

    @Test
    void sortedSquares_symmetricValues() {
        assertArrayEquals(new int[]{0, 4, 4, 9, 9}, solution.sortedSquares(new int[]{-3, -2, 0, 2, 3}));
    }
}

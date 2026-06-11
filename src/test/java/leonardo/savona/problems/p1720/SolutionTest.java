package leonardo.savona.problems.p1720;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void decode_singleElement() {
        assertArrayEquals(new int[]{1, 1}, solution.decode(new int[]{0}, 1));
    }

    @Test
    void decode_firstIsZero() {
        assertArrayEquals(new int[]{0, 1, 3, 1}, solution.decode(new int[]{1, 2, 2}, 0));
    }

    @Test
    void decode_typicalCase() {
        assertArrayEquals(new int[]{1, 0, 2, 1}, solution.decode(new int[]{1, 2, 3}, 1));
    }

    @Test
    void decode_allEncodedZero() {
        assertArrayEquals(new int[]{5, 5, 5, 5}, solution.decode(new int[]{0, 0, 0}, 5));
    }

    @Test
    void decode_largeValues() {
        int first = 100000;
        int[] encoded = {100000 ^ 200000, 200000 ^ 300000};
        assertArrayEquals(new int[]{100000, 200000, 300000}, solution.decode(encoded, first));
    }

    @Test
    void decode_twoElements() {
        assertArrayEquals(new int[]{3, 1, 2}, solution.decode(new int[]{2, 3}, 3));
    }
}

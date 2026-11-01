package leonardo.savona.problems.p1470;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void shuffle_typicalEvenSplit() {
        assertArrayEquals(new int[]{2, 3, 5, 4, 1, 7}, solution.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3));
    }

    @Test
    void shuffle_allSameValues() {
        assertArrayEquals(new int[]{1, 1, 1, 1, 1, 1}, solution.shuffle(new int[]{1, 1, 1, 1, 1, 1}, 3));
    }

    @Test
    void shuffle_singlePair() {
        assertArrayEquals(new int[]{1, 2}, solution.shuffle(new int[]{1, 2}, 1));
    }

    @Test
    void shuffle_largernValues() {
        assertArrayEquals(new int[]{1, 5, 2, 6, 3, 7, 4, 8}, solution.shuffle(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 4));
    }

    @Test
    void shuffle_descendingOrder() {
        assertArrayEquals(new int[]{4, 1, 3, 2, 2, 3, 1, 4}, solution.shuffle(new int[]{4, 3, 2, 1, 1, 2, 3, 4}, 4));
    }

    @Test
    void shuffle_twoPairs() {
        assertArrayEquals(new int[]{1, 3, 2, 4}, solution.shuffle(new int[]{1, 2, 3, 4}, 2));
    }
}

package leonardo.savona.problems.p1313;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void decompressRLElist_singlePair() {
        assertArrayEquals(new int[]{3, 3}, solution.decompressRLElist(new int[]{2, 3}));
    }

    @Test
    void decompressRLElist_twoPairs() {
        assertArrayEquals(new int[]{2, 4, 4, 4}, solution.decompressRLElist(new int[]{1, 2, 3, 4}));
    }

    @Test
    void decompressRLElist_freqOne() {
        assertArrayEquals(new int[]{5, 7, 9}, solution.decompressRLElist(new int[]{1, 5, 1, 7, 1, 9}));
    }

    @Test
    void decompressRLElist_largeFrequency() {
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, solution.decompressRLElist(new int[]{5, 1}));
    }

    @Test
    void decompressRLElist_multiplePairsVaryingFreq() {
        assertArrayEquals(new int[]{1, 2, 2, 3, 3, 3}, solution.decompressRLElist(new int[]{1, 1, 2, 2, 3, 3}));
    }

    @Test
    void decompressRLElist_sameValue() {
        assertArrayEquals(new int[]{7, 7, 7, 7}, solution.decompressRLElist(new int[]{2, 7, 2, 7}));
    }
}

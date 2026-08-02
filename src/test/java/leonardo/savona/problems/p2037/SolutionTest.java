package leonardo.savona.problems.p2037;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void minMovesToSeat_example() {
        assertEquals(4, solution.minMovesToSeat(new int[]{3, 1, 5}, new int[]{2, 7, 4}));
    }

    @Test
    void minMovesToSeat_secondExample() {
        assertEquals(7, solution.minMovesToSeat(new int[]{4, 1, 5, 9}, new int[]{1, 3, 2, 6}));
    }

    @Test
    void minMovesToSeat_duplicateSeats() {
        assertEquals(4, solution.minMovesToSeat(new int[]{2, 2, 6, 6}, new int[]{1, 3, 2, 6}));
    }

    @Test
    void minMovesToSeat_alreadySeated() {
        assertEquals(0, solution.minMovesToSeat(new int[]{1, 2, 3}, new int[]{3, 2, 1}));
    }

    @Test
    void minMovesToSeat_singleStudent() {
        assertEquals(3, solution.minMovesToSeat(new int[]{5}, new int[]{2}));
    }

    @Test
    void minMovesToSeat_greedyPairingBeatsInputOrder() {
        // pairing in the given order would cost 8; sorted pairing costs 2
        assertEquals(2, solution.minMovesToSeat(new int[]{1, 5}, new int[]{4, 2}));
    }
}

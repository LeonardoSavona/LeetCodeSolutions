package leonardo.savona.problems.p3668;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void recoverOrder_singleElement() {
        int[] order = {1};
        int[] friends = {1};
        assertArrayEquals(new int[]{1}, solution.recoverOrder(order, friends));
    }

    @Test
    void recoverOrder_alreadyOrdered() {
        int[] order = {1, 2, 3};
        int[] friends = {1, 2, 3};
        assertArrayEquals(new int[]{1, 2, 3}, solution.recoverOrder(order, friends));
    }

    @Test
    void recoverOrder_reverseOrder() {
        int[] order = {3, 2, 1};
        int[] friends = {1, 2, 3};
        assertArrayEquals(new int[]{3, 2, 1}, solution.recoverOrder(order, friends));
    }

    @Test
    void recoverOrder_typicalCase() {
        int[] order = {2, 4, 1, 3};
        int[] friends = {1, 2, 3, 4};
        assertArrayEquals(new int[]{2, 4, 1, 3}, solution.recoverOrder(order, friends));
    }

    @Test
    void recoverOrder_friendsSubsetOfOrder() {
        int[] order = {5, 3, 1, 4, 2};
        int[] friends = {4, 2, 5};
        assertArrayEquals(new int[]{5, 4, 2}, solution.recoverOrder(order, friends));
    }

    @Test
    void recoverOrder_largerInput() {
        int[] order = {6, 1, 5, 2, 4, 3};
        int[] friends = {3, 5, 1, 4};
        assertArrayEquals(new int[]{1, 5, 4, 3}, solution.recoverOrder(order, friends));
    }
}

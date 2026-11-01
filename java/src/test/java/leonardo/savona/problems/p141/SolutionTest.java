package leonardo.savona.problems.p141;

import leonardo.savona.base.BaseTest;
import leonardo.savona.problems.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    /**
     * Builds a list and, when pos >= 0, links the tail back to the node at that index.
     * Each test builds its own list: the solution rewrites the links as it walks them.
     */
    private ListNode list(int pos, int... values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode cur = head;
        ListNode cycleTarget = pos == 0 ? head : null;
        for (int i = 1; i < values.length; i++) {
            cur.next = new ListNode(values[i]);
            cur = cur.next;
            if (i == pos) cycleTarget = cur;
        }
        cur.next = cycleTarget;
        return head;
    }

    @Test
    void hasCycle_null() {
        assertFalse(solution.hasCycle(null));
    }

    @Test
    void hasCycle_singleNodeNoCycle() {
        assertFalse(solution.hasCycle(list(-1, 1)));
    }

    @Test
    void hasCycle_singleNodeSelfLoop() {
        assertTrue(solution.hasCycle(list(0, 1)));
    }

    @Test
    void hasCycle_example() {
        // [3, 2, 0, -4], tail links back to index 1
        assertTrue(solution.hasCycle(list(1, 3, 2, 0, -4)));
    }

    @Test
    void hasCycle_noCycleLongList() {
        assertFalse(solution.hasCycle(list(-1, 1, 2, 3, 4, 5)));
    }

    @Test
    void hasCycle_cycleBackToHead() {
        // [1, 2], tail links back to index 0
        assertTrue(solution.hasCycle(list(0, 1, 2)));
    }
}

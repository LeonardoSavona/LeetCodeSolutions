package leonardo.savona.problems.p1290;

import leonardo.savona.base.BaseTest;
import leonardo.savona.problems.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    /** Builds a linked list from the bits, most significant first. */
    private ListNode list(int... bits) {
        ListNode head = new ListNode(bits[0]);
        ListNode cur = head;
        for (int i = 1; i < bits.length; i++) {
            cur.next = new ListNode(bits[i]);
            cur = cur.next;
        }
        return head;
    }

    @Test
    void getDecimalValue_singleZero() {
        assertEquals(0, solution.getDecimalValue(list(0)));
    }

    @Test
    void getDecimalValue_singleOne() {
        assertEquals(1, solution.getDecimalValue(list(1)));
    }

    @Test
    void getDecimalValue_example() {
        // [1, 0, 1] -> 101b -> 5
        assertEquals(5, solution.getDecimalValue(list(1, 0, 1)));
    }

    @Test
    void getDecimalValue_allZeros() {
        assertEquals(0, solution.getDecimalValue(list(0, 0, 0, 0)));
    }

    @Test
    void getDecimalValue_leadingZeros() {
        // [0, 0, 1, 1] -> 11b -> 3
        assertEquals(3, solution.getDecimalValue(list(0, 0, 1, 1)));
    }

    @Test
    void getDecimalValue_maxLength() {
        // 30 nodes is the constraint's upper bound: 2^30 - 1
        int[] bits = new int[30];
        java.util.Arrays.fill(bits, 1);
        assertEquals(1_073_741_823, solution.getDecimalValue(list(bits)));
    }
}

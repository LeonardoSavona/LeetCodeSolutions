package leonardo.savona.problems.p328;

import leonardo.savona.base.BaseTest;
import leonardo.savona.problems.common.ListNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    private ListNode list(int... values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode cur = head;
        for (int i = 1; i < values.length; i++) {
            cur.next = new ListNode(values[i]);
            cur = cur.next;
        }
        return head;
    }

    private int[] toArray(ListNode head) {
        List<Integer> values = new ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }
        return values.stream().mapToInt(Integer::intValue).toArray();
    }

    @Test
    void oddEvenList_null() {
        assertNull(solution.oddEvenList(null));
    }

    @Test
    void oddEvenList_singleElement() {
        assertArrayEquals(new int[]{1}, toArray(solution.oddEvenList(list(1))));
    }

    @Test
    void oddEvenList_twoElements() {
        assertArrayEquals(new int[]{1, 2}, toArray(solution.oddEvenList(list(1, 2))));
    }

    @Test
    void oddEvenList_threeElements() {
        assertArrayEquals(new int[]{1, 3, 2}, toArray(solution.oddEvenList(list(1, 2, 3))));
    }

    @Test
    void oddEvenList_evenLength() {
        // [1, 2, 3, 4] -> [1, 3, 2, 4]
        assertArrayEquals(new int[]{1, 3, 2, 4}, toArray(solution.oddEvenList(list(1, 2, 3, 4))));
    }

    @Test
    void oddEvenList_example1() {
        // [1, 2, 3, 4, 5] -> [1, 3, 5, 2, 4]
        assertArrayEquals(new int[]{1, 3, 5, 2, 4}, toArray(solution.oddEvenList(list(1, 2, 3, 4, 5))));
    }

    @Test
    void oddEvenList_example2() {
        // [2, 1, 3, 5, 6, 4, 7] -> [2, 3, 6, 7, 1, 5, 4]
        assertArrayEquals(new int[]{2, 3, 6, 7, 1, 5, 4},
                toArray(solution.oddEvenList(list(2, 1, 3, 5, 6, 4, 7))));
    }

    @Test
    void oddEvenList_duplicateValues() {
        assertArrayEquals(new int[]{5, 5, 5, 5, 5, 5}, toArray(solution.oddEvenList(list(5, 5, 5, 5, 5, 5))));
    }

    @Test
    void oddEvenList_longerList() {
        // [1..8] -> odd positions 1,3,5,7 then even positions 2,4,6,8
        assertArrayEquals(new int[]{1, 3, 5, 7, 2, 4, 6, 8},
                toArray(solution.oddEvenList(list(1, 2, 3, 4, 5, 6, 7, 8))));
    }

    @Test
    void oddEvenList_negativeValues() {
        assertArrayEquals(new int[]{-1, -3, -5, -2, -4},
                toArray(solution.oddEvenList(list(-1, -2, -3, -4, -5))));
    }
}

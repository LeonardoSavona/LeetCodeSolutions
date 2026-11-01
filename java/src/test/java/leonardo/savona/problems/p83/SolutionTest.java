package leonardo.savona.problems.p83;

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
    void deleteDuplicates_null() {
        assertNull(solution.deleteDuplicates(null));
    }

    @Test
    void deleteDuplicates_singleElement() {
        assertArrayEquals(new int[]{1}, toArray(solution.deleteDuplicates(list(1))));
    }

    @Test
    void deleteDuplicates_noDuplicates() {
        assertArrayEquals(new int[]{1, 2, 3}, toArray(solution.deleteDuplicates(list(1, 2, 3))));
    }

    @Test
    void deleteDuplicates_example() {
        // [1, 1, 2] -> [1, 2]
        assertArrayEquals(new int[]{1, 2}, toArray(solution.deleteDuplicates(list(1, 1, 2))));
    }

    @Test
    void deleteDuplicates_multipleRuns() {
        // [1, 1, 2, 3, 3] -> [1, 2, 3]
        assertArrayEquals(new int[]{1, 2, 3}, toArray(solution.deleteDuplicates(list(1, 1, 2, 3, 3))));
    }

    @Test
    void deleteDuplicates_allSame() {
        assertArrayEquals(new int[]{7}, toArray(solution.deleteDuplicates(list(7, 7, 7, 7))));
    }
}

package leonardo.savona.problems.p206;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    private Solution.ListNode node(int val, Solution.ListNode next) {
        return solution.new ListNode(val, next);
    }

    private Solution.ListNode node(int val) {
        return solution.new ListNode(val);
    }

    private int[] toArray(Solution.ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    @Test
    void reverseList_null() {
        assertNull(solution.reverseList(null));
    }

    @Test
    void reverseList_single() {
        assertArrayEquals(new int[]{1}, toArray(solution.reverseList(node(1))));
    }

    @Test
    void reverseList_two() {
        assertArrayEquals(new int[]{2, 1}, toArray(solution.reverseList(node(1, node(2)))));
    }

    @Test
    void reverseList_multiple() {
        Solution.ListNode head = node(1, node(2, node(3, node(4, node(5)))));
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, toArray(solution.reverseList(head)));
    }
}

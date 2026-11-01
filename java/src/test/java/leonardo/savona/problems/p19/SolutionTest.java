package leonardo.savona.problems.p19;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    private Solution.ListNode build(int... vals) {
        Solution.ListNode dummy = solution.new ListNode();
        Solution.ListNode curr = dummy;
        for (int v : vals) {
            curr.next = solution.new ListNode(v);
            curr = curr.next;
        }
        return dummy.next;
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
    void removeNthFromEnd_example1() {
        Solution.ListNode head = build(1, 2, 3, 4, 5);
        assertArrayEquals(new int[]{1, 2, 3, 5}, toArray(solution.removeNthFromEnd(head, 2)));
    }

    @Test
    void removeNthFromEnd_singleNode() {
        Solution.ListNode head = build(1);
        assertNull(solution.removeNthFromEnd(head, 1));
    }

    @Test
    void removeNthFromEnd_twoNodes_removeLast() {
        Solution.ListNode head = build(1, 2);
        assertArrayEquals(new int[]{1}, toArray(solution.removeNthFromEnd(head, 1)));
    }

    @Test
    void removeNthFromEnd_twoNodes_removeFirst() {
        Solution.ListNode head = build(1, 2);
        assertArrayEquals(new int[]{2}, toArray(solution.removeNthFromEnd(head, 2)));
    }

    @Test
    void removeNthFromEnd_removeHead() {
        Solution.ListNode head = build(1, 2, 3, 4, 5);
        assertArrayEquals(new int[]{2, 3, 4, 5}, toArray(solution.removeNthFromEnd(head, 5)));
    }

    @Test
    void removeNthFromEnd_removeTail() {
        Solution.ListNode head = build(1, 2, 3, 4, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4}, toArray(solution.removeNthFromEnd(head, 1)));
    }

    @Test
    void removeNthFromEnd_removeMiddle() {
        Solution.ListNode head = build(1, 2, 3, 4, 5);
        assertArrayEquals(new int[]{1, 2, 4, 5}, toArray(solution.removeNthFromEnd(head, 3)));
    }
}

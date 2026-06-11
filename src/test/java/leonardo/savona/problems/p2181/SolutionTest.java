package leonardo.savona.problems.p2181;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    private Solution.ListNode node(int val) { return solution.new ListNode(val); }
    private Solution.ListNode node(int val, Solution.ListNode next) { return solution.new ListNode(val, next); }

    private int[] toArray(Solution.ListNode h) {
        List<Integer> l = new ArrayList<>();
        while (h != null) { l.add(h.val); h = h.next; }
        return l.stream().mapToInt(Integer::intValue).toArray();
    }

    @Test
    void mergeNodes_singleSegment() {
        // 0 -> 3 -> 1 -> 0  →  [4]
        Solution.ListNode head = node(0, node(3, node(1, node(0, null))));
        assertArrayEquals(new int[]{4}, toArray(Solution.mergeNodes(head)));
    }

    @Test
    void mergeNodes_twoSegments() {
        // 0->3->1->0->4->5->2->0  →  [4, 11]
        Solution.ListNode head =
            node(0, node(3, node(1, node(0,
            node(4, node(5, node(2, node(0, null))))))));
        assertArrayEquals(new int[]{4, 11}, toArray(Solution.mergeNodes(head)));
    }

    @Test
    void mergeNodes_singleValueSegments() {
        // 0->1->0->2->0->3->0  →  [1, 2, 3]
        Solution.ListNode head =
            node(0, node(1, node(0, node(2, node(0, node(3, node(0, null)))))));
        assertArrayEquals(new int[]{1, 2, 3}, toArray(Solution.mergeNodes(head)));
    }

    @Test
    void mergeNodes_largeValues() {
        // 0->100->200->300->0  →  [600]
        Solution.ListNode head = node(0, node(100, node(200, node(300, node(0, null)))));
        assertArrayEquals(new int[]{600}, toArray(Solution.mergeNodes(head)));
    }

    @Test
    void mergeNodes_returnsNotNull() {
        Solution.ListNode head = node(0, node(7, node(0, null)));
        Solution.ListNode result = Solution.mergeNodes(head);
        assertNotNull(result);
        assertEquals(7, result.val);
        assertNull(result.next);
    }
}

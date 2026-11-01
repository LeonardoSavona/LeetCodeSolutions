package leonardo.savona.problems.p2807;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    private Solution.ListNode node(int val) { return solution.new ListNode(val); }
    private Solution.ListNode node(int val, Solution.ListNode next) { return solution.new ListNode(val, next); }
    private int[] toArray(Solution.ListNode h) { java.util.List<Integer> l = new java.util.ArrayList<>(); while(h!=null){l.add(h.val);h=h.next;} return l.stream().mapToInt(Integer::intValue).toArray(); }

    @Test
    void insertGreatestCommonDivisors_singleNode() {
        Solution.ListNode head = node(6);
        Solution.ListNode result = solution.insertGreatestCommonDivisors(head);
        assertArrayEquals(new int[]{6}, toArray(result));
    }

    @Test
    void insertGreatestCommonDivisors_twoNodes_gcdIsSmaller() {
        Solution.ListNode head = node(18, node(6));
        Solution.ListNode result = solution.insertGreatestCommonDivisors(head);
        assertArrayEquals(new int[]{18, 6, 6}, toArray(result));
    }

    @Test
    void insertGreatestCommonDivisors_twoNodes_coprime() {
        Solution.ListNode head = node(7, node(3));
        Solution.ListNode result = solution.insertGreatestCommonDivisors(head);
        assertArrayEquals(new int[]{7, 1, 3}, toArray(result));
    }

    @Test
    void insertGreatestCommonDivisors_multipleNodes_typicalCase() {
        Solution.ListNode head = node(18, node(6, node(10, node(3))));
        Solution.ListNode result = solution.insertGreatestCommonDivisors(head);
        assertArrayEquals(new int[]{18, 6, 6, 2, 10, 1, 3}, toArray(result));
    }

    @Test
    void insertGreatestCommonDivisors_allSameValues() {
        Solution.ListNode head = node(4, node(4, node(4)));
        Solution.ListNode result = solution.insertGreatestCommonDivisors(head);
        assertArrayEquals(new int[]{4, 4, 4, 4, 4}, toArray(result));
    }

    @Test
    void insertGreatestCommonDivisors_twoNodes_equalValues() {
        Solution.ListNode head = node(12, node(12));
        Solution.ListNode result = solution.insertGreatestCommonDivisors(head);
        assertArrayEquals(new int[]{12, 12, 12}, toArray(result));
    }
}

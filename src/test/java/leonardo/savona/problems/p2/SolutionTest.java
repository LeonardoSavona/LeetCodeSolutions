package leonardo.savona.problems.p2;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    private Solution.ListNode node(int val) { return solution.new ListNode(val); }
    private Solution.ListNode node(int val, Solution.ListNode next) { return solution.new ListNode(val, next); }
    private int[] toArray(Solution.ListNode h) { java.util.List<Integer> l = new java.util.ArrayList<>(); while(h!=null){l.add(h.val);h=h.next;} return l.stream().mapToInt(Integer::intValue).toArray(); }

    @Test
    void addTwoNumbers_singleDigitNoCarry() {
        Solution.ListNode l1 = node(2);
        Solution.ListNode l2 = node(3);
        assertArrayEquals(new int[]{5}, toArray(solution.addTwoNumbers(l1, l2)));
    }

    @Test
    void addTwoNumbers_multiDigitNoCarry() {
        Solution.ListNode l1 = node(2, node(4, node(3, null)));
        Solution.ListNode l2 = node(5, node(6, node(4, null)));
        assertArrayEquals(new int[]{7, 0, 8}, toArray(solution.addTwoNumbers(l1, l2)));
    }

    @Test
    void addTwoNumbers_withCarryPropagation() {
        Solution.ListNode l1 = node(9, node(9, node(9, null)));
        Solution.ListNode l2 = node(1, null);
        assertArrayEquals(new int[]{0, 0, 0, 1}, toArray(solution.addTwoNumbers(l1, l2)));
    }

    @Test
    void addTwoNumbers_unequalLengths() {
        Solution.ListNode l1 = node(1, null);
        Solution.ListNode l2 = node(9, node(9, null));
        assertArrayEquals(new int[]{0, 0, 1}, toArray(solution.addTwoNumbers(l1, l2)));
    }

    @Test
    void addTwoNumbers_bothZero() {
        Solution.ListNode l1 = node(0, null);
        Solution.ListNode l2 = node(0, null);
        assertArrayEquals(new int[]{0}, toArray(solution.addTwoNumbers(l1, l2)));
    }

    @Test
    void addTwoNumbers_carryAtEveryDigit() {
        Solution.ListNode l1 = node(5, node(5, null));
        Solution.ListNode l2 = node(5, node(5, null));
        assertArrayEquals(new int[]{0, 1, 1}, toArray(solution.addTwoNumbers(l1, l2)));
    }
}

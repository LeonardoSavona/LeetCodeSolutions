package leonardo.savona.problems.p21;

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
    void mergeTwoLists_bothEmpty() {
        assertNull(solution.mergeTwoLists(null, null));
    }

    @Test
    void mergeTwoLists_firstEmpty() {
        Solution.ListNode list2 = node(0);
        assertArrayEquals(new int[]{0}, toArray(solution.mergeTwoLists(null, list2)));
    }

    @Test
    void mergeTwoLists_secondEmpty() {
        Solution.ListNode list1 = node(0);
        assertArrayEquals(new int[]{0}, toArray(solution.mergeTwoLists(list1, null)));
    }

    @Test
    void mergeTwoLists_example1() {
        Solution.ListNode list1 = node(1, node(2, node(4)));
        Solution.ListNode list2 = node(1, node(3, node(4)));
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, toArray(solution.mergeTwoLists(list1, list2)));
    }

    @Test
    void mergeTwoLists_differentLengths() {
        Solution.ListNode list1 = node(1, node(5, node(9)));
        Solution.ListNode list2 = node(2);
        assertArrayEquals(new int[]{1, 2, 5, 9}, toArray(solution.mergeTwoLists(list1, list2)));
    }

    @Test
    void mergeTwoLists_negativeValues() {
        Solution.ListNode list1 = node(-10, node(-5, node(0)));
        Solution.ListNode list2 = node(-7, node(3));
        assertArrayEquals(new int[]{-10, -7, -5, 0, 3}, toArray(solution.mergeTwoLists(list1, list2)));
    }

    @Test
    void mergeTwoLists_allDuplicates() {
        Solution.ListNode list1 = node(2, node(2));
        Solution.ListNode list2 = node(2, node(2));
        assertArrayEquals(new int[]{2, 2, 2, 2}, toArray(solution.mergeTwoLists(list1, list2)));
    }
}

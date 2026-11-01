package leonardo.savona.problems.p19;

class Solution {
    public static final String TITLE = "19. Remove Nth Node From End of List";

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        if (size <= 1) return null;
        if (size == n) head = head.next;
        ListNode prec = head;
        curr = head;
        while (curr != null) {
            if (size-- == n) {
                prec.next = curr.next;
                break;
            }
            prec = curr;
            curr = curr.next;
        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
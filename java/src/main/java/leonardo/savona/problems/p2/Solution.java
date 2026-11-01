package leonardo.savona.problems.p2;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static final String TITLE = "2. Add Two Numbers";

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode first = new ListNode();
        ListNode current = first;
        int resto = 0;
        for (;;){
            int val = 0;
            if (l2 != null) {
                val += l2.val;
                l2 = l2.next;
            }
            if (l1 != null) {
                val += l1.val;
                l1 = l1.next;
            }

            val += resto;
            resto = val/10;

            current.val = val%10;
            if (l1 == null && l2 == null) {
                if (resto != 0) current.next = new ListNode(resto);
                return first;
            }

            ListNode nextnode = new ListNode();
            current.next = nextnode;
            current = nextnode;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
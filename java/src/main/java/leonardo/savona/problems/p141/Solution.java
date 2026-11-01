package leonardo.savona.problems.p141;

import leonardo.savona.common.ListNode;

public class Solution {
    public static final String TITLE = "141. Linked List Cycle";

    public boolean hasCycle(ListNode head) {
        while (head != null) {
            ListNode next = head.next;
            if (head == next) return true;
            head.next = head;
            head = next;
        }
        return false;
    }
}
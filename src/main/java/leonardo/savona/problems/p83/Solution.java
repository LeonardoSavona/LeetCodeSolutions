package leonardo.savona.problems.p83;

import leonardo.savona.problems.common.ListNode;

class Solution {
    public static final String TITLE = "83. Remove Duplicates from Sorted List";

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode next = deleteDuplicates(head.next);
        if (next != null && next.val == head.val)
            head.next = next.next;
        return head;
    }
}
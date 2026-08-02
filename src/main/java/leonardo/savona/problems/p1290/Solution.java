package leonardo.savona.problems.p1290;

import leonardo.savona.problems.common.ListNode;

class Solution {
    public static final String TITLE = "1290. Convert Binary Number in a Linked List to Integer";

    public int getDecimalValue(ListNode head) {
        int res = 0;
        while (head != null) {
            res = (res << 1) | head.val;
            head = head.next;
        }
        return res;
    }
}

package leonardo.savona.problems.p2181;

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
    public static final String TITLE = "2181. Merge Nodes in Between Zeros";

    public static ListNode mergeNodes(ListNode head) {
        ListNode scroll = head;
        ListNode sum = head;

        while ((scroll = scroll.next) != null) {
            int val = scroll.val;
            if (val == 0) {
                if (scroll.next == null){
                    sum.next = null;
                } else {
                    sum = sum.next;
                    sum.val = 0;
                }
            } else {
                sum.val += val;
            }
        }

        System.gc();
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
package leonardo.savona.problems.p21;

class Solution {
    public static final String TITLE = "21. Merge Two Sorted Lists";

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode head;
        if (list1.val > list2.val) {
            head = list2;
            list2 = list2.next;
        } else {
            head = list1;
            list1 = list1.next;
        }

        ListNode curr = head;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                curr.next = list2;
                list2 = list2.next;
            } else if (list2 == null) {
                curr.next = list1;
                list1 = list1.next;
            } else if (list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
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

        @Override
        public String toString() {
            if (this.next != null) {
                return val + "," + next;
            } else {
                return String.valueOf(val);
            }
        }
    }
}
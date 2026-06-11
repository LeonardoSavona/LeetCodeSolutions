package leonardo.savona.problems.p2807;

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
    public static final String TITLE = "2807. Insert Greatest Common Divisors in Linked List";

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode currentNode = head;
        ListNode nextNode = currentNode.next;
        while (nextNode != null) {
            int gcd = GCD(currentNode.val, nextNode.val);
            currentNode.next = new ListNode(gcd, nextNode);
            currentNode = nextNode;
            nextNode = currentNode.next;
        }
        return head;
    }
    private static int GCD(int x, int y) {
        while (x != y) {
            if (x > y) {
                int appoggio = x;
                x = y;
                y = appoggio;
            } else {
                y = y-x;
            }
        }
        return x;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
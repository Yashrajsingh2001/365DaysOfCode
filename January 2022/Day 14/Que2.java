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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode result = head;
        int carry = 0;
        
        while (l1 != null || l2 != null || carry > 0) {
            int resVal = (l1 != null? l1.val : 0) + (l2 != null? l2.val : 0) + carry;
            result.next = new ListNode(resVal % 10);
            carry = resVal / 10;
            l1 = (l1 == null ? l1 : l1.next);
            l2 = (l2 == null ? l2 : l2.next);
            result = result.next;
        }
        
        return head.next;
    }
}
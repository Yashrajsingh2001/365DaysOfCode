// Que link: https://leetcode.com/problems/reverse-linked-list-ii/
// 92. Reverse Linked List II


class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null) return null;
        ListNode dummy = new ListNode(0), pre = dummy;
        dummy.next = head;
        for(int i=1; i<m; i++) pre = pre.next;

        ListNode start = pre.next;
        ListNode then = start.next;

        for(int i=0; i<n-m; i++){
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }
        return dummy.next;
    }
}
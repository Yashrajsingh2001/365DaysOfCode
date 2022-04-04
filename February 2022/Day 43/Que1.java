// Que link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// 19. Remove Nth Node From End of List


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode front = head, back = head;
        while(n-- > 0) front = front.next;
        if(front == null) return head.next;
        while(front.next != null){
            front = front.next;
            back = back.next;
        }
        back.next = back.next.next;
        return head;
    }
}
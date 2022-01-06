// Que link: https://leetcode.com/problems/reverse-linked-list/submissions/

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null, next;
        while (head != null) {
            next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}
// newHead is previous of head. 
// Replace newHead with prev, then you might understande code better. 
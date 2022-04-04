// Que link: https://leetcode.com/problems/linked-list-cycle/


class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode slow = head, fast = head;
        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
}
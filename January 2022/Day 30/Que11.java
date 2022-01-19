// Que link: https://leetcode.com/problems/linked-list-cycle-ii/
// 142. Linked List Cycle II



public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;		
            }
        }			
        return null;
    }
}
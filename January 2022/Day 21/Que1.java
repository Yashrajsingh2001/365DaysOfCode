// Que link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
// 83. Remove Duplicates from Sorted List

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode tempHead = head;
         
        while(tempHead != null) {
            if (tempHead.next == null) 
                return head;
            if (tempHead.val == tempHead.next.val) 
                tempHead.next = tempHead.next.next;
            else 
                tempHead = tempHead.next;
        }
        return head;
    }
}


// With Recursion:
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
    }
}
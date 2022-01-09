// Que link: https://leetcode.com/problems/remove-linked-list-elements/
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode pointer = head;
        while (pointer.next != null) {
            if (pointer.next.val == val) pointer.next = pointer.next.next;
            else pointer = pointer.next;
        }
        return head.val == val ? head.next : head;
    }
}



// Solution from discussion forum with recursive approach.
// Both are confusing.
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}


class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)    return null;
        if(head.val == val) return removeElements(head.next, val);

        head.next = removeElements(head.next, val);
        return head;
    }
}
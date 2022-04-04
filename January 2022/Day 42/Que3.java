// Que link: https://leetcode.com/problems/palindrome-linked-list/
// 234. Palindrome Linked List



// Method 1:
// A bit slow but easy to understand
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) { // odd nodes: let right half smaller
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;

        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}


// Method 2:
// Fast but a bit hard to understand
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        // reverse the first portion during iteration
        ListNode fast = head, newHead = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        // skip the node at central place if the list contains odd number of nodes
        if (fast != null) head = head.next;
        while (newHead != null && head != null) {
            if (newHead.val != head.val) return false;
            newHead = newHead.next;
            head = head.next;
        }
        return true;      
    }
}


// Method 3: With Stack --> Slow:
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        Stack stack = new Stack();
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }
        
        while (head != null) {
            if (head.val != (int)stack.pop()) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
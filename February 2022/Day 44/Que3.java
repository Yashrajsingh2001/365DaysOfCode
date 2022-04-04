// Que link: https://leetcode.com/problems/partition-list/
// 86. Partition List


class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode smallerHead = new ListNode(0), biggerHead = new ListNode(0);
        ListNode smaller = smallerHead, bigger = biggerHead;
        while (head != null) {
            if (head.val < x) {
                smaller.next = head;
                smaller = smaller.next;
                // smaller = smaller.next = head; // alternative of above 2 line
            } 
            else {
                bigger.next = head;
                bigger = bigger.next;
                // bigger = bigger.next = head; // alternative of above 2 line
            }
            head = head.next;
        }
        // no need for extra check because of fake heads
        smaller.next = biggerHead.next; // join bigger after smaller
        bigger.next = null; // cut off anything after bigger
        return smallerHead.next;
    }
}
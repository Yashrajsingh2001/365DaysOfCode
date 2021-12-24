// Que LINK: https://leetcode.com/problems/reorder-list/
class Que1 {
    public void reorderList(ListNode head) {
        if (head.next == null) return;
        // We are finding the middle pointer of the linked list
        ListNode oneStep = head, twoStep = head;
        while (twoStep.next != null && twoStep.next.next!= null) {
            oneStep = oneStep.next;
            twoStep = twoStep.next.next;
        }
        ListNode mid = oneStep.next;
        oneStep.next = null;

        // Reverse the second half of the linked list
        ListNode p = mid, q = mid.next, temp_p = null, temp_q = null;
        mid.next = null;
        while (q != null) {
            temp_p = p;
            p = q;
            q = q.next;
            p.next = temp_p;
        }
        mid = p;

        // Merge first half and the reversed second half
        p = head;
        q = mid;
        while (q != null) {
            temp_p = p; temp_q = q;
            p = p.next; q = q.next;
            temp_p.next = temp_q; temp_q.next = p;
        }
    }
}
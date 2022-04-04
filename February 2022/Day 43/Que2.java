// Que link: https://leetcode.com/problems/swap-nodes-in-pairs/
// 24. Swap Nodes in Pairs


class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            current.next = second;
            current.next.next = first;
            current = current.next.next;
        }
        return dummy.next;
    }
}



// Explanation with comments: Got this solution from Discussion forum:
class Solution {
    public ListNode swapPairs(ListNode head) {

        if (head == null) {
            return null;
        }
        ListNode newhead = new ListNode(-1);//dummy
        newhead.next = head;
        ListNode temp = newhead;

        ListNode one = null;
        ListNode two = null;

        // {dummy->1->2->3->4->null}
        //explanation for one loop rest are same.


        while(temp.next!= null && temp.next.next!=null) {
            // temp points to dummy in the beginning.
            // one -> 1
            one = temp.next;
            //two -> 2
            two = temp.next.next;
            // 1-> = 2.next = 3;
            one.next=two.next;
            // 2-> = 1
            two.next = one;
            //now dummy should point to 2
            //if the below is not done dummy->1;
            temp.next = two;
            // temp was pointing to dummy
            //temp->1 
            temp = one;

            // now { dummy->2->1->3->4 } 

        }
        return newhead.next;
    }
}
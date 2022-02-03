// Que link: https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
// 1721. Swapping Nodes in a Linked List


class Solution {
    public ListNode swapNodes(ListNode head, int k) {		
        ListNode f = head, s = head;
        for(int i=1; i<k ; i++) f = f.next;
            
        ListNode  t = f;
        while(f.next != null) {
			s = s.next;
            f = f.next;
        }
        
        int temp = t.val;
        t.val = s.val;
        s.val = temp;
        return head;
    }
}
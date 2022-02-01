// Que link: https://leetcode.com/problems/rotate-list/submissions/
// 61. Rotate List


class Solution {
    public ListNode rotateRight(ListNode head, int n) {
        if (head==null||head.next==null) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode fast=dummy,slow=dummy;

        int i;
        for (i=0;fast.next!=null;i++)//Get the total length 
            fast=fast.next;

        for (int j=i-n%i;j>0;j--) //Get the i-n%i th node
            slow=slow.next;

        fast.next=dummy.next; //Do the rotation
        dummy.next=slow.next;
        slow.next=null;

        return dummy.next;
    }
}



// Without Dummy
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return null;
        int size = 1; // since we are already at head node
        ListNode fast=head;
        ListNode slow = head;

        while(fast.next!=null){
            size++;
            fast = fast.next;
        }

        for(int i=size-k%size;i>1;i--) // i>1 because we need to put slow.next at the start.
            slow = slow.next;

        // No dummy variable.
        fast.next = head;
        head = slow.next;
        slow.next = null;

        return head;
    }
}
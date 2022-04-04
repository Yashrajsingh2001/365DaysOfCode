// Que link: https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
// 82. Remove Duplicates from Sorted List II


class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode dummy=new ListNode(0), pre=dummy, cur=head;
        dummy.next=head;
        while(cur!=null){
            while(cur.next!=null&&cur.val==cur.next.val){
                cur=cur.next;
            }
            if(pre.next==cur){
                pre=pre.next;
            }
            else{
                pre.next=cur.next;
            }
            cur=cur.next;
        }
        return dummy.next;
    }
}
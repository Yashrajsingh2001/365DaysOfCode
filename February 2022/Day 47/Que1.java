// Que link: https://leetcode.com/problems/merge-k-sorted-lists/
// 23. Merge k Sorted Lists
//TODO: Solve it again.

// Method 1:
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        int len = lists.length;                 //no extra memory, decrease end of lists each time when merge two
        while(len != 1){
            for(int i = 0;i<len/2;i++){
                lists[i] = mergeTwo(lists[i*2],lists[i*2+1]);
            }
            if(len % 2 == 1){                   //move the last one
                lists[len/2] = lists[len-1];
            }
            len = (len+1)/2;                    //decrease to half
        }
        return lists[0];
    }
    private ListNode mergeTwo(ListNode node1, ListNode node2){
        if(node1 == null) return node2;
        if(node2 == null) return node1;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(node1 != null || node2 != null){
            if(node2 == null || node1 != null && node1.val < node2.val){
                curr.next = node1;
                node1 = node1.next;
            }else{
                curr.next = node2;
                node2 = node2.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}



// Method 2:
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists==null || lists.length==0) return null;
        
        PriorityQueue<ListNode> queue= new PriorityQueue<ListNode>(lists.length, (a,b)-> a.val-b.val);
        
        ListNode dummy = new ListNode(0);
        ListNode tail=dummy;
        
        for (ListNode node:lists)
            if (node!=null)
                queue.add(node);
            
        while (!queue.isEmpty()){
            tail.next=queue.poll();
            tail=tail.next;
            
            if (tail.next!=null)
                queue.add(tail.next);
        }
        return dummy.next;
    }
}
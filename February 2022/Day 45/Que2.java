// Que link: https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
// 2130. Maximum Twin Sum of a Linked List


class Solution {
    public int pairSum(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode dummy = head;
        while(dummy != null){
            stack.push(dummy);
            dummy = dummy.next;
        }
        int max = 0;
        while(head.next != null){
            max = Math.max(max, (head.val + stack.pop().val));
            head = head.next;
        }
        return max;
    }
}
/*
We can use diffrent conditions in the while loop like:
1) stack.size() > 1
2) int mid=stack.size()/2; then in loop put mid--;

2nd one looks good because loop runs n/2 times
*/
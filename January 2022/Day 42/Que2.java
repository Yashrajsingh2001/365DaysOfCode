// Que link: https://leetcode.com/problems/delete-node-in-a-linked-list/
// 237. Delete Node in a Linked List

// We just set the valuse of next node in current node then updated node.next with node.next.next
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
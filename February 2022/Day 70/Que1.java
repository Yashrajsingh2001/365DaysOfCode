// Que link: https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1/?page=1&company[]=Amazon&sortBy=submissions#
// Remove loop in Linked List

class Solution{
    public static void removeLoop(Node head){
		if (head == null || head.next == null) return;

		Node slow = head, fast = head;
		slow = slow.next;
		fast = fast.next.next;

		while (fast != null && fast.next != null) {
			if (slow == fast) break;
			slow = slow.next;
			fast = fast.next.next;
		}

		// If loop exists
		if (slow == fast) {
			slow = head;
			if (slow != fast) {
				while (slow.next != fast.next) {
					slow = slow.next;
					fast = fast.next;
				}
				fast.next = null; // remove loop
			}
			else {
				while(fast.next != slow) {
					fast = fast.next;
				}
				fast.next = null;
			}
		}
	}
}
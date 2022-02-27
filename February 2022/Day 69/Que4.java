// Que link: https://leetcode.com/problems/kth-largest-element-in-a-stream/
// 703. Kth Largest Element in a Stream


import java.util.PriorityQueue;

class KthLargest {
    final PriorityQueue<Integer> q;
    final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        q = new PriorityQueue<Integer>(k); // (k) is the initial capacity of PriorityQueue
        for (int a : nums) {
            add(a);
        }
    }

    public int add(int val) {
        q.offer(val);
        if (q.size() > k) {
            q.poll(); // Remove smallest value till it reaches size k. Now our smallest value will be k'th largest.
        }
        return q.peek();
    }
}
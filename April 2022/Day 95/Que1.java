// Que link: https://leetcode.com/problems/last-stone-weight/
// 1046. Last Stone Weight


import java.util.PriorityQueue;

class Que1 {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> (b-a)); // Max heap
        for(int i : stones) pq.offer(i);

        while(pq.size() > 1){
            int largest = pq.poll();
            int secondLargest = pq.poll();
            if(largest == secondLargest) continue;
            else pq.offer(largest-secondLargest);
        }

        return pq.size()==0 ? 0 : pq.poll();
        
    }
}


// Or we can simply do it like:
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)-> b - a);
        for (int a : stones)
            pq.offer(a);
        while (pq.size() > 1)
            pq.offer(pq.poll() - pq.poll());
        return pq.poll();
    }
}
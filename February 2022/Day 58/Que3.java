// Que link https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/
// 1005. Maximize Sum Of Array After K Negations


class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        for(int x: A) pq.add(x);
        while(K--  > 0) pq.add(-pq.poll());
  
        int sum  = 0;
        for(int i = 0; i < A.length; i++){
            sum += pq.poll();
        }
        return sum;
    }
}

// By default elements are added in ascending order.
// So when we do .poll, the head which is the smallest elementt is taken out.
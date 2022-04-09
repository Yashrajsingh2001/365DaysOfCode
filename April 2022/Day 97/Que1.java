// Que link: https://leetcode.com/problems/top-k-frequent-elements/
// 347. Top K Frequent Elements


// Slow but easy to understand:
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int arr[] = new int[k];
        for(int i=0; i<k; i++){
            int max= Integer.MIN_VALUE, val=0;
            for(int j : map.keySet()){
                if(max<map.get(j)){
                    max = map.get(j);
                    val = j;
                }
            }
            arr[i]=val;
            map.remove(val);
        }
        return arr;
    }
}


// Fast: Solution provided by LeetCode:
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // O(1) time
        if (k == nums.length) {
            return nums;
        }
        
        // 1. build hash map : character and how often it appears
        // O(N) time
        Map<Integer, Integer> count = new HashMap();
        for (int n: nums) {
          count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // init heap 'the less frequent element first'
        Queue<Integer> heap = new PriorityQueue<>(
            (n1, n2) -> count.get(n1) - count.get(n2));

        // 2. keep k top frequent elements in the heap
        // O(N log k) < O(N log N) time
        for (int n: count.keySet()) {
          heap.add(n);
          if (heap.size() > k) heap.poll();    
        }

        // 3. build an output array
        // O(k log k) time
        int[] top = new int[k];
        for(int i = k - 1; i >= 0; --i) {
            top[i] = heap.poll();
        }
        return top;
    }
}



/*
* Try to run or debug for better understanding
import java.util.*;

class Que1 {
    public static void topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int arr[] = new int[map.size()];
        int i=0;
        while(map.size()>0){
            int max= Integer.MIN_VALUE, val=0;
            for(int j : map.keySet()){
                if(max<map.get(j)){
                    max = map.get(j);
                    val = j;
                }
            }
            arr[i++]=val;
            map.remove(val);
        }
        for(i=0; i<k; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int nums[] = {5,5,4,3,2,7,6,5,5,5,5,3,4,3,3}, k = 4;
        topKFrequent(nums, k);
    }
}
*/


// Que link: https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
// 1588. Sum of All Odd Length Subarrays



class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans = 0, n = arr.length;
        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + arr[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j += 2) {
                ans += prefixSum[j] - prefixSum[i];
            }
        }
        return ans;        
    }
}
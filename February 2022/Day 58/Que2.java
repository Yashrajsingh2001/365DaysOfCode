// Que link: https://leetcode.com/problems/squares-of-a-sorted-array/
// 977. Squares of a Sorted Array


// Method 1:
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++)
            nums[i] *= nums[i];
        Arrays.sort(nums);
        return nums;
    }
}


// Method 2:
class Solution {
    public int[] sortedSquares(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        int L = 0, R = n-1;
        for (int i = n-1; i >= 0; i--) {
            if (Math.abs(A[L]) > Math.abs(A[R])) {
                result[i] = A[L] * A[L];
                L++;
            } else {
                result[i] = A[R] * A[R];
                R--;
            }
        }
        return result;
    }
}
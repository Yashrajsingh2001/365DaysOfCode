// Que link: https://leetcode.com/problems/search-in-rotated-sorted-array/
// 33. Search in Rotated Sorted Array


class Solution {
    public int search(int[] A, int target) {
        int start = 0;
        int end = A.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (A[mid] == target) return mid;
            
            if (A[start] <= A[mid]) {
                if (target >= A[start] && target < A[mid]) 
                    end = mid - 1;
                else start = mid + 1;
            }
            else {
                if (target > A[mid] && target <= A[end]) 
                    start = mid + 1;
                else end = mid - 1;
            }
        }
        return A[start] == target ? start : -1;
    }
}

// Input: nums = [4,5,6,7,0,1,2], target = 0
// Output: 4

// Input: nums = [4,5,6,7,0,1,2], target = 3
// Output: -1
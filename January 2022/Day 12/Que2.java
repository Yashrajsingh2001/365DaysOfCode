// Que LINK: https://leetcode.com/problems/peak-index-in-a-mountain-array/

// Method 1
class Solution {
    public int peakIndexInMountainArray(int[] A) {
        for (int i = 1; i + 1 < A.length; ++i) 
            if (A[i] > A[i + 1]) 
                return i;
        return 0;
    }
}

// Method 2
class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int start = 0, end = A.length - 1, mid;
        while (start < end) {
            mid = (start + end) / 2;
            if (A[mid] < A[mid + 1])
                start = mid + 1;
            else
                end = mid;
        }
        return start;
    }
}
// Que LINK: https://leetcode.com/problems/search-insert-position/

class Solution {
    public int searchInsert(int[] A, int target) {
        int start = 0, end = A.length-1;
        while(start<=end){
            int mid = (start+end)/2; //start+(end-start)/2;
            if(A[mid] == target) return mid;
            else if(A[mid] > target) end = mid-1;
            else start = mid+1;
        }
        return start;
    }
}
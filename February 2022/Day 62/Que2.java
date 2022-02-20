// Que link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// 34. Find First and Last Position of Element in Sorted Array


// Method 1:
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = binarySearch(nums, target, true);
        int right = binarySearch(nums, target, false);
        return new int[] {left, right};
    }
    
    private int binarySearch(int[] nums, int target, boolean leftBias){
        int l = 0, r = nums.length-1, i = -1;
        while(l <= r){
            int m = l + (r-l)/2;
            if(nums[m] < target)
                l = m + 1;
            else if(nums[m] > target)
                r = m - 1;
            else{
                i = m;
                if(leftBias) r = m - 1;
                else l = m + 1;
            }
        }
        return i;
    }
}



// Method 2:
class Solution {
    public int[] searchRange(int[] nums, int target) {
        double left = target - 0.5, right = target + 0.5;
        int l = bs(nums, left), r = bs(nums, right);
        if(l == r) return new int[]{-1, -1};
        return new int[]{l, r-1};
    }

    public int bs(int[] nums, double target) {
        int l = 0, h = nums.length-1;
        while(l <= h){
            int m = l + (h - l)/2;
            if(target > nums[m]) l = m+1;
            else h = m-1;
        }
        return l;
    }
}

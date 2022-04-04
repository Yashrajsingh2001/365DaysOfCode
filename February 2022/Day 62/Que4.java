// Que link: https://leetcode.com/problems/single-element-in-a-sorted-array/
// 540. Single Element in a Sorted Array


class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length-1;
        while(left < right){
            int mid = (left + right)/2;
            if((mid % 2 == 0 && nums[mid] == nums[mid +1]) || 
               (mid %2 == 1 && nums[mid] == nums[mid - 1]))
                left = mid + 1;
            else
                right = mid;
        }
        return nums[left];
    }   
}
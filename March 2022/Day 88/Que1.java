// Que link: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
// 81. Search in Rotated Sorted Array II


// Method 1:
class Solution {
    public boolean search(int[] nums, int target) {
        int start=0, end=nums.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target) return true;

            if(nums[start] < nums[mid]){
                if(target < nums[start] || target > nums[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else if(nums[start] > nums[mid]){
                if(target < nums[mid] || target > nums[end]){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }else{
                start ++;
            }
        }
        return false;
    }
}


// Method 2:
class Solution {
    public boolean search(int[] nums, int target) {
        int left=0, right=nums.length-1;
        
        while(left<=right){
            if(nums[left]==target || nums[right]==target) return true;
            else if(target > nums[left]) left++;
            else if(target < nums[right]) right--;
            else break;
        }
        return false;
    }
}


// Method 3:
class Solution {
    public boolean search(int[] nums, int target) {
        int left=0, right=nums.length-1;
        
        while(left<=right){
            if(nums[left]==target || nums[right]==target) return true;
            else if(target > nums[left]){
                while(left<right && nums[left+1]==nums[left]){
                    left++;
                }
                left++;   
            }
            else if(target < nums[right]) {
                while(left<right && nums[right-1]==nums[right]){
                    right--;
                }
                right--;   
            }
            else break;
        }
        return false;
    }
}
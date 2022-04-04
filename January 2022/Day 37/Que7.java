// Que link: https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
// 1913. Maximum Product Difference Between Two Pairs


// Time: O(NLogN)
class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int last=nums.length-1;
        return (nums[last]*nums[last-1] - nums[0]*nums[1]);
    }
}



// Time: O(N)
class Solution{
    public int maxProductDifference(int[] nums) {
        int largest = 0, secondLargest = 0, smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>=largest) {
                secondLargest = largest;
                largest = nums[i];
            } 
            else if(nums[i]>secondLargest) secondLargest = nums[i];
            
            if(nums[i]<=smallest) {
                secondSmallest = smallest;
                smallest = nums[i];
            } 
            else if(nums[i]<secondSmallest) secondSmallest = nums[i];
        }
        return largest * secondLargest - smallest * secondSmallest;
    }
}
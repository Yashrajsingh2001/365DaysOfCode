// Que link: https://leetcode.com/problems/array-partition-i/
// 561. Array Partition 


import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0; i<nums.length; i+=2){
            sum += nums[i]; // sum += Math.min(nums[i], nums[i+1]);
        }
        return sum;
    }
}

// We can use  sum += nums[i] insted of  sum += Math.min(nums[i], nums[i+1]);
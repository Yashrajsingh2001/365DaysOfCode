// Que link: https://leetcode.com/problems/jump-game/
// 55. Jump Game


// Method 1:
class Solution {
    public boolean canJump(int[] nums) {
        int lastGoodIndexPosition=nums.length-1;
        for(int i=nums.length-1; i>=0; i--){
           if(nums[i]+i >= lastGoodIndexPosition) 
               lastGoodIndexPosition=i;
        }
        return lastGoodIndexPosition==0;
    }
}


// Method 2:
class Solution {
    public boolean canJump(int[] nums) {
        int max=0;
        for(int i=0; i<nums.length; i++){
            if(i>max) return false;
            max = Math.max(nums[i]+i, max);
        }
        return true;
    }
}
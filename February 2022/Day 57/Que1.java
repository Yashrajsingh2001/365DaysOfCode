// Que link: https://leetcode.com/problems/largest-number-at-least-twice-of-others/
// 747. Largest Number At Least Twice of Others


class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        if(n==1) return 0;
        int max=Integer.MIN_VALUE, secMax=Integer.MIN_VALUE, maxIndex=0;
        
        for(int i=0; i<n; i++){
            if(nums[i]>max){
                secMax = max;
                max = nums[i];
                maxIndex=i;
            }
            else if(nums[i]>secMax)
                secMax = nums[i];
        }
        return max >= secMax*2 ? maxIndex : -1;
    }
}
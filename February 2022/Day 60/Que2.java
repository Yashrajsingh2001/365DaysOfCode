// Que link: https://leetcode.com/problems/max-consecutive-ones/
// 485. Max Consecutive Ones


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0, cur=0;
        for(int i : nums){
            if(i==1) cur++;
            else cur=0;
            max = Math.max(cur, max);
        }
        return max;
    }
}
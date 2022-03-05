// Que link: https://leetcode.com/problems/delete-and-earn/
// 740. Delete and Earn


//! Solve again
// Method 1:
class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = 10001;
        int[] values = new int[n];
        for (int num : nums)
            values[num] += num;

        int take = 0, skip = 0;
        for (int i = 0; i < n; i++) {
            int takei = skip + values[i];
            int skipi = Math.max(skip, take);
            take = takei;
            skip = skipi;
        }
        return Math.max(take, skip);
    }
}


// Method 2:
class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] sum = new int[10002]; 
        
        for(int i = 0; i < nums.length; i++){
            sum[nums[i]] += nums[i]; 
        }
        
        for(int i = 2; i < sum.length; i++){
            sum[i] = Math.max(sum[i-1], sum[i-2] + sum[i]);
        }
        return sum[10001];
    }
}
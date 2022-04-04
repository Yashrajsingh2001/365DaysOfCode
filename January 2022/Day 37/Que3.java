// Que link: https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/
// 2006. Count Number of Pairs With Absolute Difference K

// Slow
class Solution {
    public int countKDifference(int[] nums, int k) {
        int cnt=0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(Math.abs(nums[i] - nums[j]) == k) cnt++;
            }
        }
        return cnt;
    }
}


// Fast
class Solution {
    public int countKDifference(int[] nums, int k) {
        int[] cnt = new int[101]; 
        int res = 0;
        for (int n : nums) cnt[n]++;
        for (int i = k + 1; i < 101; i++) // for (int i = 0; i < 101-k; ++i)
            res += cnt[i] * cnt[i - k];   //    res += cnt[i] * cnt[i + k];
        return res;
    }
}
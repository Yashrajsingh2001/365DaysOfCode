// Que link: https://leetcode.com/problems/subarray-sum-equals-k/
// 560. Subarray Sum Equals K


// Method 1:
class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (preSum.containsKey(sum - k)) {
                result += preSum.get(sum - k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        
        return result;
    }
}


// Method 2:
class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        
        for (int num : nums) {
            sum += num;
            result += preSum.getOrDefault(sum - k, 0);
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }   
        return result;
    }
}


/*
//*! This might give TLE sometimes so it's not a good solution
class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans=0, n=nums.length;
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<n; j++){
                sum += nums[j];
                if(sum == k) ans++;
            }
        }
        return ans;
    }
}
*/
// Que link: https://leetcode.com/problems/subarray-sums-divisible-by-k/
// 974. Subarray Sums Divisible by K


// Slow
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int arr[] = new int[k];
        arr[0]=1;
        int ans=0, sum=0, rem=0;
        
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            rem = sum % k;
            if(rem < 0) rem += k;
            
            ans += arr[rem];
            arr[rem]++;
        }
        return ans;
    }
}


// Fast
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int arr[] = new int[k];
        arr[0]=1;
        int ans=0, sum=0, rem=0;
        
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            rem = sum % k;
            if(rem < 0) rem += k;
            
            ans += arr[rem];
            arr[rem]++;
        }
        return ans;
    }
}
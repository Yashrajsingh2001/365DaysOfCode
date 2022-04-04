// Que link: https://leetcode.com/problems/count-number-of-maximum-bitwise-or-subsets/
// 2044. Count Number of Maximum Bitwise-OR Subsets


// Method 1:
class Solution {
    int res = 0, target = 0;
    
    public int countMaxOrSubsets(int[] nums) {
        for (int num : nums)
            target |= num;
        
        dfs(nums, 0, 0);
        return res;
    }
    
    public void dfs(int[] nums, int idx, int mask) {
        if (mask == target) res++;
        for (int i = idx; i < nums.length; i++)
            dfs(nums, i + 1, mask | nums[i]);
    }
}



// Method 2:
class Solution {
    public int countMaxOrSubsets(int[] nums) {
        subsets(nums, 0, 0);
        return count;
    }
    int count = 0;
    int maxOR = 0;
    
    private void subsets(int[] arr, int vidx, int OR){
        if(vidx == arr.length){
            if(OR == maxOR){
                count ++;
            }
            else if(OR > maxOR){
                count = 1;
                maxOR = OR;
            }
            return;
        }
        
        subsets(arr, vidx+1, OR | arr[vidx]); // include
        subsets(arr, vidx+1, OR); // exclude
    }
}
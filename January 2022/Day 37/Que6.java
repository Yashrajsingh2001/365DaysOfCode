// Que link: https://leetcode.com/problems/find-target-indices-after-sorting-array/
// 2089. Find Target Indices After Sorting Array


// Method 1:
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target) ans.add(i);
        }
        return ans;
    }
}


// Method 2:
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count = 0, lessthan = 0;
        for (int n : nums) {
            if (n == target) count++;
            if (n < target) lessthan++;
        }
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(lessthan++);
        }
        return result;
    }
}
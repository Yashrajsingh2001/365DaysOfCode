// Que link: https://leetcode.com/problems/combination-sum/
// 39. Combination Sum


class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int [] nums, int remain, int start){
        if(remain < 0) 
            return;
        if(remain == 0) 
            result.add(new ArrayList<>(tempList));
        
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(result, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
            tempList.remove(tempList.size() - 1);
        }
    }
}
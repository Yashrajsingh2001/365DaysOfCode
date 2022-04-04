// Que link: https://leetcode.com/problems/subsets/
// 78. Subsets


class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<Integer>(), nums, 0);
        return result;
    }
    
    void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start){
        if(nums.length == start){
            result.add(new ArrayList<>(tempList));    
            return;
        }
        tempList.add(nums[start]);
        backtrack(result, tempList, nums, start+1);
        tempList.remove(tempList.size()-1);
        backtrack(result, tempList, nums, start+1);
    }
}
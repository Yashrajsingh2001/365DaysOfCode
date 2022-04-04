// Que LINK: https://leetcode.com/problems/contains-duplicate/

// 6 ms	51.9 MB
class Solution {
    public boolean containsDuplicate(int[] nums) {
        final Set<Integer> distinct = new HashSet<Integer>();
        for(int num : nums) {
            if(distinct.contains(num)) {
                return true;
            }
            distinct.add(num);
        }
        return false;
    }
}



// Too slow: 25 ms	65.1 MB
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int ind = 1; ind < nums.length; ind++) {
            if(nums[ind] == nums[ind - 1]) {
                return true;
            }
        }
        return false;
    }
}
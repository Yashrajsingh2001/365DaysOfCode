// Que link: https://leetcode.com/problems/contains-duplicate-ii/
// 219. Contains Duplicate II


// Method 1:
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0, j=0; i < nums.length; i++){
            if(i > k) set.remove(nums[j++]); // insted of j we can use [i-k-1]
            if(!set.add(nums[i])) return true; 
        }
        return false;
    }
}



// Method 2:
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
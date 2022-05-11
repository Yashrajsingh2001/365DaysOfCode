// Que link: https://leetcode.com/problems/3sum/
// 15. 3Sum


// Fast
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList();
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            
            int l=i+1, r= nums.length-1;
            while(l<r){
                int tSum = nums[i] + nums[l] + nums[r];
                if (tSum>0) r--;
                else if(tSum<0) l++;
                else{
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++; r--;
                    while(nums[l] == nums[l-1] && l<r) l++;
                }
            }
        }
        return res;
    }
}


// Slow
class Solution {
    public  List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res  = new HashSet<>();
        if(nums.length==0) return new ArrayList<>(res);
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++){
            int j =i+1, k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0)res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                else if (sum >0) k--;
                else j++; // sum<0
            }
        }
        return new ArrayList<>(res);
    }
}
// Que link: https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
// 1608. Special Array With X Elements Greater Than or Equal X


// Method 1:
class Solution {
    public int specialArray(int[] nums) {
        for(int i=1; i<1001; i++){
            int cnt=0;
            for(int num : nums){
                if(num >= i) cnt++;
            }
            if(i==cnt) return i;
        }
        return -1;
    }
}


// Method 2:
class Solution {
    public int specialArray(int[] nums) {
        int[] bucket = new int[1001];
        for(int num : nums)
            bucket[num]++;
        int total = nums.length;
        for(int i=0; i<1001; i++){
            if(i == total) 
                return i;
            total -= bucket[i];
        }
        return -1;
    }
}
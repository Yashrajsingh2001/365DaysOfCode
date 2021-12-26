// Que LINK: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int i : nums){
            ans += ((int)Math.log10(i)+1)%2==0?1:0;
        }
        return ans;
    }
}
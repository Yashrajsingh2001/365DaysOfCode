// Que LINK: https://leetcode.com/problems/find-the-highest-altitude/

class Solution {
    public int largestAltitude(int[] gain) {
        int max=0,current=0,n=gain.length;
        for(int i=0;i<n;i++){
            current+=gain[i]; 
            max=Math.max(current, max);
        }
        return max;
    }
}
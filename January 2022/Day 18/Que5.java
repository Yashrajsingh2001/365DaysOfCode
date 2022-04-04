// Que link: https://leetcode.com/problems/climbing-stairs/

class Solution {
    public int climbStairs(int n) {
        if(n <= 0) return 0;
        if(n == 1 || n == 2) return n;

        int i = 1, j = 2, all_ways = 0;
        for(int k=2; k<n; k++){
            all_ways = i + j;
            i = j;
            j = all_ways;
        }
        return all_ways;
    }
}
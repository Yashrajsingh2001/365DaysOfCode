// Que link: https://leetcode.com/problems/unique-paths/
// 62. Unique Paths


class Solution {
    public int uniquePaths(int m, int n) {
        if(m == 1 || n == 1)
            return 1;
        m--;
        n--;
        // Swap, so that m is the bigger number
        if(m < n) {
            int t = m;
            m = n;
            n = t;
        }
        long res = 1;
        int j = 1;
        // Instead of taking factorial, keep on multiply & divide
        for(int i = m+1; i <= m+n; i++, j++){
            res *= i;
            res /= j;
        }
        return (int)res;
    }
}
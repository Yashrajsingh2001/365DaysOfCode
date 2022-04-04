// Que link: https://leetcode.com/problems/unique-binary-search-trees/
// 96. Unique Binary Search Trees


//* Explanation: https://leetcode.com/problems/unique-binary-search-trees/discuss/31706/Dp-problem.-10%2B-lines-with-comments
// So, the formulation is:
    // F(n) = F(0) * F(n-1) + F(1) * F(n-2) + F(2) * F(n-3) + ... + F(n-2) * F(1) + F(n-1) * F(0)

class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = dp[1] = 1;
        for (int i=2; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                dp[i] += dp[j-1] * dp[i-j];
            }
        }
        return dp[n];
    }
}
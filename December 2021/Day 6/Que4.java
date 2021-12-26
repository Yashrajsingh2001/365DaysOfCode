// Que LINK: https://leetcode.com/problems/transpose-matrix/

class Solution {
    public int[][] transpose(int[][] A) {
        int m = A.length, n = A[0].length;
        int[][] ans = new int[n][m];
        for (int j = 0; j < n; j++)
            for (int i = 0; i < m; i++)
                ans[j][i] = A[i][j];
        return ans;
    }
}
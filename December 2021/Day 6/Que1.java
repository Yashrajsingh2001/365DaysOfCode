// Que LINK: https://leetcode.com/problems/matrix-diagonal-sum/

// Method 1
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length, ans = 0;
        for(int i=0; i<n; i++){
            ans+=mat[i][i];
            ans+=mat[n-1-i][i];
        }
        return n%2==0?ans:ans-mat[n/2][n/2];
    }
}

// Method 2
class Solution {
    public int diagonalSum(int[][] mat) {
        int n =mat[0].length, ans=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j || j==n-i-1){
                    ans+=mat[i][j];
                }
            }
        }
        return ans;
    }
}
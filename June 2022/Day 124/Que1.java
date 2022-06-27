// https://www.geeksforgeeks.org/longest-common-subsequence-dp-4/
// Longest Common Subsequence LCS using Tabulation Method
//* Bottom Up


public class Que1 {
    public static void main(String args[]){
 
        String X = "AGGTAB";
        String Y = "GXTXAYB";
     
        int m = X.length();
        int n = Y.length();
        int[][] dp = new int[m + 1][n + 1];
        System.out.println("Length of LCS is "+lcs(X, Y, m, n, dp));
    }

    private static int lcs(String x, String y, int m, int n, int[][] dp) {
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(x.charAt(i-1) == y.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[m][n];
    }
}

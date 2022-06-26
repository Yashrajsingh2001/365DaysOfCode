// https://www.geeksforgeeks.org/longest-common-subsequence-dp-4/

public class Que3 {
    public static void main(String args[]){
 
        String X = "AGGTAB";
        String Y = "GXTXAYB";
     
        int m = X.length();
        int n = Y.length();
        int[][] dp = new int[m + 1][n + 1];
        for(int i=0;i<m + 1;i++){
          for(int j=0;j<n + 1;j++){
            dp[i][j] = -1;
          }
        }
        System.out.println("Length of LCS is "+lcs(X, Y, m, n, dp));
    }

    private static int lcs(String x, String y, int m, int n, int[][] dp) {
        if(m==0 || n==0) return 0;
        if(dp[m][n] != -1) return dp[m][n];

        if(x.charAt(m-1)==y.charAt(n-1)) 
            return dp[m][n] = 1 + lcs(x, y, m-1, n-1, dp);

        return dp[m][n] = Math.max(lcs(x, y, m-1, n, dp), lcs(x, y, m, n-1, dp));
    }
}

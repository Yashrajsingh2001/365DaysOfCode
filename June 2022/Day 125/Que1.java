// Que Link: https://practice.geeksforgeeks.org/problems/edit-distance3702/1/?utm_source=youtube&utm_medium=collabteam_anujbhaiya&utm_campaign=editdistance#
// Edit Distance 

class Solution {
    public int editDistance(String s, String t) {
        // Code here
        int m = s.length(), n = t.length();
        int[][] dp = new int[m+1][n+1];
        
        for(int i=0; i<=m; i++) dp[i][0]=i;
        for(int j=0; j<=n; j++) dp[0][j]=j;
        
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(s.charAt(i-1)==t.charAt(j-1)) dp[i][j] = dp[i-1][j-1];
                else dp[i][j] = 1 + Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]);
            }
        }
        return dp[m][n];
    }
}
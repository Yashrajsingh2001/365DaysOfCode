// Que Link: https://practice.geeksforgeeks.org/problems/rod-cutting0840/1/?utm_source=youtube&utm_medium=collabteam_anujbhaiya&utm_campaign=rodcutting
//* Rod Cutting 

class Solution{
    public int cutRod(int price[], int n) {
        //code here
        int[] dp = new int[n+1];
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                dp[i] = Math.max(dp[i], price[j]+dp[i-j-1]);
            }
        }
        return dp[n];
    }
}
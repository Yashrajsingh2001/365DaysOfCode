// https://www.codechef.com/problems/SUMTRIAN
// Problem Code: SUMTRIAN



/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while(T-- >0){
            int  n = scan.nextInt();
            int arr[][] = new int[n+1][n+1];
            
            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++)
                    arr[i][j] = scan.nextInt();
            }
            
            int dp[][] = new int[n+1][n+1];
            for(int j=1; j<=n; j++)
                dp[n][j] = arr[n][j];
                
            for(int i=n-1; i>=0; i--){
                for(int j=1; j<=i; j++)
                    dp[i][j] = arr[i][j] + Math.max(dp[i+1][j] , dp[i+1][j+1]);
            }
            System.out.println(dp[1][1]);
        }
	}
}

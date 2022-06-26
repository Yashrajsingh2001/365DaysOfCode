// Que: Find min coin required to equal total money

import java.util.Arrays;

public class Que1 {
	public static void main(String[] args) {

		int money = 18;
		int coin[] = {7, 5, 1};
		
		int dp[] = new int[money+1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		
		int ans = minCoins(money, coin, dp);
		System.out.println(ans);
		
		for(int x: dp) {
			System.out.print(x+" ");
		}
	}
	
	static int minCoins(int money, int coin[], int dp[]) {
		
		if(money == 0) return 0;
		
		int ans = Integer.MAX_VALUE;
		
		for(int i = 0; i<coin.length; i++) {
			if(money-coin[i] >= 0) {
				int subAns = 0;
				if(dp[money-coin[i]] != -1) {
					subAns = dp[money-coin[i]];
				} else {
					subAns = minCoins(money-coin[i], coin, dp);
				}
				if(subAns != Integer.MAX_VALUE && 
						subAns + 1 < ans) {
					ans = subAns + 1;
				}
			}
		}
		return dp[money] = ans;
	}
}
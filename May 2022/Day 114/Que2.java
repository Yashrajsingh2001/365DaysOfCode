// Que link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
// 122. Best Time to Buy and Sell Stock II


// Method 1:
class Solution {
    public int maxProfit(int[] prices) {
        int i=0, buy, sell, profit=0, n=prices.length-1;
        while(i<n){
            while(i<n && prices[i]>=prices[i+1]) i++;
            buy = prices[i];
            
            while(i<n && prices[i]<prices[i+1]) i++;
            sell = prices[i];
            
            profit += sell-buy;
        }
        return profit;
    }
}


// Method 2:
class Solution {
    public int maxProfit(int[] A) {                        
        int n = A.length, lastBuy = -A[0], lastSold = 0;
        if (n == 0) return 0;
                                
        for (int i = 1; i < n; i++) {
            int curBuy = Math.max(lastBuy, lastSold - A[i]);
            int curSold = Math.max(lastSold, lastBuy + A[i]);
            lastBuy = curBuy;
            lastSold = curSold;
        }
        return lastSold;
    }
}
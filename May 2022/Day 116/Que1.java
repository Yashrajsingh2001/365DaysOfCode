// Que link: https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
// 1423. Maximum Points You Can Obtain from Cards


class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0, n=cardPoints.length, window=0, ans=0;
        for(int i : cardPoints) sum+=i;
        
        if(n==k) return sum;
        for(int i=0; i<n-k-1; i++)
            window += cardPoints[i];
        
        for(int i=n-k-1, j=0; i<n; i++, j++){
            window += cardPoints[i];
            ans = Math.max(ans, sum-window);
            window -= cardPoints[j]; //* [i-(n-k-i) is same as j]
        }
        return ans;
    }
}
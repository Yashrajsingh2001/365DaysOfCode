// Que link: https://leetcode.com/problems/time-needed-to-buy-tickets/
// 2073. Time Needed to Buy Tickets


class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int res = 0;
        for(int i = 0;i<tickets.length;i++){
            if(i <= k){
                res += Math.min(tickets[k],tickets[i]);
            }else{
                res += Math.min(tickets[k] - 1,tickets[i]);
            }
        }
        return res;
    }
}
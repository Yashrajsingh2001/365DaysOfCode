// Que link: https://leetcode.com/problems/count-all-valid-pickup-and-delivery-options/
// 1359. Count All Valid Pickup and Delivery Options


//* Wonderful solution with explanation is provided on LeetCode solution tab.
// Permutations (Math)
class Solution {
    public int countOrders(int n) {
        long ans = 1;
        int MOD = 1_000_000_007;

        for (int i = 1; i <= n; ++i) {
            // Ways to arrange all pickups, 1*2*3*4*5*...*n
            ans = ans * i;
            // Ways to arrange all deliveries, 1*3*5*...*(2n-1)
            ans = ans * (2 * i - 1);
            ans %= MOD;
        }
        
        return (int)ans;
    }
}


// Probability (Math)
class Solution {
    public int countOrders(int n) {
        long ans = 1;
        int MOD = 1_000_000_007;
        
        for (int i = 1; i <= 2 * n; ++i) {
            ans = ans * i;
            
            // We only need to divide the result by 2 n-times.
            // To prevent decimal results we divide after multiplying an even number.
            if (i % 2 == 0) {
                ans = ans / 2;
            }
            ans %= MOD;
        }
        return (int)ans;
    }
}
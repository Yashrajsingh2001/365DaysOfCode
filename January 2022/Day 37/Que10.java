// Que link: https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/
// 2144. Minimum Cost of Buying Candies With Discount


// Method 1:
class Solution {
    public int minimumCost(int[] A) {
        Arrays.sort(A);
        int res = 0, n = A.length;
        for (int i = 0; i < n; ++i)
            if (i % 3 != n % 3)
                res += A[i];
        return res;
    }
}



// Method 2:
class Solution {
    public int minimumCost(int[] cost) {
        int minCost = 0, index = cost.length -1;
        Arrays.sort(cost);
        // add items in pairs of 2, the 3rd one getting it for free.
        while (index > 1) {
            minCost += cost[index] + cost[index -1];
            index -= 3;
        }
        // add the remaining 1, 2 items, if any.
        while(index >= 0) {
            minCost += cost[index--];
        }
        return minCost;
    }
}
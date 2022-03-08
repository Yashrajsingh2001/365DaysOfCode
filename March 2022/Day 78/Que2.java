// Que link: https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
// 1217. Minimum Cost to Move Chips to The Same Position


class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd=0, even=0;
        for(int i : position){
            if(i%2==0) even++;
            else odd++;
        }
        return Math.min(even, odd);
    }
}
// Que link: https://leetcode.com/problems/maximize-distance-to-closest-person/
// 112. Path Sum


class Solution {
    public int maxDistToClosest(int[] seats) {
        int res = 0, n = seats.length, last = -1;
        for (int i = 0; i < n; i++) {
            if (seats[i] == 1) {
                res = last < 0 ? i : Math.max(res, (i - last) / 2);
                last = i;
            }
        }
        res = Math.max(res, n - last - 1);
        return res;
        // The final result = max(distance at the beginning, distance in the middle / 2, distance at the end).
    }
}
// Que link: https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/
// 1827. Minimum Operations to Make the Array Increasing


class Solution {
    public int minOperations(int[] nums) {
        int cnt = 0, prev = 0;
        for (int cur : nums) {
            if (cur <= prev) {
                cnt += ++prev - cur;
            }else {
                prev = cur;
            }
        }
        return cnt;
    }
}
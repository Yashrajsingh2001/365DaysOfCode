// Que link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
// 1752. Check if Array Is Sorted and Rotated


class Solution {
    public boolean check(int[] nums) {
        int cnt = 0, n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] > nums[(i + 1) % n]) cnt++;
            if (cnt > 1) return false;
        }
        return true;
    }
}
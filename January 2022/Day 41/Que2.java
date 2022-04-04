// Que link: https://leetcode.com/problems/move-zeroes/
// 283. Move Zeroes


class Solution {
    public void moveZeroes(int[] nums) {
        int len=nums.length, j = 0;

        for (int i = 0; i < len; i++)
            if (nums[i] != 0)
                nums[j++] = nums[i];

        for (; j < len; j++)
            nums[j] = 0;
    }
}
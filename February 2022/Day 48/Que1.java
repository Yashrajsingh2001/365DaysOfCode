// Que link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
// 80. Remove Duplicates from Sorted Array II


class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i-2])
                nums[i++] = n;
        return i;
    }
}
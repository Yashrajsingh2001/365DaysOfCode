// Que link: https://leetcode.com/problems/next-permutation/
// 31. Next Permutation


class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null || nums.length<=1) return;
        int i = nums.length-2; // second last element
        while(i>=0 && nums[i]>=nums[i+1]) i--;
        if(i>=0){
            int j = nums.length-1;
            while(nums[j]<=nums[i]) j--;
            swap(nums, i, j);
        }
        reverse(nums, i+1, nums.length-1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int i, int j) {
        while(i<j)
            swap(nums, i++, j--);
    }
}

// Explanation with diagram: https://leetcode.com/problems/next-permutation/discuss/13994/Readable-code-without-confusing-ij-and-with-explanation
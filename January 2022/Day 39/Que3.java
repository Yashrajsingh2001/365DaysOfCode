// Que link: https://leetcode.com/problems/maximum-product-of-three-numbers/
// 628. Maximum Product of Three Numbers


// Method 1:
class Solution {
    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } 
            else if (n > max2) {
                max3 = max2;
                max2 = n;
            } 
            else if (n > max3) {
                max3 = n;
            }

            // Doing this because product of two negative number can also give a large number.
            if (n < min1) {
                min2 = min1;
                min1 = n;
            } 
            else if (n < min2) {
                min2 = n;
            }
        }
        return Math.max(max1*max2*max3, max1*min1*min2);
    }
}


// Method 2: Slow
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3], nums[0] * nums[1] * nums[n - 1]);
    }
}
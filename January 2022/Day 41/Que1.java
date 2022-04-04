// Que link: https://leetcode.com/problems/rotate-array/submissions/
// 189. Rotate Array


class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);  // reverse the whole array
        reverse(nums, 0, k-1);  // reverse the first part
        reverse(nums, k, nums.length-1);  // reverse the second part
    }

    public void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int tmp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = tmp;
        }
    }
}



/*
//*! This gives TLE error on LeetCode:
class Que1 {
    static public void rotate(int[] nums, int k) {
        int len = nums.length, rotate = k%len;
        // roatateByOne(nums, len);
        for(int j=0; j<rotate; j++){
            roatateByOne(nums, len);
        }
    }

    static public void roatateByOne(int[] nums, int len) {
        for(int i=0; i<len-1; i++){
            int temp = nums[len-1];
            nums[len-1] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7}, k = 3;
        rotate(nums, k);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + ", ");
        }
    }
}
*/
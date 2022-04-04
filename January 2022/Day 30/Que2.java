// Que link: https://leetcode.com/problems/xor-operation-in-an-array/
// 1486. XOR Operation in an Array



// Method 1:
class Solution {
    public int xorOperation(int n, int start) {
        int xor = start;
        for (int i=1; i<n; i++){
            xor = xor ^ (start + 2 * i);
            }
        return xor;
    }
}



// Method 2:
class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = start + 2 * i;
        }
        int xor=0;
        for(int j : nums){
            xor ^= j;
        }
        return xor;
    }
}
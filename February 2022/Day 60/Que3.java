// Que link: https://leetcode.com/problems/range-sum-query-immutable/
// 303. Range Sum Query - Immutable


class NumArray { 
    
    int[] preSum;
    public NumArray(int[] nums) {
        preSum = nums; // pass by pointer!
        for (int i = 1; i < preSum.length; ++i)
            preSum[i] += preSum[i-1]; 
    }
    
    public int sumRange(int left, int right) {
        if (left == 0) return preSum[right];
        return preSum[right] - preSum[left-1];
    }
}
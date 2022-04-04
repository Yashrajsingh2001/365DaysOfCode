// Que link: https://leetcode.com/problems/monotonic-array/
// 896. Monotonic Array


class Solution {
    public boolean isMonotonic(int[] A) {
        boolean inc = true, dec = true;
        for (int i = 1; i < A.length; ++i) {
            inc &= A[i - 1] <= A[i];
            dec &= A[i - 1] >= A[i];
            if(!(inc || dec)) return false; // check even before loop end to avoide traversing whole loop if we knew earlier it will be false
        }
        return inc || dec;
    }
}
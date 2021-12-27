// Que LINK: https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/

// Method 1:
class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int left = 0, right = n - 1, start = 1;
        while (left < right) {
            res[left++] = start;
            res[right--] = -start;
            start++;
        }
        return res;
    }
}


// Method 2:
class Solution {
    public int[] sumZero(int n) {
        int[] A = new int[n];
        for (int i = 0; i < n; ++i)
            A[i] = i * 2 - n + 1;
        return A;
    }
}
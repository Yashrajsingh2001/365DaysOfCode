// Que link: https://leetcode.com/problems/relative-sort-array/
// 1122. Relative Sort Array

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int i = 0;
        int[] cnt = new int[1001];
        for(int n : arr1)  // Count each number in arr1.
            cnt[n]++;
        for(int n : arr2) // Sort the common numbers in both arrays by the order of arr2.
            while(cnt[n]-- > 0)
                arr1[i++] = n;
        // cnt.length = 1001
        for(int n = 0; n < 1001; n++) // Sort the numbers only in arr1 
            while(cnt[n]-- > 0)
                arr1[i++] = n;
        return arr1;
    }
}
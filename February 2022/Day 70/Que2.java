// Que link: https://leetcode.com/problems/convert-1d-array-into-2d-array/
// 2022. Convert 1D Array Into 2D Array


class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int len = original.length; 
        if(len != m*n) 
            return new int[0][0];
        int[][] ans = new int[m][n];
        for(int i=0; i<len; i++)
            ans[i/n][i%n] = original[i];
        return ans;
    }
}
// Que LINK: https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        boolean[] oddRows = new boolean[n], oddCols = new boolean[m];
        int cntRow = 0, cntCol = 0;
        for (int[] idx : indices) {
            oddRows[idx[0]] ^= true;
            oddCols[idx[1]] ^= true;
            cntRow += oddRows[idx[0]] ? 1 : -1;
            cntCol += oddCols[idx[1]] ? 1 : -1;
        }
        return (m - cntCol) * cntRow + (n - cntRow) * cntCol;
    }
}
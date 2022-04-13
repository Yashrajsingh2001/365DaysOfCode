// Que link: https://leetcode.com/problems/spiral-matrix-ii/
// 59. Spiral Matrix II


class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        if(n==0) return matrix;
        
        int rowStart=0, rowEnd=n-1, colStart=0, colEnd=n-1, num=1;
        while(num <= n*n){ // while (rowStart <= rowEnd && colStart <= colEnd)
            for(int i=colStart; i<=colEnd; i++){
                matrix[rowStart][i] = num++;
            }
            rowStart++;
            
            for(int i=rowStart; i<=rowEnd; i++){
                matrix[i][colEnd] = num++;
            }
            colEnd--;
            
            for(int i=colEnd; i>=colStart; i--){
                matrix[rowEnd][i] = num++;
            }
            rowEnd--;
            
            for(int i=rowEnd; i>=rowStart; i--){
                matrix[i][colStart] = num++;
            }
            colStart++;
        }
        return matrix;
    }
}
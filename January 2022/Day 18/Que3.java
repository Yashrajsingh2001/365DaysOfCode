// Que link: https://leetcode.com/problems/search-a-2d-matrix/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length, start = 0, end = row * col - 1;
        
        if (row == 0 || col == 0) 
            return false;

        while(start <= end){
            int mid = (start + end) / 2;
            int mid_value = matrix[mid/col][mid%col];
            
            if( mid_value == target){
                return true;
            }
            else if(mid_value < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }
}
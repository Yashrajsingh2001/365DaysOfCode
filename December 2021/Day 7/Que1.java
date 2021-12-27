// Que LINK: https://leetcode.com/problems/spiral-matrix/
// Took some help from Discussion forum: https://leetcode.com/problems/spiral-matrix/discuss/?currentPage=1&orderBy=most_votes&query=

// Method 1:
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new LinkedList<>(); 
        if (matrix == null || matrix.length == 0) return res;
        int n = matrix.length, m = matrix[0].length;
        int up = 0,  down = n - 1;
        int left = 0, right = m - 1;
        while (res.size() < n * m) {
            for (int j = left; j <= right && res.size() < n * m; j++)
                res.add(matrix[up][j]);
            
            for (int i = up + 1; i <= down - 1 && res.size() < n * m; i++)
                res.add(matrix[i][right]);
                     
            for (int j = right; j >= left && res.size() < n * m; j--)
                res.add(matrix[down][j]);
                        
            for (int i = down - 1; i >= up + 1 && res.size() < n * m; i--) 
                res.add(matrix[i][left]);
                
            left++; right--; up++; down--; 
        }
        return res;
    }
}


// Method 2:
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new LinkedList<Integer>();
        if(matrix == null || matrix.length == 0) return result;
        
        int startRow = 0, endRow = matrix.length-1;
        int startCol = 0, endCol = matrix[0].length - 1;
        int dir = 0;
        
        while(startRow <= endRow && startCol <= endCol) {
            switch(dir) {
                case 0: //RIGHT
                    for(int col = startCol; col <= endCol; col++)
                        result.add(matrix[startRow][col]);
                    startRow++;
                    break;
                case 1: //DOWN
                    for(int row = startRow; row <=endRow; row++) 
                        result.add(matrix[row][endCol])    ;
                    endCol--;
                    break;
                case 2://LEFT
                    for(int col = endCol; col >= startCol; col --) 
                        result.add(matrix[endRow][col]);
                    endRow--;
                    break;
                case 3://UP
                    for(int row = endRow; row >= startRow; row--)
                        result.add(matrix[row][startCol]);
                    startCol++;  
                    break;
            }                                   
            dir = (dir+1)%4;                                                            
        }
        return result;
    }
}
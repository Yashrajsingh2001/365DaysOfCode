// Que link: https://leetcode.com/problems/valid-sudoku/submissions/

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet seen = new HashSet();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if(!seen.add("row"+i+board[i][j]) || !seen.add("col"+j+board[i][j]) || !seen.add("box"+ (i/3)*3 + j/3 +board[i][j])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}




// Help taken from: https://leetcode.com/problems/valid-sudoku/discuss/15472/Short%2BSimple-Java-using-Strings
class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set seen = new HashSet();
        for (int i=0; i<9; ++i) {
            for (int j=0; j<9; ++j) {
                char number = board[i][j];
                if (number != '.')
                    if (!seen.add(number + " in row " + i) ||
                        !seen.add(number + " in column " + j) ||
                        !seen.add(number + " in block " + i/3 + "-" + j/3))
                        return false;
            }
        }
        return true;
    }
}

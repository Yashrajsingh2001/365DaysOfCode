// Que link: https://leetcode.com/problems/game-of-life/
// 289. Game of Life


// In this method we have used extra space
class Solution {
    public void gameOfLife(int[][] board) {
        int[][] output = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int neighbour = count(i, j, board);
                // Rule 1
                if (board[i][j] == 1 && neighbour < 2)
                    output[i][j] = 0;
                // Rule 2
                else if (board[i][j] == 1 && (neighbour == 2 || neighbour == 3))
                    output[i][j] = 1;
                // Rule 3
                else if (board[i][j] == 1 && neighbour > 3)
                    output[i][j] = 0;
                // Rule 4
                else if (board[i][j] == 0 && neighbour == 3)
                    output[i][j] = 1;
            }

        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = output[i][j];
            }
        }

    }

    public int count(int i, int j, int[][] board) {
        int count = 0;
        // To find value in 8 Direction left,right,top,down,top left ,top right,bottom
        // left, bottom right

        int[][] direction = { { 0, -1 }, { 0, 1 }, { 1, 0 }, { 1, -1 }, { 1, 1 }, { -1, -1 }, { -1, 1 }, { -1, 0 } };
        for (int[] dir : direction) {
            int x = i + dir[0];
            int y = j + dir[1];
            if (x >= 0 && y >= 0 && x < board.length && y < board[0].length) {
                count += board[x][y];
            }
        }
        return count;
    }
}
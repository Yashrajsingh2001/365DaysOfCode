// Que LINK: https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; ++i) { // rotate 0, 1, 2, 3 times.
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            rotate(mat);
        }
        return false;
    }
    private void rotate(int[][] mat) {
        for (int i = 0, j = mat.length - 1; i < j; ++i, --j) { // reverse rows order.
            int[] tmp = mat[i];
            mat[i] = mat[j];
            mat[j] = tmp;
        } 
        for (int r = 0, R = mat.length; r < R; ++r) { // transpose.
            for (int c = r + 1; c < R; ++c) {
                int tmp = mat[r][c];
                mat[r][c] = mat[c][r];
                mat[c][r] = tmp;
            }
        }
    }
}
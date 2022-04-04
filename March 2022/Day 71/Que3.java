// Que link: https://leetcode.com/problems/shift-2d-grid/
// 1260. Shift 2D Grid


class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length; 
        int start = m * n - k % (m * n);
        LinkedList<List<Integer>> ans = new LinkedList<>();
        for (int i = start; i < m * n + start; ++i) {
            int j = i % (m * n);
            if ((i - start) % n == 0)
                ans.add(new ArrayList<>());
            ans.peekLast().add(grid[j/n][j%n]);
        }
        return ans;
    }
}
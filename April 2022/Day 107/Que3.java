// Que link: https://leetcode.com/problems/path-with-minimum-effort/
// 1631. Path With Minimum Effort

//! Different methods: https://leetcode.com/problems/path-with-minimum-effort/discuss/909002/JavaPython-3-3-codes%3A-Binary-Search-Bellman-Ford-and-Dijkstra-w-brief-explanation-and-analysis.

class Solution {
    private int[] d = {0, 1, 0, -1, 0};
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        int[][] efforts = new int[m][n];
        for (int[] e : efforts) {
            Arrays.fill(e, Integer.MAX_VALUE);
        }
        efforts[0][0] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[3]);
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int effort = cur[0], x = cur[1], y = cur[2];
            if (x == m - 1 && y == n - 1) {
                return effort;
            }
            for (int k = 0; k < 4; ++k) {
                int r = x + d[k], c = y + d[k + 1];
                if (0 <= r && r < m && 0 <= c && c < n) {
                    int nextEffort = Math.max(effort, Math.abs(heights[r][c] - heights[x][y]));
                    if (efforts[r][c] > nextEffort) {
                        efforts[r][c] = nextEffort;
                        pq.offer(new int[]{nextEffort, r, c});
                    }
                }
            }
        }
        return -1;
    }
}
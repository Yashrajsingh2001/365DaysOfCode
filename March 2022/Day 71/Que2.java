// Que link: https://leetcode.com/problems/matrix-cells-in-distance-order/
// 1030. Matrix Cells in Distance Order


// Method 1:
class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        boolean[][] visited = new boolean[R][C];
        int[][] result = new int[R * C][2];
        int i = 0;
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.offer(new int[] { r0, c0 });
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int r = cell[0];
            int c = cell[1];

            if (r < 0 || r >= R || c < 0 || c >= C) continue;
            if (visited[r][c]) continue;

            result[i] = cell;
            i++;
            visited[r][c] = true;

            queue.offer(new int[] { r, c - 1 });
            queue.offer(new int[] { r, c + 1 });
            queue.offer(new int[] { r - 1, c });
            queue.offer(new int[] { r + 1, c });
        }
        return result;
    }
}


// Method 2:
class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int[][] res = new int[R * C][2];
        int index = 0;
        Set<String> set = new HashSet<>();
        set.add(r0 + "/" + c0);
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{r0, c0});
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            res[index++] = cur;
            for (int[] dir : dirs) {
                int rr = cur[0] + dir[0];
                int cc = cur[1] + dir[1];
                if (rr < 0 || rr >= R || cc < 0 || cc >= C) continue;
                if (set.add(rr + "/" + cc)) q.offer(new int[]{rr, cc});
            }
        }
        return res;
    }
}
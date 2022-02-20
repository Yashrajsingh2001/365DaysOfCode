// Que link: https://leetcode.com/problems/remove-covered-intervals/
// 1288. Remove Covered Intervals


// Solution 1, sort
class Solution {
    public int removeCoveredIntervals(int[][] A) {
        int res = 0, left = -1, right = -1;
        Arrays.sort(A, (a, b) -> a[0] - b[0]);
        for (int[] v : A) {
            if (v[0] > left && v[1] > right) {
                left = v[0];
                ++res;
            }
            right = Math.max(right, v[1]);
        }
        return res;
    }
}

/*
//* Same way
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int res = 0;
        int[] cur = {-1,-1};
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        for (int[] in : intervals) {
            if (in[0] > cur[0] && in[1] > cur[1]) {
                cur[0] = in[0];
                ++res;
            }
            cur[1] = Math.max(cur[1], in[1]);
        }
        return res;
    }
}
*/





// Solution 2, sort left ascending and right decending
/*In this solution, we sort on left first.
When left are same, we sort right in decending order.

For example: [[1,5],[1,4],[1,3],[1,2]]*/
class Solution {
    public int removeCoveredIntervals(int[][] A) {
        int res = 0, right = 0;
        Arrays.sort(A, (a, b) -> a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]);
        for (int[] v : A) {
            if (v[1] > right) {
                ++res;
                right = v[1];
            }
        }
        return res;
    }
}
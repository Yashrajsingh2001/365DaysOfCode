// Que link: https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
// 452. Minimum Number of Arrows to Burst Balloons

//Method 1: Easy to understand
class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length <= 1) return points.length;
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0])); // sort points in accending order with respect to the first digit
        // before: [[10,16],[2,8],[1,6],[7,12]]
        // after: [[1,6],[2,8],[7,12],[10,16]]


        int shots = 0, lastEnd = Integer.MIN_VALUE;
        for (int[] point : points) {
            if (point[0] > lastEnd) {
                shots++;
                lastEnd = point[1];
            } else {
                lastEnd = Math.min(lastEnd, point[1]);
            }
        }
        return shots;
    }
}




//Method 2:
class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) return 0;
        Arrays.sort(points, (int[] p1, int[] p2)->{
		    // Don't use p1[1 ] - p2[1]. It may overflow 
            return p1[1] < p2[1] ? -1 : 1; 
        });

        int end = points[0][1];
		// the reason res = 1 is that we need an arrow to destroy the last group. 
        int res = 1;
        for (int[] point: points){
            if (point[0] <= end) continue;
            res++;
            end = point[1];
        }
        return res;
    }
}
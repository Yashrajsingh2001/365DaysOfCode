// Que link: https://leetcode.com/problems/most-visited-sector-in-a-circular-track/
// 1560. Most Visited Sector in a Circular Track

// We have to return points which are visited most number of times.
class Solution {
    public List<Integer> mostVisited(int n, int[] A) {
        List<Integer> res = new ArrayList<>();
        // If start <= end, return the range [start, end]
        for (int i = A[0]; i <= A[A.length - 1]; ++i) // range [start, end]
            res.add(i);
        if (res.size() > 0) return res;
        // If end < start, return the range [1, end] + range [start, n]
        for (int i = 1; i <= A[A.length - 1]; ++i) // range [1, end]
            res.add(i);
        for (int i = A[0]; i <= n; ++i) // range [start, n]
            res.add(i);
        return res;
    }
}

// If start <= end, return the range [start, end].
// If end < start, return the range [1, end] + range [start, n].
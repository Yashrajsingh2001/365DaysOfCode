// Que link: https://leetcode.com/problems/evaluate-division/
// 399. Evaluate Division

class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        // build big double direction map
        HashMap<String, HashMap<String, Double>> map = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            String start = equations.get(i).get(0);
            String end = equations.get(i).get(1);
            double ratio = values[i];
            map.putIfAbsent(start, new HashMap<>());
            map.get(start).put(end, ratio);
            map.putIfAbsent(end, new HashMap<>());
            map.get(end).put(start, 1.0 / ratio);
        }
        // deal with every query
        double[] res = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            String start = queries.get(i).get(0);
            String end = queries.get(i).get(1);
            // first check if start or end exist in big map or not
            if (!map.containsKey(start) || !map.containsKey(end)) {
                res[i] = -1.0;
                continue;
            }
            // enter dfs loop, for each query, there is a new visited set
            res[i] = helper(map, start, end, new HashSet<>());
        }
        return res;
    }
    public double helper(HashMap<String, HashMap<String, Double>> map, String start, String end, HashSet<String> visited) {
        // actually no need to check quitting condition, because if one can enter this dfs, one must iterate all children
        // if (!map.containsKey(start)) return -1;
        if (map.get(start).containsKey(end)) {
            return map.get(start).get(end);
        }
        // mark visited
        visited.add(start);
        for (Map.Entry<String, Double> entry : map.get(start).entrySet()) {
            if (visited.contains(entry.getKey())) continue;
            double res = helper(map, entry.getKey(), end, visited);
            if (res == -1.0) continue;
            return res * entry.getValue();
        }
        return -1.0;
    }
}
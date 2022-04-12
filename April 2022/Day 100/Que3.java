// Que link: https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1/
// BFS of graph

import java.util.*;

class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[] = new boolean[v];
        ArrayList<Integer> a = new ArrayList<>();
        bfs(0, a, visited, adj);
        return a;
    }

    public void bfs(int s, ArrayList<Integer> a, boolean visited[], ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);
        while (!q.isEmpty()) {
            int u = q.poll();
            a.add(u);
            for (int v : adj.get(u)) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
    }
}
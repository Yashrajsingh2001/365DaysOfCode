// Que link: https://practice.geeksforgeeks.org/problems/print-adjacency-list-1587115620/1#
// Print adjacency list


import java.util.ArrayList;

class Solution {
    // Function to return the adjacency list for each vertex.
    public ArrayList<ArrayList<Integer>> printGraph(
        int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList();
        int index = 0;
        for(ArrayList<Integer> i : adj) {
            i.add(0, index++);
            ans.add(i);
        }
        return ans;
    }
}
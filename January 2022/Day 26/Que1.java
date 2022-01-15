// Que link: https://leetcode.com/problems/jump-game-iv/
// 1345. Jump Game IV


class Solution{
    public int minJumps(int[] arr){ // arr = [100,-23,-23,404,100,23,23,23,3,404]
        int n = arr.length;
        Map<Integer, List<Integer>> valIndex = new HashMap();
        for (int i = 0; i < n; i++)
            valIndex.computeIfAbsent(arr[i], l -> new ArrayList<>()).add(i); 

        Queue<Integer> q = new LinkedList();
        Set<Integer> visited = new HashSet();

        q.add(0);
        visited.add(0);
        int steps = 0;

        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                int i = q.poll();
                if(n-1 == i)
                    return steps;
                List<Integer> adjList = valIndex.get(arr[i]);
                adjList.add(i-1);
                adjList.add(i+1);
                for (int j : adjList) {
                    if(j>=0 && j<n && !visited.contains(j)){
                        q.add(j);
                        visited.add(j);
                    }
                }
                adjList.clear(); // stop repeated calculations
            }
            steps++;
        }
        return -1;
    }
}
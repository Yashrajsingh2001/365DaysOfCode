// Que LINK: https://leetcode.com/problems/course-schedule-ii/

class Que1 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        int[] inDeg = new int[numCourses];
        List<Integer>[] chl = new ArrayList[numCourses];
        
        for (int i = 0; i < numCourses; i++) {
            chl[i] = new ArrayList<Integer>();
        }
        
        int pre;
        int cour;
        
        for (int[] pair : prerequisites) {
            pre = pair[1];
            cour = pair[0];
            
            chl[pre].add(cour);
            inDeg[cour]++;
        }
        
        int[] res = new int[numCourses];
        int k = 0;
        
        for (int i = 0; i < numCourses; i++) {
            if (inDeg[i] == 0) {
                res[k++] = i;
            }
        }
        
        if (k == 0) {
            return new int[0];
        }
        
        int j = 0;
        List<Integer> tmp;
        
        while (k < numCourses) {
            tmp = chl[res[j++]];
            
            for (int id : tmp) {
                if (--inDeg[id] == 0) {
                    res[k++] = id;
                }
            }
            
            if (j == k) {
                return new int[0];
            }
        }
        return res;
    }
}
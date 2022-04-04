// Que LINK: https://leetcode.com/problems/maximum-population-year/

class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] year = new int[2051];
		// O(n) -> n is log.length
        for(int[] log : logs){
            year[log[0]] += 1;
            year[log[1]] -= 1;
        }
        
        int maxNum = year[1950], maxYear = 1950;
		// O(100) -> 2050 - 1950 = 100
        for(int i = 1951; i < year.length; i++){
            year[i] += year[i - 1];  // Generating Prefix Sum
            
            if(year[i] > maxNum){
                maxNum = year[i];
                maxYear = i;
            }
        }
        return maxYear;
    }
}


// class Solution {
//     public int maximumPopulation(int[][] logs) {
//         int pop[] = new int[2051], res = 0;
//         for (var l : logs) {
//             ++pop[l[0]];
//             --pop[l[1]];
//         }
//         for (int i = 1950; i < 2050; ++i) {
//             pop[i] += pop[i - 1];
//             res = pop[i] > pop[res] ? i : res;
//         }
//         return res;
//     }
// }
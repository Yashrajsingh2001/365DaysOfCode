// Que link: https://leetcode.com/problems/gas-station/
// 134. Gas Station


// Method 1: Easy to understand
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumGas = 0, sumCost = 0, start = 0, tank = 0;
        for (int i = 0; i < gas.length; i++) {
            sumGas += gas[i];
            sumCost += cost[i];
            tank += gas[i] - cost[i];
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }
        if (sumGas < sumCost) {
            return -1;
        } else {
            return start;
        }
    }
}




// Method 2:
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank=0, total=0, start=0;
        for(int i=0; i<gas.length; i++) {
            int current = gas[i]-cost[i];
            tank += current;
            total += current;
            if(tank < 0) {
                start = i+1;
                tank = 0;
            }
        } 
        return total < 0 ? -1 : start;
    }
}
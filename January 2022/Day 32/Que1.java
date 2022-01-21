// Que link: https://leetcode.com/problems/gas-station/
// 134. Gas Station



class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        //determine if we have a solution
        int total = 0;
        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
        }
        if (total < 0) {
            return -1;
        }
   
        // find out where to start
        int tank = 0;
        int start = 0;
        for (int i = 0; i < gas.length;i++) {
            tank += gas[i] - cost[i];
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }
        return start;
    }
}




class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumGas = 0;
        int sumCost = 0;
        int start = 0;
        int tank = 0;
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
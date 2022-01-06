// Que link: https://leetcode.com/problems/car-pooling/

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int lengthOfTrip[] = new int[1001];
        for (int trip[] : trips){
            lengthOfTrip[trip[1]] += trip[0]; 
            lengthOfTrip[trip[2]] -= trip[0]; 
        }

        int carLoad = 0;
        for (int i = 0; i < 1001; i++){
            carLoad += lengthOfTrip[i];
            if(carLoad > capacity) return false;
        }

        return true;
    }
}
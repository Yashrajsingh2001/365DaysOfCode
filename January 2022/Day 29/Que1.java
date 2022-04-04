// Que link: https://leetcode.com/problems/can-place-flowers/
// 605. Can Place Flowers



class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0; i < flowerbed.length && count < n; i++) {
            if(flowerbed[i] == 0) {
	            //get next and prev flower bed slot values. If i lies at the ends the next and prev are considered as 0. 
               int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1]; 
               int prev = (i == 0) ? 0 : flowerbed[i - 1];
               if(next == 0 && prev == 0) {
                   flowerbed[i] = 1;
                   count++;
               }
            }
        }
        
        return count == n;
    }
}




// A little tricky to understand
public boolean canPlaceFlowers(int[] flowerbed, int n) {
    int count = 1;
    int result = 0;
    for(int i=0; i<flowerbed.length; i++) {
        if(flowerbed[i] == 0) {
            count++;
        }else {
            result += (count-1)/2; // 1 will be added in result only if count=3, means 3 continuous 0. 2 will be added for count=5, 3 for count=7 and so on.
            count = 0;
        }
    }
    if(count != 0) result += count/2;
    return result>=n;
}
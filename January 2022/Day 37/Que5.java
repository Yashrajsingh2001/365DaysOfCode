import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Que link: https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/
// 2037. Minimum Number of Moves to Seat Everyone

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int n=seats.length, ans=0;
        for(int i=0; i<n; i++){
            ans += Math.abs(seats[i]-students[i]);
        }
        return ans;
    }
}
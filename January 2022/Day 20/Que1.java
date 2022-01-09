//! Que link: https://leetcode.com/problems/robot-bounded-in-circle/


/**
Starting at the origin and face north (0,1), after one sequence of instructions, 
1) if chopper return to the origin, he is obvious in an circle.
2) if chopper finishes with face not towards north, it will get back to the initial status in another one or three sequences.

//* Explanation:
(x,y) is the location of chopper.
d[i] is the direction he is facing.
i = (i + 1) % 4 will turn right
i = (i + 3) % 4 will turn left
Check the final status after instructions.   

//? Complexity:
Time O(N)
Space O(1)  
*/


class Solution {
    public boolean isRobotBounded(String instructions) {
        int x = 0, y = 0, i = 0, d[][] = {{0, 1}, {1, 0}, {0, -1}, { -1, 0}};
        for (int j = 0; j < instructions.length(); ++j)
            if (instructions.charAt(j) == 'R')
                i = (i + 1) % 4;
            else if (instructions.charAt(j) == 'L')
                i = (i + 3) % 4;
            else {
                x += d[i][0]; y += d[i][1];
            }
        return x == 0 && y == 0 || i > 0; // i>0 means ans is True coz it will remain in circle only
    }
}


// Just use above code for LeetCode submission
class Que1 extends Solution{
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.isRobotBounded("GGLLGG"));
    }
}
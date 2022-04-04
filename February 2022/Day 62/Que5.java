// Que link: https://leetcode.com/problems/reach-a-number/
// 754. Reach a Number


// Method 1:
class Solution {
    public int reachNumber(int target) {
        int moves=0, sum=0;
        target=Math.abs(target);
        while(sum<target || (sum-target)%2 != 0) {
            moves++;
            sum+=moves;
        }
        return moves;
    }
}


// Method 2:
class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int moves = 0, sum = 0;
        while (sum < target) {
            moves++;
            sum += moves;
        }

        // return (sum-target)%2==0 ? step : step%2==0 ? step+1 : step+2; //* We can do this instead of below part.
        while ((sum - target) % 2 != 0) {
            moves++;
            sum += moves;
        }
        return moves;
    }
}
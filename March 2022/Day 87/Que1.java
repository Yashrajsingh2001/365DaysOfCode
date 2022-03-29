// Que link: https://leetcode.com/problems/happy-number/
// 202. Happy Number


class Solution {
    public boolean isHappy(int n){
        int slow=n, fast=next(n);
        
        while (fast != slow){
            slow = next(slow);
            fast = next(next(fast));
        }
        return slow==1;
    }
    
    private int next(int n){
        int res=0;
        while (n>0){
            int t = n % 10;
            res += t*t;
            n/=10;
        }
        return res;
    }
}
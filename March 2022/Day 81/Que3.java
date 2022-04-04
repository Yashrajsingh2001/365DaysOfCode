// Que link: https://leetcode.com/problems/egg-drop-with-2-eggs-and-n-floors/
// 1884. Egg Drop With 2 Eggs and N Floors


// Method 1: Binary Search solution:
class Solution {
    public int twoEggDrop(int n) {
        int L = 1, R = n;
        int ans = n;
        while(L <= R){
            int mid = L + (R - L) / 2;
            if(mid * (mid + 1) >= 2 * n){
                ans = mid;
                R = mid - 1;
            }else{
                L = mid + 1;
            }
        }
       return ans;
    }
}


// Method 2:
class Solution {
    public int twoEggDrop(int n) {
        int cnt = 1;
        int pre = 1;
        while(cnt < n) {
            pre++;
            cnt += pre;
        }
        return pre;
    }
}
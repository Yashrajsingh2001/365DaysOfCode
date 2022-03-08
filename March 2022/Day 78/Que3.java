// Que link: https://leetcode.com/problems/split-a-string-in-balanced-strings/
// 1221. Split a String in Balanced Strings


class Solution {
    public int balancedStringSplit(String s) {
        int L=0, R=0, ans=0;
        for(char c : s.toCharArray()){
            if(c=='R') R++;
            else L++;
            
            if(L==R) ans++;
        }
        return ans;
    }
}
// Que LINK: https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/

class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int c[]  = new int[60], res = 0;
        for (int t : time) {
            res += c[(600 - t) % 60];
            c[t % 60] += 1;
        }
        return res;
    }
}


/*
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int i=0, j=0, t=time.length, ans=0;
        while(i<t){
            j=i+1;
            while(j<t){
                if((time[i] + time[j])%60==0){
                    ans++;
                    j++;
                }
                else{
                    j++;
                }
            }
            i++;
        }
        return ans;
    }
}
*/
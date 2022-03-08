// Que link: // https://leetcode.com/problems/di-string-match/
// 942. DI String Match


class Solution {
    public int[] diStringMatch(String s) {
        int len = s.length(), L=0, R = len;
        int[] arr = new int[R+1];
        for(int i=0; i<len; i++){
            if(s.charAt(i)=='I') arr[i]=L++;
            else arr[i]=R--;
        }
        arr[len]=L;
        return arr;
    }
}
// Que link: https://leetcode.com/problems/implement-strstr/
// 28. Implement strStr()

//! NOTE: Solutions are giving TLE when executed but running fine in incoginito mode.

class Soultion{
    public int strStr(String haystack, String needle) {
    for (int i = 0; ; i++) { // The length of haystack
      for (int j = 0; ; j++) { // The length of needle
        if (j == needle.length()) return i; // If at this point we have navigated through the entire length of needle, we have found a solution, haystack[i].
        if (i + j == haystack.length()) return -1; // This happens when we run out of elements in haystack, but there are still elements in needle. 
        if (needle.charAt(j) != haystack.charAt(i + j)) break; // We stop comparing after needle[j], so i will be incremented and cycle repeats itself. 
      }
    }
  }
}



class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        if(needle.length()==0)return 0;
        for(int i=0;i<=(n-m);i++){
            int j;
            for(j=0;j<m;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j))
                    break;
            }
            if(j==m) return i;
        }
        return -1;
    }
}
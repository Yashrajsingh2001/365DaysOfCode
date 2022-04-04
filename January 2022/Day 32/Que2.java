// Que link: https://leetcode.com/problems/longest-common-prefix/
// 14. Longest Common Prefix



class Solution {
    public String longestCommonPrefix(String[] strs) {
         if (strs.length == 0) return "";
         String pre = strs[0];
         for (int i = 1; i < strs.length; i++)
             while(strs[i].indexOf(pre) != 0) //or we can use .startsWith
                 pre = pre.substring(0,pre.length()-1);
         return pre;
     }
 }
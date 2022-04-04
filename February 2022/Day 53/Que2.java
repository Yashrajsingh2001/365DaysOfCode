// Que link: https://leetcode.com/problems/longest-palindromic-substring/
// 5. Longest Palindromic Substring


class Solution {
    public String longestPalindrome(String s) {
        String max = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = checkPal(s, i, i); // odd length
            String s2 = checkPal(s, i, i + 1); // even length
            if (s1.length() > max.length()) max = s1;
            if (s2.length() > max.length()) max = s2;
        }
        return max;
    }
    
    private String checkPal(String s, int i, int j) {
        for (; 0 <= i && j < s.length(); i--, j++) {
            if (s.charAt(i) != s.charAt(j)) break;
        }
        return s.substring(i + 1, j);
    }
}
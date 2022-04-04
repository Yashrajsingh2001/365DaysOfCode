// Que link: https://leetcode.com/problems/reverse-string/
// 344. Reverse String

class Solution {
    public void reverseString(char[] s) {
        rev(s, 0, s.length-1);
    }
    
    private static void rev(char[] s, int L, int R) {
        if (L >= R) return;
        
        char temp = s[L];
        s[L] = s[R];
        s[R] = temp;
        
        rev(s, ++L, --R);
    }
}
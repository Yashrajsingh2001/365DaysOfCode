// Que link: https://leetcode.com/problems/valid-palindrome/
// 125. Valid Palindrome


class Solution {
    public boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
        int L = 0, R = c.length - 1;
        while(L < R) {
            if (!Character.isLetterOrDigit(c[L])) L++;
            else if (!Character.isLetterOrDigit(c[R])) R--;
            else if (Character.toLowerCase(c[L++]) != Character.toLowerCase(c[R--])) 
                return false;
        }
        return true;
    }
}




/*
//*! Very very slow: don't do this
class Solution {
    public boolean isPalindrome(String s) {
        String res="";
        for(char c : s.toCharArray()){
            c = Character.toLowerCase(c);
            if(('a' <= c && c <= 'z') || (int)'0'<=(int)c && (int)c<=(int)'9'){
                res += c;
            }
        }
        
        int L=0, R=res.length()-1;
        while(L<R){
            if(res.charAt(L) != res.charAt(R)) return false;
            L++; R--;
        }
        return true;
    }
}

*/
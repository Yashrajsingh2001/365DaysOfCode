// Que link: https://leetcode.com/problems/longest-palindrome/
// 409. Longest Palindrome


class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[52];
        char[] ch = s.toCharArray();
        for(int i=0; i<ch.length; i++){
            if('a' <= ch[i] && ch[i] <= 'z')
                arr[ch[i]-'a']+=1;
            else arr[ch[i]-'A'+26]+=1;
        }
        
        int odd=0, ans=0;
        for(int i : arr){
            if(i%2==1) odd=1;
        
            ans += i-(i%2);
        }
        return ans + odd;
    }
}
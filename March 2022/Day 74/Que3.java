// Que link: https://leetcode.com/problems/reverse-vowels-of-a-string/
// 345. Reverse Vowels of a String


class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        int L = 0, R = s.length() - 1;
        char[] chArr = s.toCharArray();
        while(L < R){
            while(L < R && vowels.indexOf(chArr[L]) == -1){
                L++;
            }
            while(L < R && vowels.indexOf(chArr[R]) == -1){
                R--;
            }
            char temp = chArr[L];
            chArr[L] = chArr[R];
            chArr[R] = temp;
            L++;
            R--;
        }
        return new String(chArr);
    }
}
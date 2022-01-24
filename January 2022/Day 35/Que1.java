// Que link: https://leetcode.com/problems/detect-capital/
// 520. Detect Capital


class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() < 2) return true;
        // This will run if first 2 char are capital and will return false if any of the next char is small.
        if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))){
            for(int i = 2; i < word.length(); i++){
                if(Character.isLowerCase(word.charAt(i))) return false;
            }
        }
        // This will run when any of the first or second char is not capital and will return false if any of the char excluding word[0] is capital.
        else{
            for(int i = 1; i < word.length(); i++){
                if(Character.isUpperCase(word.charAt(i))) return false;
            }
        }
        // When all are capitalor all are small(excluding word[0])
        return true;
    }
}
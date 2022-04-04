// Que link: https://leetcode.com/problems/maximum-number-of-balloons/
// 1189. Maximum Number of Balloons


class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] chars = new int[26]; //count all letters
        for (char c : text.toCharArray()) {
            chars[c - 'a']++;
        }
        int min = chars[1]; // for b
        min = Math.min(min, chars[0]); // for a
        min = Math.min(min, chars[11] / 2); // for l /2 
        min = Math.min(min, chars[14] / 2); // for o/2
        min = Math.min(min, chars[13]); // for n
        return min;        
    }
}
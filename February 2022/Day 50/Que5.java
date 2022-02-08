// Que link: https://leetcode.com/problems/second-largest-digit-in-a-string/
// 1796. Second Largest Digit in a String


class Solution {
    public int secondHighest(String s) {
        int max = -1, secMax = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); 
            if (Character.isDigit(c)) {
                int curMax = c - '0';
                if (max < curMax) {
                    secMax = max;
                    max = curMax;
                }
                else if (secMax < curMax && curMax < max) {
                    secMax = curMax;
                }
            }
        }
        return secMax;
    }
}
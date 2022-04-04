// Que LINK: https://leetcode.com/problems/find-smallest-letter-greater-than-target/

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length, start = 0, end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] > target) end = mid;
            else start = mid + 1;
        }
        return letters[start % n];
    }
}
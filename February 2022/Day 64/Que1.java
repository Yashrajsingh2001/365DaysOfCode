// Que link: https://leetcode.com/problems/excel-sheet-column-number/
// 171. Excel Sheet Column Number


class Solution {
    public int titleToNumber(String s) {
        if (s == null) return -1;
        int sum = 0;
        for (char c : s.toUpperCase().toCharArray()) {
            sum *= 26;
            sum += c - 'A' + 1;
        }
        return sum;
    }
}
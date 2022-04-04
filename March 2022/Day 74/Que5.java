// Que link: https://leetcode.com/problems/longest-uncommon-subsequence-i/
// 521. Longest Uncommon Subsequence I


//! Worst Que 💀
class Solution {
    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}
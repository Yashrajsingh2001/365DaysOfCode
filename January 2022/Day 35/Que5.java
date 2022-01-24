// Que link: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
// 1662. Check If Two String Arrays are Equivalent


class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a="", b="";
        for(String i : word1) a += i;
        for(String j : word2) b += j;
        return a.equals(b);
    }
}
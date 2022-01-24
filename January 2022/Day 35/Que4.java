// Que link: https://leetcode.com/problems/shuffle-string/
// 1528. Shuffle String


class Solution {
    public String restoreString(String s, int[] indices) {
        char[] c = new char[indices.length];
        for(int i = 0; i < indices.length; i++)
            c[indices[i]] = s.charAt(i);
        return new String(c);
    }
}
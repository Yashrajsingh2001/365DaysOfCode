// Que link: https://leetcode.com/problems/implement-strstr/
// 28. Implement strStr()


class Solution {
    public int strStr(String haystack, String needle) {
        int nLen = needle.length(), hLen = haystack.length();
        if (nLen == 0) return 0;
        if (hLen == 0) return -1;

        for (int i = 0; i < hLen; i++) {
            // no enough places for needle after i
            if (i + nLen > hLen) break;

            int j;
            for (j = 0; j < nLen; j++) {
                if (haystack.charAt(i+j) != needle.charAt(j))
                    break;
            }
            if (j == nLen) return i;
        }
        return -1;
    }
}
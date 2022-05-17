// Que link: https://leetcode.com/problems/minimum-window-substring/
// 76. Minimum Window Substring


class Solution {
    public String minWindow(String s, String t) {
        int[] arr = new int[128];
        for (char c : t.toCharArray()) {
            arr[c]++;
        }
        int start = 0, end = 0, minStart = 0, minLen = Integer.MAX_VALUE, counter = t.length();
        while (end < s.length()) {
            final char c1 = s.charAt(end);
            if (arr[c1] > 0)
                counter--;
            arr[c1]--;
            end++;
            while (counter == 0) {
                if (minLen > end - start) {
                    minLen = end - start;
                    minStart = start;
                }
                final char c2 = s.charAt(start);
                arr[c2]++;
                if (arr[c2] > 0)
                    counter++;
                start++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
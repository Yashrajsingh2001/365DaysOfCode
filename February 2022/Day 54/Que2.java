// Que link: https://leetcode.com/problems/length-of-last-word/
// 58. Length of Last Word


// Method 1:
class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr[arr.length-1].length();
    }
}


// Method 2:
class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;		
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') length++;
            else if (length > 0) return length;
        }
        return length;
    }
}
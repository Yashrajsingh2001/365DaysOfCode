// Que link: https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
// 1249. Minimum Remove to Make Valid Parentheses


class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> st = new Stack();
        for (int i = 0; i < sb.length(); ++i) {
            if (sb.charAt(i) == '(')
                st.add(i + 1);
            if (sb.charAt(i) == ')') {
                if (!st.empty() && st.peek() >= 0)
                    st.pop();
                else
                    st.add(-(i + 1));
            }
        }
        while (!st.empty())
            sb.deleteCharAt(Math.abs(st.pop()) - 1);
        return sb.toString();
    }
}
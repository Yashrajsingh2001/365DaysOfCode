// Que link: https://leetcode.com/problems/generate-parentheses/
// 22. Generate Parentheses


class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> outArr = new LinkedList<>();
        backtrack(outArr, "", 0, 0, n);
        return outArr;
    }
    
    private void backtrack(List<String> outArr, String currStr, int open, int close, int max){
        if(currStr.length() == max*2){
            outArr.add(currStr);
            return;
        }
        
        if(open<max) backtrack(outArr, currStr+"(", open+1, close, max);
        if(close<open) backtrack(outArr, currStr+")", open, close+1, max);
    }
}
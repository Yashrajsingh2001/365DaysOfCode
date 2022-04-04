// Que link: https://leetcode.com/problems/simplify-path/
// 71. Simplify Path


class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack();
        for(String cur: path.split("/")){
            if(cur.equals("..")) {
                if(!stack.empty()) stack.pop();
            }
            else if(cur.length()>0 && !cur.equals(".")) stack.push(cur);
        }
        return "/"+String.join("/",stack);
    }
}
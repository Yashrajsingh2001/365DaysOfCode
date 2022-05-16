// Que link: https://leetcode.com/problems/basic-calculator-ii/
// 227. Basic Calculator II


class Solution {
    public int calculate(String s) {
        if (s == null || s.length() == 0) return 0;
        Stack<Integer> stack = new Stack<>();
        s += '+';
        char op = '+';
        int n=0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)){ 
                n = n * 10 + c - '0'; 
                continue;
            }
            if (c == ' ') continue;
            
            if (op == '+') stack.push(n);
            else if (op == '-') stack.push(-n);
            else if (op == '*') stack.push(stack.pop()*n);
            else if (op == '/') stack.push(stack.pop()/n);
            
            op = c;
            n = 0;
        }

        int total = 0;
        // while (!stack.isEmpty()) total += stack.pop();
        for(int i : stack) total += i;
        return total;
    }
}
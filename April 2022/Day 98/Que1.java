// Que link: https://leetcode.com/problems/baseball-game/
// 682. Baseball Game


class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        
        for(String i : ops){
            if(i.equals("C")) stack.pop();
            else if(i.equals("D")) stack.push(2*stack.peek());
            else if(i.equals("+")){
                int a=stack.pop();
                int b = a + stack.peek();
                stack.push(a);
                stack.push(b);
            } 
            else stack.push(Integer.parseInt(i));
        }

        int ans=0;
        while(!stack.empty()){
            ans += stack.pop();
        }

        return ans;
    }
}


// Just a minute change by eliminating an extra while loop and doing all calculation of the ans in the same for loop.
class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int ans=0;
        
        for(String i : ops){
            if(i.equals("C")) ans -= stack.pop();
            else if(i.equals("D")) ans += stack.push(2*stack.peek());
            else if(i.equals("+")){
                int a=stack.pop();
                int b = a + stack.peek();
                stack.push(a);
                stack.push(b);
                ans += b;
            } 
            else ans += stack.push(Integer.parseInt(i));
        }
        return ans;
    }
}


/*
import java.util.Stack;

class Que1 {
    static public int calPoints(String[] ops) {

        Stack<Integer> stack = new Stack<>();
        
        for(String i : ops){
            if(i.equals("C")) stack.pop();
            else if(i.equals("D")) stack.push(2*stack.peek());
            else if(i.equals("+")){
                int a=stack.pop();
                int b = a + stack.peek();
                stack.push(a);
                stack.push(b);
            } 
            else stack.push(Integer.parseInt(i));
        }

        int ans=0;
        while(!stack.empty()){
            ans += stack.pop();
        }

        return ans;
    }

    public static void main(String[] args) {
        // String[] ops = {"5","2","C","D","+"};
        String[] ops = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(ops));
    }
}
*/
// Que link: https://leetcode.com/problems/backspace-string-compare/
// 844. Backspace String Compare


// Method 1:
import java.util.Stack;

class Que1{
    public static void main(String[] args) {
        String s = "ab#c", t = "ad#c";
        // String s = ab##", t = "c#d#";
        // String s = "a#c", t = "b";
        System.out.println(backspaceCompare(s,t));
    }

    static public boolean backspaceCompare(String s, String t){
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for(char i : s.toCharArray()){
            if(i=='#'){
                if(!st1.isEmpty()) st1.pop();
            }
            else st1.push(i);
        }
        for(char i : t.toCharArray()){
            if(i=='#'){
                if(!st2.isEmpty()) st2.pop();
            }
            else st2.push(i);
        }

        if(st1.size() != st2.size()) return false;
        while(!st1.isEmpty()){
            if(st1.pop() != st2.pop())
                return false;
        }
        return true;
    }
}



// Method 2:
class Solution {
    public boolean backspaceCompare(String S, String T) {
        int i = S.length()-1;
        int j = T.length()-1;
        int countS = 0;
        int countT = 0;
        while (i >= 0 || j >= 0) {
            while (i >= 0 && (countS > 0 || S.charAt(i) == '#')) {
                if (S.charAt(i) == '#') countS++;
                else countS--;
                i--;
            }
            char left = i < 0 ? '@' : S.charAt(i);
            while (j >= 0 && (countT > 0 || T.charAt(j) == '#')) {
                if (T.charAt(j) == '#') countT++;
                else countT--;
                j--;
            }
            char right = j < 0 ? '@' : T.charAt(j);
            if (left != right) return false;
            i--;
            j--;
        }
        return true;
    }
}
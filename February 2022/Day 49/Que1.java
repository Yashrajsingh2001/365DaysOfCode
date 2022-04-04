// Que link: https://leetcode.com/problems/find-the-difference/
// 389. Find the Difference


// Method 1:
class Solution {
    public char findTheDifference(String s, String t) {
        int ans=0;
        for(char x: t.toCharArray()) ans+=x; 
        for(char x: s.toCharArray()) ans-=x;
        return (char)ans;
    }
}

// Method 2:
class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;
        for(char x : s.toCharArray()) c ^= x;
        for(char x : t.toCharArray()) c ^= x;
        return c;
    }
}


/*
We can also solve this but making an array of size 26 and doing ++ for char in s and -- for char in t.
Then we can check if anyone is ==1, then return it.
*/
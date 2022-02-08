// Que link: https://leetcode.com/problems/add-digits/
// 258. Add Digits


// Method 1:
class Solution {
    public int addDigits(int num) {
        return 1 + (num - 1) % 9;
    }
}



// Method 2:
class Solution {
    public int addDigits(int num) {
        if(num == 0) return 0;
        else if(num % 9 == 0) return 9;
        else return num % 9;
    }
}
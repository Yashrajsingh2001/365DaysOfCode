// Que link: https://leetcode.com/problems/reverse-integer/
// 7. Reverse Integer


//Method 1:
class Solution {
    public int reverse(int num) {
        if(num>=Integer.MAX_VALUE || num<=Integer.MIN_VALUE) return 0;
        int rev = 0;
        int len = (int)Math.log10(Math.abs(num));
        for(; len>=0; len--){
            rev += num%10 * (Math.pow(10, len));
            num /= 10;
        }
        if(rev>=Integer.MAX_VALUE || rev<=Integer.MIN_VALUE) return 0;
        else return rev;
    }
}
//* Note:
// Integer.MAX_VALUE is Math.pow(2,31)-1
// Integer.MIN_VALUE is Math.pow(-2,31)


//Method 2:
class Solution {
    public int reverse(int x){
        int result = 0;

        while (x != 0){
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result) return 0;
            result = newResult;
            x = x / 10;
        }
        return result;
    }
}
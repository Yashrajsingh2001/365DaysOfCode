// Que link: https://leetcode.com/problems/sequential-digits/
// 1291. Sequential Digits



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        for (int digit = 1; digit < 9; ++digit) {
            int next = digit, n = next;
            while (n <= high && next < 10) {
                if (n >= low) {
                    res.add(n);
                }
                n = n * 10 + ++next; // n= 1*10 + ++1 = (12), n= 12*10 + ++2 = (123), n= 123*10 + ++3 = (1234), etc... 
            }
        }
        Collections.sort(res);
        return res;        
    }
}
// Que LINK: https://leetcode.com/problems/complement-of-base-10-integer/

// Method 1:
class Solution {
    public int bitwiseComplement(int N) {
        int number_of_bits = (int)(Math.log(N) / Math.log(2)) + 1;
        return (((1 << number_of_bits) - 1) ^ N);
    }
}


// Method 2:
class Solution {
    public int bitwiseComplement(int N) {
        int X = 1;
        while (N > X) X = X * 2 + 1; // X = (X << 1) + 1;
        return N ^ X; // X - N;
    }
}
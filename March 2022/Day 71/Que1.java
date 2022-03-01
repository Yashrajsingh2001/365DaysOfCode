// Que link: https://leetcode.com/problems/counting-bits/
// 338. Counting Bits


// Slow:
class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(Integer i=0; i<=n; i++){
            arr[i] = Integer.bitCount(i);
        }
        return arr;
    }
}


// Fast:
class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        for (int i=1; i<=n; i++) 
            arr[i] = arr[i >> 1] + (i & 1);
            // arr[i] = arr[i/2] + (i & 1);
        return arr;
    }
}

// Another way: https://leetcode.com/problems/counting-bits/discuss/270693/Intermediate-processsolution-for-the-most-voted-solution-i.e.-no-simplificationtrick-hidden
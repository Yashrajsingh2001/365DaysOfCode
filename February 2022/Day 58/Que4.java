// Que link: https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
// 1356. Sort Integers by The Number of 1 Bits

//! Solve again:

// Method 1:
// Explanation: https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/discuss/527594/Java-Simple-Code/585423
class Solution {  
    /** 
     Since the input values can range from 0 to 10000, we can add to each element on the array the value of the bit count (number of 1s) multiplied by 10001.
     10001 is not a magic number, it is merely the max possible number the array may have + 1, which ensures that the bit count has the maximum priority,
     and that we do not mistakenly erase a number when reverting the array back to its original values (after sorting).
     This approach is an effective way of sorting by more than one criteria, a similar logic could be applied to more complex problems.
    */ 
    public int[] sortByBits(int[] arr) {   
        // apply a bitcount modifier to the array values
        for(int i = 0; i < arr.length; i++) {
            arr[i] += Integer.bitCount(arr[i]) * 10001;
        }
        
        // sort the array, and remove the bitcount modifier
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            arr[i] %= 10001;     
        }
        
        // return the sorted array
        return arr;
    }
}



// Method 2:
class Solution {
	public int[] sortByBits(int[] arr) {
        int n = arr.length, res[] = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = countBitOne(arr[i])*10001 + arr[i];
        }
        
        Arrays.sort(res);
        for (int i = 0; i < n; i++) {
            res[i] %= 10001;
        }
        
        return res;
    }
    
    private int countBitOne(int n) {
        int res = 0;
        while (n != 0) {
            res += (n & 1);
            n >>= 1;
        }
        return res;
    }
}




// Method 3:
class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] a = new Integer[arr.length];
        for (int i = 0; i < a.length; ++i)
            a[i] = arr[i];
        // Arrays.sort(a, (i, j) -> Integer.bitCount(i) != Integer.bitCount(j) ? Integer.bitCount(i) - Integer.bitCount(j) : i - j);
        Arrays.sort(a, Comparator.comparing(i -> Integer.bitCount(i) * 10000 + i));
        for (int i = 0; i < a.length; ++i)
            arr[i] = a[i];
        return arr;
    }
}
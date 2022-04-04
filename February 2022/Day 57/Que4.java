// Que link: https://leetcode.com/problems/sort-array-by-parity-ii/
// 922. Sort Array By Parity II


// Method 1:
// We are using extra space
class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int[] res = new int[A.length];
        int enev_idx = 0, odd_idx = 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                res[enev_idx] = A[i];
                enev_idx += 2;
            } 
            else {
                res[odd_idx] = A[i];
                odd_idx += 2;
            }
        }
        return res;
    }
}



// Method 2:
// e is even index and o is odd index
class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int e = 0;
        int o = 1;

        while(e < A.length && o < A.length) {
            if(A[e]%2 != 0) {
                swap(A, e, o);
                o += 2;
            } else {
                e += 2;
            }
        }
        return A;
    }

    private void swap(int[] a, int e, int o) {
        int temp = a[e];
        a[e] = a[o];
        a[o] = temp;
    }
}
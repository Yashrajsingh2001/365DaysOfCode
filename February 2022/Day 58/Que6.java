// Que link: https://leetcode.com/problems/pancake-sorting/
// 969. Pancake Sorting


class Solution {
    public List<Integer> pancakeSort(int[] A) {
        List<Integer> res = new ArrayList<>();
        for (int x = A.length; x > 0; --x) {
            int i=0;
            while(A[i] != x)
                i++;
            
            reverse(A, i + 1);
            res.add(i + 1);
            reverse(A, x);
            res.add(x);
        }
        return res;
    }

    public void reverse(int[] A, int k) {
        int i = 0, j = k-1;
        while(i < j){
            int tmp = A[i];
            A[i++] = A[j];
            A[j--] = tmp;
        }
    }
}
// Que link: https://leetcode.com/problems/sort-colors/
// 75. Sort Colors


// Brute force:
class Solution {
    public void sortColors(int[] nums) {
        int len=nums.length;
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }
}


// Two pass O(m+n) space
class Solution {
    public void sortColors(int[] A) {
        int num0 = 0, num1 = 0, num2 = 0, n=A.length;

        for(int i = 0; i < n; i++) {
            if(A[i] == 0) ++num0;
            else if (A[i] == 1) ++num1;
            else if (A[i] == 2) ++num2;
        }

        for(int i = 0; i < num0; ++i) A[i] = 0;
        for(int i = 0; i < num1; ++i) A[num0+i] = 1;
        for(int i = 0; i < num2; ++i) A[num0+num1+i] = 2;
    }
}


// One pass in place solution
class Solution {
    public void sortColors(int[] A) {
        int n0 = -1, n1 = -1, n2 = -1, n=A.length;
        for (int i = 0; i < n; ++i) {
            if (A[i] == 0) {
                A[++n2] = 2; A[++n1] = 1; A[++n0] = 0;
            }
            else if (A[i] == 1) {
                A[++n2] = 2; A[++n1] = 1;
            }
            else if (A[i] == 2) {
                A[++n2] = 2;
            }
        }
    }
}
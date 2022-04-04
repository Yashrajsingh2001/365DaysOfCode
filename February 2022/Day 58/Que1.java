// Que link: https://leetcode.com/problems/largest-perimeter-triangle/
// 976. Largest Perimeter Triangle


import java.util.Arrays;

class Que1 {
    static public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i > 1; --i)
            if (A[i] < A[i - 1] + A[i - 2])
                return A[i] + A[i - 1] + A[i - 2];
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,2};
        System.out.println(largestPerimeter(nums));
    }
}
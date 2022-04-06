// Que link: https://leetcode.com/problems/3sum-with-multiplicity/
// 923. 3Sum With Multiplicity


class Solution {
    public int threeSumMulti(int[] A, int target) {
        long[] c = new long[101];
        for (int a : A) c[a]++;
        long res = 0;
        for (int i = 0; i <= 100; i++)
            for (int j = i; j <= 100; j++) {
                int k = target - i - j;
                if (k > 100 || k < 0) continue;
                if (i == j && j == k)
                    res += c[i] * (c[i] - 1) * (c[i] - 2) / 6;
                else if (i == j && j != k)
                    res += c[i] * (c[i] - 1) / 2 * c[k];
                else if (j < k)
                    res += c[i] * c[j] * c[k];
            }
        return (int)(res % (1e9 + 7));
    }
}

/*
The mathematical formula is combination formula. When you need to select 3 numbers from 'n' numbers, 
no ways of doing it is nC3 which is basically n * (n-1) * (n-2)/6, 
similarly when you need to select 2 numbers from 'n' numbers, 
the number of ways of doing it is nC1 which is equal to n * (n-1) / 2.
*/
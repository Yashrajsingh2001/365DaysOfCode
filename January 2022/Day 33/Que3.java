// Que link: https://leetcode.com/problems/self-dividing-numbers/
// 728. Self Dividing Numbers



class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left, j = 0; i <= right; i++) {
            for (j = i; j > 0; j /= 10)
                if (j % 10 == 0 || i % (j % 10) != 0) break;
            if (j == 0) res.add(i);
        }
        return res;
    }
}
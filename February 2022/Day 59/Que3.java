// Que link: https://leetcode.com/problems/combination-sum-iii/
// 216. Combination Sum III


class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        combination(result, new ArrayList<Integer>(), k, 1, n);
        return result;
    }

    private void combination(List<List<Integer>> result, List<Integer> comb, int k,  int start, int n) {
        if (comb.size() == k && n == 0) {
            List<Integer> li = new ArrayList<Integer>(comb);
            result.add(li);
            return;
        }
        for (int i = start; i <= 9; i++) {
            comb.add(i);
            combination(result, comb, k, i+1, n-i);
            comb.remove(comb.size() - 1);
        }
    }
}
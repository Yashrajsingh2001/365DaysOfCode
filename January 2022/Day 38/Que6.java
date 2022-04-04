// Que link: https://leetcode.com/problems/binary-prefix-divisible-by-5/
// 1018. Binary Prefix Divisible By 5


class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        int num = 0;
        for(int cur : nums){
            num = ((num << 1) + cur) % 5;
            res.add(num == 0);
        }
        return res;
    }
}
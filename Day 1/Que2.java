// Que LINK: https://leetcode.com/problems/house-robber/
public class Que2 {
    public int rob(int[] nums) {
        int pre_rob = 0, pre_miss = 0;
        for (int num : nums) {
            int temp = pre_rob;
            pre_rob = pre_miss + num;
            pre_miss = Math.max(temp,pre_miss);

        }
        return Math.max(pre_rob, pre_miss);
    }
}
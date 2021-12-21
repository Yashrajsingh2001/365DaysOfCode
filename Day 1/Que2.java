// Que LINK: https: leetcode.com/problems/house-robber/
public class Que2 {
    public int rob(int[] nums) {
        // [5,7,20,3,8,50,1]
        int pre_rob = 0, pre_miss = 0;
        for(int i = 0; i < nums.length; i++){
            int temp = pre_rob; // 0, 5, 7
            pre_rob = pre_miss + nums[i]; // 5, 7,
            pre_miss = Math.max(temp,pre_miss); // 0, 7,

        }
        return Math.max(pre_rob, pre_miss);
    }
}
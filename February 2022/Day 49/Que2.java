// Que link: https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
// 671. Second Minimum Node In a Binary Tree


class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        if(root.left == null) return -1;
        
        int l = root.left.val == root.val ? findSecondMinimumValue(root.left) : root.left.val;
        int r = root.right.val == root.val ? findSecondMinimumValue(root.right) : root.right.val;
        
        return l == -1 || r == -1 ? Math.max(l, r) : Math.min(l, r);
    }
}
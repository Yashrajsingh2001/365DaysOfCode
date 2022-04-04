// Que link: https://leetcode.com/problems/maximum-depth-of-binary-tree/
// 104. Maximum Depth of Binary Tree


class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int max = 1;        
        Stack<TreeNode> nodes = new Stack<>();
        Stack<Integer> depths = new Stack<>();
        
        nodes.push(root);
        depths.push(1);
        
        while (!nodes.empty()) {
            TreeNode curr = nodes.pop();
            int depth = depths.pop();
            
            if (curr.left == null && curr.right == null) {
                max = Math.max(max, depth);
            } 
            if (curr.right != null) {
                nodes.push(curr.right);
                depths.push(depth + 1);
            } 
            if (curr.left != null) {
                nodes.push(curr.left);
                depths.push(depth + 1);
            }
        }
        return max;
    }
}




// Recursive solution;
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1; 
        // return 1+Math.max(maxDepth(root.left),maxDepth(root.right)); // alternative of above 3 lines.

    }
}
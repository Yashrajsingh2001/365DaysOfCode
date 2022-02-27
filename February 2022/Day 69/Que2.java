// Que link: https://leetcode.com/problems/minimum-depth-of-binary-tree/
// 111. Minimum Depth of Binary Tree

// Method 1:
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int depth = 1;
        
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- >0){
                root = q.poll();
                if(root.left==null && root.right==null) return depth;
                if(root.left != null) q.add(root.left);
                if(root.right != null) q.add(root.right);
            }
            depth++;
        }
        return 0;
    }
}


// Method 2:
class Solution {
    public int minDepth(TreeNode root) {
        if(root==null) 
            return 0;
        if(root.left==null && root.right==null) 
            return 1;
        if(root.left==null)
            return minDepth(root.right) + 1;
        if(root.right==null)
            return minDepth(root.left) + 1;
        
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
// Que link: https://leetcode.com/problems/find-bottom-left-tree-value/
// 513. Find Bottom Left Tree Value


// Method 1:
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            root = queue.poll();
            if (root.right != null)
                queue.add(root.right);
            if (root.left != null)
                queue.add(root.left);
        }
        return root.val;
    }
}


// Method 2:
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        if(root == null) return 0;
        
        TreeNode res = null;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            res = queue.peek();
            for(int i = 0; i < size; i++){
                TreeNode temp = queue.poll();
                if(temp.left != null) queue.offer(temp.left);
                if(temp.right != null) queue.offer(temp.right);
            }
        }
        return res.val;
    }
}
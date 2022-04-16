// Que link: https://leetcode.com/problems/convert-bst-to-greater-tree/
// 538. Convert BST to Greater Tree

// Method 1: Recursion:
class Solution {
    int sum=0;
    public TreeNode convertBST(TreeNode root) {
        if(root==null) return null;
        
        convertBST(root.right);
        sum += root.val;
        root.val = sum;
        convertBST(root.left);
        
        return root;
    }
}


// Method 2: Iteration:
class Solution {
    public TreeNode convertBST(TreeNode root) {
        if(root==null) return null;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        int sum=0;
        
        while(!stack.isEmpty() || node!=null){
            while(node!=null){
                stack.add(node);
                node=node.right;   
            }
            node = stack.pop();
            sum += node.val;
            node.val = sum;
            node = node.left;
        }
        return root;
    }
}
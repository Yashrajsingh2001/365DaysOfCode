// Que link: https://leetcode.com/problems/binary-tree-postorder-traversal/submissions/
// 145. Binary Tree Postorder Traversal


class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode p = root;
        while(!stack.isEmpty() || p != null) {
            if(p != null) {
                stack.push(p);
                result.addFirst(p.val);  
                p = p.right;             
            } else {
                TreeNode node = stack.pop();
                p = node.left;           
            }
        }
        return result;
    }
}


// Recursion:
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> in = new LinkedList<Integer>();
        postorder(root,in);
        return in;
    }
    public void postorder(TreeNode root, List<Integer> nums) {
        if (root == null) return;
        postorder(root.left, nums);
        postorder(root.right, nums);
        nums.add(root.val);
    }
}
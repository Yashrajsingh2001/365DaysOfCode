// Que link: https://leetcode.com/problems/binary-tree-inorder-traversal/
// 94. Binary Tree Inorder Traversal


class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;

        while(cur!=null || !stack.empty()){
            while(cur!=null){
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }

        return list;
    }
}



// Recursion
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> in = new LinkedList<Integer>();
        inorder(root,in);
        return in;
    }
    public void inorder(TreeNode root, List<Integer> nums) {
      if (root == null) return;
      inorder(root.left, nums);
      nums.add(root.val);
      inorder(root.right, nums);
    }
}
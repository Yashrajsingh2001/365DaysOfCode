// Credit: https://leetcode.com/problems/binary-tree-inorder-traversal/discuss/328601/All-DFS-traversals-(preorder-postorder-inorder)-in-Java-in-5-lines



// Preorder: Node -> Left -> Right
public void preorder(TreeNode root, List<Integer> nums) {
	if (root == null) return;
	nums.add(root.val);
	preorder(root.left, nums);
	preorder(root.right, nums);
}



// Inorder : Left -> Node -> Right
public void inorder(TreeNode root, List<Integer> nums) {
	if (root == null) return;
	inorder(root.left, nums);
	nums.add(root.val);
	inorder(root.right, nums);
}
/*
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
*/


// Postorder : Left -> Right -> Node
public void postorder(TreeNode root, List<Integer> nums) {
	if (root == null) return;
	postorder(root.left, nums);
	postorder(root.right, nums);
	nums.add(root.val);
}

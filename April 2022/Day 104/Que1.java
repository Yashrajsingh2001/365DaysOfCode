// Que link: https://leetcode.com/problems/binary-search-tree-iterator/
// 173. Binary Search Tree Iterator


class BSTIterator {
	Stack<TreeNode> stack;
	public BSTIterator(TreeNode root) {
		stack = new Stack<>();
		TreeNode node = root;
		pushAll(node);
	}
	public int next() {
		TreeNode toRemove = stack.pop();
		pushAll(toRemove.right);       
		return toRemove.val;
	}
	public boolean hasNext() {
		return !stack.isEmpty();    
	}
	public void pushAll(TreeNode node){
		while(node != null){
			stack.add(node);
			node = node.left;
		}
	}
}
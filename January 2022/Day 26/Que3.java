// Que link: https://leetcode.com/problems/invert-binary-tree/
// 226. Invert Binary Tree


// Recursion:
public TreeNode invertTree(TreeNode root) {
    if (root == null) return null;
    TreeNode tempRight = root.right;
    root.right = invertTree(root.left);
    root.left = invertTree(tempRight);
    return root;
}



// Iteration:
class Solution {
    public TreeNode invertTree(TreeNode root) {
        
        if (root == null) {
            return null;
        }

        final Queue<TreeNode> queue = new LinkedList<>(); //or use: final Deque<TreeNode> stack = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            final TreeNode node = queue.poll();
            final TreeNode left = node.left;
            node.left = node.right;
            node.right = left;

            if(node.left != null) {
                queue.offer(node.left); // stack.push(node.left);
            }
            if(node.right != null) {
                queue.offer(node.right); // stack.push(node.right);
            }
        }
        return root;
    }
}
// Que link: https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
// 114. Flatten Binary Tree to Linked List


class Solution {
    private TreeNode prev = null;

    public void flatten(TreeNode root) {
        if (root == null)
            return;
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
}
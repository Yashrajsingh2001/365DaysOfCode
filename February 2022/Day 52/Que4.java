// Que link: https://leetcode.com/problems/univalued-binary-tree/
// 965. Univalued Binary Tree

// Method 1:
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
        if(root.left != null && root.left.val != root.val) return false;
        if(root.right != null && root.right.val != root.val) return false;
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}


// Method 2:
class Solution {
    int val = -1;
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return true;
        if (val < 0) val = root.val;
        return root.val == val && isUnivalTree(root.left)  && isUnivalTree(root.right);
    }
}
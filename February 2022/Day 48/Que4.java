// Que link: https://leetcode.com/problems/minimum-distance-between-bst-nodes/
// 783. Minimum Distance Between BST Nodes


// Method 1:
class Solution {
    Integer res = Integer.MAX_VALUE, pre = null;
    public int minDiffInBST(TreeNode root) {
        if (root.left != null) minDiffInBST(root.left);
        if (pre != null) res = Math.min(res, root.val - pre);
        pre = root.val;
        if (root.right != null) minDiffInBST(root.right);
        return res;
    }
}


// Method 2:
class Solution {
    int min = Integer.MAX_VALUE;
    Integer pre = null;
    public int minDiffInBST(TreeNode root) {
        check(root);
        return min;
    }

    private void check(TreeNode node) {
        if (node == null) return;
        check(node.left);
        if (pre != null)
            min = Math.min(min, node.val - pre);
        pre = node.val;
        check(node.right);
    }
}
// Que link: https://leetcode.com/problems/search-in-a-binary-search-tree/
// 700. Search in a Binary Search Tree


// Iteration:
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        while(root != null && root.val != val){
            root = val < root.val ? root.left : root.right;
        }
        return root;
    }
}




// Recursion:
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return root;
        if(root.val == val) return root;
        return val < root.val ? searchBST(root.left,val) : searchBST(root.right,val);
    }
}
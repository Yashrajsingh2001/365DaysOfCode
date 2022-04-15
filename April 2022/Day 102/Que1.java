// Que link: https://leetcode.com/problems/trim-a-binary-search-tree/
// 669. Trim a Binary Search Tree


class Solution {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root==null) return null;
        
        if(root.val<low){
            return trimBST(root.right, low, high);
        }
        else if(root.val>high){
            return trimBST(root.left, low, high);
        }
        
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        
        return root;
    }
}


// Post Order:
class Solution {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) return root;
  
        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        if (root.val > R) return root.left;
        if (root.val < L) return root.right;
        return root;
    }
}
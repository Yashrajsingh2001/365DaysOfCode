// Que link: https://leetcode.com/problems/range-sum-of-bst/
// 938. Range Sum of BST


// Iterative Solution: Slow
class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        Stack<TreeNode> stk = new Stack<>();
        stk.push(root);
        int sum = 0;
        while (!stk.isEmpty()) {
            TreeNode n = stk.pop();
            if (n == null) { continue; }
            if (n.val > L) { stk.push(n.left); } // left child is a possible candidate.
            if (n.val < R) { stk.push(n.right); } // right child is a possible candidate.
            if (L <= n.val && n.val <= R) { sum += n.val; }
        }
        return sum;
    }
}


// Recursive Solution:
class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {    
        if( root == null) return 0;
        int n  = 0;
        if(root.val >= L && root.val <= R) n = root.val;
        n += rangeSumBST(root.left, L, R);
        n += rangeSumBST(root.right, L, R);
        return  n;
    }
}


// Recursive Solution:
class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) return 0; // base case.
        return (L <= root.val && root.val <= R ? root.val : 0) + rangeSumBST(root.right, L, R) + rangeSumBST(root.left, L, R);
    }
}
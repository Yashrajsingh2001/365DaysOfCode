// Que link: https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
// 1022. Sum of Root To Leaf Binary Numbers

class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }
    public int dfs(TreeNode root, int sum){
        if(root == null) return 0;
        sum = (2 * sum) + root.sum;
        if(root.left == null && root.right == null) return sum;
        return dfs(root.left, sum) + sumRootToLeaf(root.right, sum);
        // return root.left == root.right ? sum : dfs(root.left, sum) + dfs(root.right, sum); //* Alternative of above two lines
    }
}
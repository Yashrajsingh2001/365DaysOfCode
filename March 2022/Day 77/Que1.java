// Que link: https://leetcode.com/problems/recover-binary-search-tree/
// 99. Recover Binary Search Tree


//* Solution link: https://leetcode.com/problems/recover-binary-search-tree/discuss/32562/Share-my-solutions-and-detailed-explanation-with-recursiveiterative-in-order-traversal-and-Morris-traversal

//! Solve again.
// Iteration:
class Solution {
    public void recoverTree(TreeNode root) {
        TreeNode first = null;
        TreeNode second = null;

        TreeNode curr = root;
        TreeNode prev = null;

        Stack<TreeNode> stack = new Stack<TreeNode>();

        while(!stack.isEmpty() ||  curr != null){
            if(curr != null){
                //visit curr's left subtree
                stack.push(curr);
                curr = curr.left;
            }else{
                //done left subtree of curr Node
                curr = stack.pop();

                //compare curr.val with prev.val if we have one
                if(prev != null && curr.val <= prev.val){
                    //incorrect smaller node is always found as prev node
                    if(first == null) first = prev;
                    //incorrect larger node is always found as curr node
                    second = curr;         
                }  

                //visit curr's right subtree
                prev = curr;
                curr = curr.right;
            }
        }

        //recover swapped nodes
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
}


// Recursion:
class Solution {
    public void recoverTree(TreeNode root) {
        //use inorder traversal to detect incorrect node

        inOrder(root);


        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    TreeNode prev = null;
    TreeNode first = null;
    TreeNode second = null;

    public void inOrder(TreeNode root){
        if(root == null) return;
        //search left tree
        inOrder(root.left);

        //in inorder traversal of BST, prev should always have smaller value than current value
        if(prev != null && prev.val >= root.val){
            //incorrect smaller node is always found as prev node
            if(first == null) first = prev;
          //incorrect larger node is always found as curr(root) node
            second = root;
        }


        //update prev node
        prev = root;

        //search right tree
        inOrder(root.right);
    }
}
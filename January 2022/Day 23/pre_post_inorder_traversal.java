// Credit: https://leetcode.com/problems/binary-tree-inorder-traversal/discuss/328601/All-DFS-traversals-(preorder-postorder-inorder)-in-Java-in-5-lines



// Preorder: Node -> Left -> Right
public void preorder(TreeNode root, List<Integer> nums) {
	if (root == null) return;
	nums.add(root.val);
	preorder(root.left, nums);
	preorder(root.right, nums);
}



// Inorder : Left -> Node -> Right
public void inorder(TreeNode root, List<Integer> nums) {
	if (root == null) return;
	inorder(root.left, nums);
	nums.add(root.val);
	inorder(root.right, nums);
}
/*
//* Leet code solution:
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> in = new LinkedList<Integer>();
        inorder(root,in);
        return in;
    }
    public void inorder(TreeNode root, List<Integer> nums) {
      if (root == null) return;
      inorder(root.left, nums);
      nums.add(root.val);
      inorder(root.right, nums);
    }
}
*/


// Postorder : Left -> Right -> Node
public void postorder(TreeNode root, List<Integer> nums) {
	if (root == null) return;
	postorder(root.left, nums);
	postorder(root.right, nums);
	nums.add(root.val);
}


//* *************************************************************************************************************************
// Credit: https://leetcode.com/problems/binary-tree-postorder-traversal/discuss/45551/Preorder-Inorder-and-Postorder-Iteratively-Summarization


// Preorder: Node -> Left -> Right
// Pre Order Traverse
public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Deque<TreeNode> stack = new ArrayDeque<>();
    TreeNode p = root;
    while(!stack.isEmpty() || p != null) {
        if(p != null) {
            stack.push(p);
            result.add(p.val);  // Add before going to children
            p = p.left;
        } else {
            TreeNode node = stack.pop();
            p = node.right;   
        }
    }
    return result;
}




// Inorder : Left -> Node -> Right
// In Order Traverse
public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Deque<TreeNode> stack = new ArrayDeque<>();
    TreeNode p = root;
    while(!stack.isEmpty() || p != null) {
        if(p != null) {
            stack.push(p);
            p = p.left;
        } else {
            TreeNode node = stack.pop();
            result.add(node.val);  // Add after all left children
            p = node.right;   
        }
    }
    return result;
}




// Postorder : Left -> Right -> Node
// Post Order Traverse
public List<Integer> postorderTraversal(TreeNode root) {
    LinkedList<Integer> result = new LinkedList<>();
    Deque<TreeNode> stack = new ArrayDeque<>();
    TreeNode p = root;
    while(!stack.isEmpty() || p != null) {
        if(p != null) {
            stack.push(p);
            result.addFirst(p.val);  // Reverse the process of preorder
            p = p.right;             // Reverse the process of preorder
        } else {
            TreeNode node = stack.pop();
            p = node.left;           // Reverse the process of preorder
        }
    }
    return result;
}
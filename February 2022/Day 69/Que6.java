// Que link: https://leetcode.com/problems/n-ary-tree-postorder-traversal/
// 590. N-ary Tree Postorder Traversal


// Method 1:
class Solution {
    public List<Integer> list = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if(root==null) return list;
        
        for(Node node : root.children)
            postorder(node);
            
        list.add(root.val);
        return list;
    }
}


// Method 2:
class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        
        while(!stack.isEmpty()) {
            root = stack.pop();
            list.add(root.val);
            for(Node node: root.children)
                stack.add(node);
        }
        Collections.reverse(list);
        return list;
    }
}
// Que link: https://leetcode.com/problems/binary-tree-right-side-view/
// 199. Binary Tree Right Side View


class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        if(root==null) return ans;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            ans.add(q.peek().val);
            int size = q.size();
            
            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                
                if(curr.right != null) q.offer(curr.right);
                if(curr.left != null) q.offer(curr.left);
            }
        }
        return ans;
    }
}
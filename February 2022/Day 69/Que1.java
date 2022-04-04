// Que link: https://leetcode.com/problems/maximum-width-of-binary-tree/
// 662. Maximum Width of Binary Tree


// Method 1:
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> qIndex = new LinkedList<>();
        q.add(root);
        qIndex.add(1); //store index, assuming root's index is 1
        int max = 0;
        while(!q.isEmpty()){
            int size = q.size();
            int start = 0, end = 0;
            for(int i=0; i<size; i++){
                TreeNode node = q.poll(); // or use .remove
                int index = qIndex.poll();
                if(i==0) start = index; //start and end index for each level
                if(i==size-1) end = index;
                if(node.left!=null){
                    q.add(node.left);
                    qIndex.add(2*index);
                }
                
                if(node.right!=null){
                    q.add(node.right);
                    qIndex.add(2*index+1);
                }
            }
            max = Math.max(max, end - start + 1);
        }
        return max;    
    }
}



// Method 2:
class Solution {
    private int max = 1;
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        List<Integer> startOfLevel = new LinkedList<>();
        helper(root, 0, 1, startOfLevel);
        return max;
    }
    public void helper(TreeNode root, int level, int index, List<Integer> list) {
        if (root == null) return;
        if (level == list.size()) list.add(index);
        max = Math.max(max, index + 1 - list.get(level));
        helper(root.left, level + 1, index * 2, list);
        helper(root.right, level + 1, index * 2 + 1, list);
    }
}

// For different recursive solution go to some answers mentioned by others at:
// https://leetcode.com/problems/maximum-width-of-binary-tree/discuss/106654/JavaC%2B%2B-Very-simple-dfs-solution
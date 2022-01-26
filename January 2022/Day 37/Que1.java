// Que link: https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
// 1305. All Elements in Two Binary Search Trees


// Method 1:
class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans = new ArrayList<>();
        inorder(root1, ans);
        inorder(root2, ans);
        Collections.sort(ans); // Here it calls List.sort(object) method.
        return ans;
    }
    private void inorder(TreeNode n, List<Integer> ans) {
        if (n == null) return;
        inorder(n.left, ans);
        ans.add(n.val);
        inorder(n.right, ans);
    }
}



// Method 2:
class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        Queue<Integer> q1 = new LinkedList<>(), q2 = new LinkedList<>();
        inorder(root1, q1);
        inorder(root2, q2);
        List<Integer> ans = new ArrayList<>();
        while (!q1.isEmpty() || !q2.isEmpty())
            if (q2.isEmpty())
                ans.add(q1.poll());
            else if (q1.isEmpty())
                ans.add(q2.poll());
            else
                ans.add(q1.peek() < q2.peek() ? q1.poll() : q2.poll());
        return ans;
    }
    private void inorder(TreeNode n, Queue<Integer> q) {
        if (n == null) return;
        inorder(n.left, q);
        q.offer(n.val);
        inorder(n.right, q);
    }
}



// Method 3:
//* Explanation: https://leetcode.com/problems/all-elements-in-two-binary-search-trees/discuss/1720210/JavaC%2B%2BPython-A-very-very-detailed-EXPLANATION
class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        
        List<Integer> res = new ArrayList<>();
        
        while(root1 != null || root2 != null || !st1.empty() || !st2.empty()){
            while(root1 != null){
                st1.push(root1);
                root1 = root1.left;
            }
            while(root2 != null){
                st2.push(root2);
                root2 = root2.left;
            }
            if(st2.empty() || (!st1.empty() && st1.peek().val <= st2.peek().val)){
                root1 = st1.pop();
                res.add(root1.val);
                root1 = root1.right;
            }
            else{
                root2 = st2.pop();
                res.add(root2.val);
                root2 = root2.right;
            }
        }
        return res;
    }
}



/*
class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> al1=new ArrayList<>();
        List<Integer> al2=new ArrayList<>();
        inorder(root1,al1);
        inorder(root2,al2);
        List<Integer> ans=new ArrayList<>();
        int i=0, j=0;
        while(i<al1.size() && j<al2.size()){
            if(al1.get(i)<al2.get(j)){
                ans.add(al1.get(i));
                i++;
            }
            else{
                ans.add(al2.get(j));
                j++;
            }
        }
        while(i<al1.size()){
            ans.add(al1.get(i));
            i++;
        }
        while(j<al2.size()){
            ans.add(al2.get(j));
            j++;
        }
        return ans;
    }
    static void inorder(TreeNode root,List<Integer> al){
        if(root==null) return ;
        // L->N->R
        inorder(root.left,al);
        al.add(root.val);
        inorder(root.right,al);
    }
}
*/
// Que link: https://practice.geeksforgeeks.org/problems/right-view-of-binary-tree/1
// Right View of Binary Tree


class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        ArrayList<Integer> ans = new ArrayList<>();
        if (node == null)
            return ans;

        Queue<Node> q = new LinkedList<>();
        q.offer(node);

        while (!q.isEmpty()) {
            ans.add(q.peek().data);
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                if (curr.right != null) q.offer(curr.right);
                if (curr.left != null) q.offer(curr.left);
            }
        }
        return ans;
    }
}
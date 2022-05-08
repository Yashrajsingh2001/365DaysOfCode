// Que link: https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1#
// Left View of Binary Tree


class Tree {
    // Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            ans.add(q.peek().data);
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
                // for right view, just put right above left
            }
        }
        return ans;
    }
}
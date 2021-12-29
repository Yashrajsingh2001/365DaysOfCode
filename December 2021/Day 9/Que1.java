// Que LINK: https://leetcode.com/problems/populating-next-right-pointers-in-each-node/

// Explanation: https://leetcode.com/problems/populating-next-right-pointers-in-each-node/discuss/1654181/C%2B%2BPythonJava-Simple-Solution-w-Images-and-Explanation-or-BFS-%2B-DFS-%2B-O(1)-Optimized-BFS


// Method 1:
class Solution {
    public Node connect(Node root) {
        if(root == null) return null;
        Node L = root.left, R = root.right, N = root.next;
        if(L != null) {
            L.next = R;
            if(N != null) R.next = N.left;
            connect(L);
            connect(R);
        }
        return root;
    }
}
// Time Complexity : O(N), each node is only traversed once
// Space Complexity : O(logN), required for recursive stack. The maximum depth of recursion is equal to the height of tree which in this case of perfect binary tree is equal to O(logN)



// Method 2:
class Solution {
    public Node connect(Node root) {
        Node head = root;
        for(; root != null; root = root.left) 
            for(Node cur = root; cur != null; cur = cur.next) 
                if(cur.left != null) {
                    cur.left.next = cur.right;
                    if(cur.next != null) cur.right.next = cur.next.left;
                } else break;
        
        return head;
    }
}
// Time Complexity : O(N), we only traverse each node once, basically doing a standard BFS.
// Space Complexity : O(1), only constant extra space is being used



// Method 3:
class Solution {
    public Node connect(Node root) {
        if (root == null) return null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int cnt = q.size();
            for (int i = 0;i < cnt; i++) {
                Node tempNode = q.poll();
                if (tempNode.left != null) q.add(tempNode.left);
                if (tempNode.right != null) q.add(tempNode.right);
                if (q.peek() != null && i < cnt -1) tempNode.next = q.peek();    //(i < cnt -1)  :   To check the whether it's not the last element of a level
            }
        }
        return root;
    }
}
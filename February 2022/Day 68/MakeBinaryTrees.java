import java.util.*;

//* Build a Tree from its Preorder traversal
public class MakeBinaryTrees {
    static class Node {
        int data;
        Node left;
        Node right;
  
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
  
    static class BinaryTree {
        static int idx = -1;
        public Node buildTree(int nodes[]) { // removed static
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]); 
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    //* Tree Traversals
    public static void preorder(Node root){
        if(root == null){
            // System.out.print(-1 + " ");
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void inorder(Node root){
        if(root == null){
            // System.out.print(-1 + " ");
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root == null){
            // System.out.print(-1 + " ");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelorder(Node root){
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null); // We are adding null to keep a track on each level

        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                System.out.println(); // new line after every level
                //queue empty
                if (q.isEmpty()) break;
                q.add(null);
            }else{
                System.out.print(curr.data + " ");
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
        }
    }

    //* Height of Tree
    public static int height(Node root){
        if(root == null) return 0;

        int leftHeight = height(root.left);
        int rightHight = height(root.right);
        return Math.max(leftHeight, rightHight) + 1;
    }

    //* Count of Nodes of Tree
    public static int countOfNodes(Node root) {
        if(root == null) return 0;
  
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes + rightNodes + 1;
    }

    //* Sum of Nodes of Tree
    public static int sumOfNodes(Node root) {
        if(root == null) return 0;
    
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }

    //* Diameter of Tree - Approach1 O(N^2)
    public static int diameter(Node root){
        if(root == null) return 0;

        int diameter1 = diameter(root.left);
        int diameter2 = diameter(root.right);
        int diameter3 = height(root.left) + height(root.right) + 1;
        
        return Math.max(diameter3, Math.max(diameter1, diameter2)); // Max of all three
    }

    //* Diameter of Tree - Approach2 O(N)
    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }

    // We can not have 2 return type so we made TreeInfo class and return height and diameter with it.
    public static TreeInfo diameter2(Node root) {
        if(root == null) return new TreeInfo(0, 0);
  
        TreeInfo leftTI = diameter2(root.left);
        TreeInfo rightTI = diameter2(root.right);
  
        int myHeight = Math.max(leftTI.ht, rightTI.ht) + 1;
  
        int diam1 = leftTI.ht + rightTI.ht + 1;
        int diam2 = leftTI.diam;
        int diam3 = rightTI.diam;
  
        int myDiam = Math.max(diam1, Math.max(diam2, diam3));
  
        return new TreeInfo(myHeight, myDiam);
    }
 
  
    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes); //MakeBinaryTrees.BinaryTree.buildTree(nodes);
        
        System.out.print("\nPreorder:  ");
        preorder(root);
        System.out.print("\nInorder:   ");
        inorder(root);
        System.out.print("\nPostorder: ");
        postorder(root);
        System.out.println("\nLevelorder: ");
        levelorder(root);


        System.out.println("Height of Tree: " +height(root));

        System.out.println("Number of nodes in the tree: " + countOfNodes(root));

        System.out.println("Sum of nodes: " + sumOfNodes(root));

        //* Maximum distance between two node:
        System.out.println("Diameter of Tree (Method 1): " + diameter(root));
        System.out.println("Diameter of Tree (Method 2): " + diameter2(root).diam);
    }
}
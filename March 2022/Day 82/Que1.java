// Que link: https://leetcode.com/problems/copy-list-with-random-pointer/
// 138. Copy List with Random Pointer


// Method 1:
class Solution {
    public Node copyRandomList(Node head) {
        if (head == null)
            return null;

        Map<Node, Node> map = new HashMap<Node, Node>();

        // loop 1. copy all the nodes
        Node node = head;
        while (node != null) {
            map.put(node, new Node(node.val));
            node = node.next;
        }

        // loop 2. assign next and random pointers
        node = head;
        while (node != null) {
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
            node = node.next;
        }
        return map.get(head);
    }
}


// Method 2:
class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<Node, Node>();
        Node cur = head;
        while (cur != null) {
            if (!map.containsKey(cur)) {
                map.put(cur, new Node(cur.val));
            }
            if (cur.next != null && !map.containsKey(cur.next)) {
                map.put(cur.next, new Node(cur.next.val));
            }
            if (cur.random != null && !map.containsKey(cur.random)) {
                map.put(cur.random, new Node(cur.random.val));
            }
            map.get(cur).random = map.get(cur.random);
            map.get(cur).next = map.get(cur.next);
            cur = cur.next;
        }
        return map.get(head);
    }
}

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        HashMap<Node, Node> map = new HashMap<>();
        Node current = head;

        // Pass 1 -> create copy nodes
        while (current != null) {
            map.put(current, new Node(current.val));
            current = current.next;
        }

        current = head;
        // Pass 2 -> connect next and random
        while (current != null) {
            Node copyNode = map.get(current);
            copyNode.next = map.get(current.next);
            copyNode.random = map.get(current.random);
            current = current.next;
        }
        return map.get(head);
    }
}

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

import java.util.*;

class Solution {

    Node[] checked;
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        checked = new Node[101];

        return makeGraph(node);
    }

    Node makeGraph(Node node) {
        if (checked[node.val] != null) {
            return checked[node.val];
        }

        Node result = new Node(node.val, new ArrayList<Node>());
        Node temp;
        checked[node.val] = result;

        for (int i = 0; i < node.neighbors.size(); ++i) {
            temp = node.neighbors.get(i);
            result.neighbors.add(makeGraph(temp));
        }

        return result;
    }
}

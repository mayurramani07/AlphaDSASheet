package BINARYTREE1;
import java.util.*;
public class AmountOfBinaryTreeToBeInfected {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public Node BuildTree(int[] nodes) {
            idx++;

            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }
    }
    public static int amountOfTime(Node root, int start) {
        if(root == null) {
            return 0;
        }
        Map<Node,Node> Parentmap = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node startNode = null;

        while(!queue.isEmpty()) {
            Node node = queue.poll();
            if(node.data == start) {
                startNode = node;
            }

            if(node.left == null) {
                Parentmap.put(node.left, node);
                queue.add(node.left);
            }

            if(node.right == null) {
                Parentmap.put(node.right, node);
                queue.add(node.right);
            }
        }
        Set<Node> visited = new HashSet<>();
        queue.clear();
        queue.add(startNode);
        visited.add(startNode);
        int minutes = 0;

        while(!queue.isEmpty()) {
            int size = queue.size();
            boolean infectedThisMinute = false;

            for(int i=0 ; i<size ; i++) {
                Node node = queue.poll();

                if (node.left != null && !visited.contains(node.left)) {
                    visited.add(node.left);
                    queue.add(node.left);
                    infectedThisMinute = true;
                }
                if (node.right != null && !visited.contains(node.right)) {
                    visited.add(node.right);
                    queue.add(node.right);
                    infectedThisMinute = true;
                }
                if (Parentmap.containsKey(node) && !visited.contains(Parentmap.get(node))) {
                    visited.add(Parentmap.get(node));
                    queue.add(Parentmap.get(node));
                    infectedThisMinute = true;
                }
            }

            if (infectedThisMinute) minutes++;
        }

        return minutes;
    }
}


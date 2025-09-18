package BINARYTREE1;
import java.util.*;
public class LevelOrderTraversal {
    static class Node{
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

        public static Node BuildTree(int[] nodes) {
            idx++;

            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }
    }
    public static void LevelOrder(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {

        }
    }
}

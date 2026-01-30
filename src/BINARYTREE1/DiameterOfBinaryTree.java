package BINARYTREE1;
import java.util.*;
public class DiameterOfBinaryTree {
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
    static class BinaryTree {
        static int idx = -1;

        public Node BuildTree(int[] nodes) {
            idx++;

            if(idx == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }
    }
    public static int DiameterOfBT(Node root) {
        diameter = 0;
        height(root);
        return diameter;
    }
    static int diameter = 0;
    public static int height(Node root) {
        if(root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        diameter = Math.max(diameter, lh+rh);
        return Math.max(lh , rh) + 1;
    }
}

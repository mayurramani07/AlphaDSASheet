package NEETCODE150;
import java.util.*;
public class BalancedBinaryTree {
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

        public static Node BuildTree(int[] nodes) {
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
    public static boolean isBalanced(Node root) {
        int height = getHeight(root);
        if(height == -1) {
            return false;
        }else {
            return true;
        }
    }
    public static int getHeight(Node root) {
        if(root == null) {
            return 0;
        }
        int lh = getHeight(root.left);
        int rh = getHeight(root.right);

        if(lh == -1 || rh == -1) {
            return -1;
        }
        if(Math.abs(lh - rh) > 1) {
            return -1;
        }
        return 1 + Math.max(lh, rh);
    }
}

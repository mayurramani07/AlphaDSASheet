package NEETCODE150;
import java.util.*;
public class SameBinaryTree {
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
    public static boolean isSameTree(Node p, Node q) {
        if(p == null && q == null) {
            return true;
        }
        if(p == null || q == null) {
            return false;
        }
        if(p.data != q.data) {
            return false;
        }
        return isSameTree(p.left, q.left) || isSameTree(p.right, q.right);
    }
}
//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(n)
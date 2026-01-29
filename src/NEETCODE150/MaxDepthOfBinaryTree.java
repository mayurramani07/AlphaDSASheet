package NEETCODE150;
import java.util.*;
public class MaxDepthOfBinaryTree {
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
    public static int DepthOfBT(Node root) {
        int max = 0;
        if(root == null) {
            return 0;
        }

        int lh = DepthOfBT(root.left);
        int rh = DepthOfBT(root.right);

        max = Math.max(lh, rh) + 1;

        return max;
    }
}
//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(1)
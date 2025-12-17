package GRAPHREVISION;
import java.util.*;
public class PathSum {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data, Node right, Node left) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    public static boolean hasPathSum(Node root, int targetSum) {
        if(root == null) {
            return false;
        }
        if(root.left == null && root.right == null) {
            return targetSum == root.data;
        }
        return hasPathSum(root.left, targetSum - root.data) || hasPathSum(root.right, targetSum- root.data);
    }
}

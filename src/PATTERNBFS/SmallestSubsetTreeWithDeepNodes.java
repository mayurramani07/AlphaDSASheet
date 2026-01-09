package PATTERNBFS;
import java.util.*;
public class SmallestSubsetTreeWithDeepNodes {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node SmallestSubtree(Node root) {
        if(root == null) {
            return null;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(leftHeight == rightHeight) {
            return root;
        }else if(leftHeight > rightHeight) {
            return SmallestSubtree(root.left);
        } else {
            return SmallestSubtree(root.left);
        }
    }
    public static int height(Node root) {
        if(root == null) {
            return 0;
        }
        int maxLeft = height(root.left);
        int maxRight = height(root.right);

        return 1 + Math.max(maxLeft, maxRight);
    }
}

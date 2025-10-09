package PATTERNBFS;
import java.util.*;
public class BinaryTreeLevelOrderTraversal {
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
    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null) {
            return result;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int levelsize = q.size();
            List<Integer> currentLevel = new ArrayList<>();

            for(int i=0 ; i<levelsize ; i++) {
                Node currNode = q.remove();
                currentLevel.add(currNode.data);

                if(currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
}

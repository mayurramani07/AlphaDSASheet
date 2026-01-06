package PATTERNBFS;
import java.util.*;
public class MaxLevelSumOfBinaryTree {
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
    public static int MaxLevelSum(Node root) {
        int ans = 0;
        int level = 1;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int count = queue.size();
            sum = 0;
            for(int i=0; i<count; i++) {
                Node node = queue.poll();
                sum += node.data;
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
            if(max < sum) {
                max = sum;
                ans = level;
            }
            level++;
        }
        return ans;
    }
}

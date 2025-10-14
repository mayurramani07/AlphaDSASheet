package PATTERNDFS;
import java.util.*;
public class CloneGraph {
    static class Node {
        int data;
        ArrayList<Node> neighbors;

        Node(int val) {
            this.data = data;
            this.neighbors = new ArrayList<>();
        }
    }
    public static Node cloned(Node node) {
        if(node == null) {
            return null;
        }
        HashMap<Node,Node> visited = new HashMap<>();
        dfs(node, visited);
        return visited.get(node);
    }
    public static void dfs(Node curr, Map<Node,Node> visited) {
        Node clone = new Node(curr.data);
        visited.put(curr, clone);
        for(Node neighbor : curr.neighbors) {
            if(!visited.containsKey(neighbor)) {
                dfs(neighbor, visited);
            }
            visited.get(curr).neighbors.add(visited.get(neighbor));
        }
    }
}

package GRAPHREVISION;
import java.util.*;
public class DFS {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0 ; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
    }
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean[] vis) {
        System.out.print(curr);
        vis[curr] = true;

        for(int i=0 ; i < graph[curr].size() ; i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }
}

//TIME COMPLEXITY - O(V+E)
//SPACE COMPLEXITY - O(V)
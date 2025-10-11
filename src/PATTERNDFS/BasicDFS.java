package PATTERNDFS;
import java.util.*;
public class BasicDFS {
    static class Edge {
        int src;
        int dist;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dist = d;
            this.wt = w;
        }
    }
    public static void dfs(ArrayList<Edge>[] graph,int curr, boolean[] vis) {
        System.out.println(curr + " ");
        vis[curr] = true;

        for(int i=0 ; i<graph[curr].size() ; i++) {
            Edge e = graph[curr].get(i);

            if(!vis[e.dist]) {
                dfs(graph,e.dist,vis);
            }
        }
    }
}

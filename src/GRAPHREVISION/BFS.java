package GRAPHREVISION;
import java.util.*;
public class BFS {
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
    public static void bfs(ArrayList<Edge> graph[]) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[graph.length];

        q.add(0);
        vis[0] = true;

        while(!q.isEmpty()) {
            int curr = q.remove();
            System.out.println(curr + " ");

            for(int i=0 ; i<graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);

                if(!vis[e.dist]) {
                    q.add(e.dist);
                    vis[e.dist] = true;
                }
            }
        }
    }
}

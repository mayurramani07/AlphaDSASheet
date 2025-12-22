package GRAPHREVISION;
import java.util.*;
public class CheapestFlightWithinKStops {
    public static int findCheapestPrice(int n, int[][] flights, int src, int dest, int k) {
        List<int[]>[] graph = new ArrayList[n];
        for(int i=0 ; i<n ; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int f[] : flights) {
            graph[f[0]].add(new int[] {f[1],f[2]});
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        pq.add(new int[]{0, src, 0});

        int[] stops = new int[n];
        Arrays.fill(stops, Integer.MAX_VALUE);

        while(!pq.isEmpty()) {
            int[] curr = pq.poll();
            int cost = curr[0];
            int city = curr[1];
            int usedStops = curr[2];

            if(city == dest) {
                return cost;
            }
            if(usedStops > k) {
                continue;
            }
            if(usedStops >= stops[city]) {
                continue;
            }
            stops[city] = usedStops;

            for (int[] next : graph[city]) {
                pq.offer(new int[]{
                        cost + next[1],
                        next[0],
                        usedStops + 1
                });
            }
        }
        return -1;
    }
}
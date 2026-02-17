package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class BestReachableTower {
    public static int[] BestReachableTower(int[][] towers, int[] center, int radius) {
        int cx = center[0];
        int cy = center[1];

        int[] best = {-1,-1};
        int maxQ = -1;

        for(int[] tower : towers) {
            int x = tower[0];
            int y = tower[1];
            int q = tower[2];

            int dist = Math.abs(x - cx) + Math.abs(y - cy);

            if(dist <= radius) {
                if(q > maxQ) {
                    maxQ = q;
                    best[0] = x;
                    best[1] = y;
                } else if(q == maxQ) {
                    if (x < best[0] || (x == best[0] && y < best[1])) {
                        best[0] = x;
                        best[1] = y;
                    }
                }
            }
        }

        return best;
    }
}
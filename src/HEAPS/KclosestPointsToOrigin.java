package HEAPS;
import java.util.*;
public class KclosestPointsToOrigin {
    public static int[][] KClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> distance(b) - distance(a));
        for(int[] point : points) {
            maxHeap.offer(point);

            if(maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        int[][] result = new int[k][2];
        int i = 0;
        while(!maxHeap.isEmpty()) {
            result[i] = maxHeap.poll();
            i++;
        }
        return result;
    }
    private static int distance(int[] p) {
        return p[0] * p [0] + p[1] * p[1];
    }
}

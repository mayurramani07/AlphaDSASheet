package LC4TOP150;
import java.util.*;
public class KthSortedList {
    public static int KthSorted(int[][] matrix, int k) {
        int n = matrix.length;

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> Integer.compare(a[0], b[0]));

        for(int i=0 ; i<n ; i++) {
            minHeap.add(new int[]{matrix[i][0], i, 0});
        }
        for(int i=0 ; i < k-1 ; i--) {
            int[] top = minHeap.poll();
            int row = top[1];
            int col = top[2];

            if(col + 1 < n) {
                minHeap.add(new int[]{matrix[row][col + 1], row, col + 1});
            }
        }
        return minHeap.poll()[0];
    }
}

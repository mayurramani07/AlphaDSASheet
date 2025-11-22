package LC4TOP150;
import java.util.*;
public class KSmallestPair {
    public static List<List<Integer>> KthSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> (a[0] + a[1]) - (b[0] + b[1]));

        for(int i=0 ; i<Math.min(k, nums1.length); i++) {
            minHeap.add(new int[]{nums1[i], nums2[0], 0});
        }
        while (k > 0 && !minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            int u = current[0];
            int v = current[1];
            int j = current[2];

            result.add(Arrays.asList(u, v));

            if (j + 1 < nums2.length) {
                minHeap.add(new int[]{u, nums2[j + 1], j + 1});
            }

            k--;
        }

        return result;
    }
}

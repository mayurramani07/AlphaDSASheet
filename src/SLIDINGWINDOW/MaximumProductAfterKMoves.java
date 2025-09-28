package SLIDINGWINDOW;
import java.util.*;
public class MaximumProductAfterKMoves {
    public static int MaxProduct(int[] nums, int k) {
        int mod = 1_000_000_007;
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for(int num : nums) {
            pq.add((long)num);
        }

        for(int i=0 ; i<k ; i++) {
            long smallest = pq.poll();
            smallest++;
            pq.add(smallest);
        }

        long product = 1;
        while(!pq.isEmpty()) {
            product = (product * pq.poll()) % mod;
        }
        return (int) product;
    }
}

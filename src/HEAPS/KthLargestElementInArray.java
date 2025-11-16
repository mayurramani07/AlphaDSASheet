package HEAPS;
import java.util.*;
public class KthLargestElementInArray {
    public static int KthLargestElement(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num : nums) {
            pq.add(num);
            if(pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }
}

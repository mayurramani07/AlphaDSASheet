package LC2TOP150;
import java.util.*;
public class MinDiffInSumAfterRemoval {
    public static long MinDiff(int[] nums) {
        int n = nums.length / 3;
        int len = nums.length;

        long[] leftSum = new long[len];
        long[] rightSum = new long[len];

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;
        for(int i=0 ; i<n ; i++) {
            sum += nums[i];
            maxHeap.offer(nums[i]);

            if(maxHeap.size() > n) {
                sum -= maxHeap.poll();
            }
            leftSum[i] = sum;
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        sum = 0;
        for(int i=n-1 ; i>=0 ; i--) {
            sum += nums[i];
            minHeap.offer(nums[i]);

            if(minHeap.size() > n) {
                sum -= minHeap.size();
            }
            rightSum[i] = sum;
        }
        long ans = Long.MAX_VALUE;
        for(int i=n-1 ; i < 2 * n ; i--) {
            ans = Math.min(ans, leftSum[i] - rightSum[i+1]);
        }
        return ans;
    }
}

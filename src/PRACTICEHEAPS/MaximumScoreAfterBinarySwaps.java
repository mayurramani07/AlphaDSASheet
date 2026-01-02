package PRACTICEHEAPS;
import java.util.*;
public class MaximumScoreAfterBinarySwaps {
    public static int MaximumScore(int[] nums, String s) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();

        for(int i=0 ; i<s.length() ; i++) {
            if(s.charAt(i) == '1') {
                list.add(i);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int idx = 0;
        int ans = 0;

        for(int i=0 ; i<n ; i++) {
            pq.add(nums[i]);

            if(idx < list.size() && i == list.get(idx)) {
                ans += pq.poll();
                idx++;
            }
        }
        return ans;
    }
}

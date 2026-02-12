package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class CountSubarrayWithLessThanEqualToK {
    public static long CountSubarray(int[] nums, int k) {
        int n = nums.length;
        long ans = 0;
        int i = 0;

        TreeSet<Integer> set = new TreeSet<>((a,b) -> {
           if(nums[a] == nums[b]) {
               return a - b;
           }
           return Integer.compare(nums[a], nums[b]);
        });

        for(int j=0; j<n; j++) {
            set.add(j);

            while(!set.isEmpty()) {
                long min = nums[set.first()];
                long max = nums[set.last()];
                long size = j - i + 1;

                if ((max - min) * size <= k) break;

                set.remove(i);
                i++;
            }
            ans += (j-i+1);
        }
        return ans;
    }
}

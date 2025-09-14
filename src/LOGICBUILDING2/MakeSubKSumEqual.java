package LOGICBUILDING2;
import java.util.*;
public class MakeSubKSumEqual {
    public static long makeSubKsumEqual(int[] nums, int k) {
        int n = nums.length;
        int g = gcd(n,k);
        long operations = 0;

        for(int start = 0; start < g; start++) {
            List<Integer> group = new ArrayList<>();
            for(int i= start ; i<n ; i++) {
                group.add(nums[i]);
            }
            Collections.sort(group);
            int median = group.get(group.size() / 2);

            for(int num : group) {
                operations += Math.abs((long) num - median);
            }
        }
        return operations;
    }
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a%b);
    }
}

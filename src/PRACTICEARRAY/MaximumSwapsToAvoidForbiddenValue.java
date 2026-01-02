package PRACTICEARRAY;
import java.util.*;
public class MaximumSwapsToAvoidForbiddenValue {
    public static int MaximumSwaps(int[] nums, int[] forbidden) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : forbidden) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int val : map.values()) {
            if(val > n) {
                return -1;
            }
        }
        HashMap<Integer,Integer> map2 = new HashMap<>();
        int total = 0;

        for(int i=0 ; i<n ; i++) {
            if(nums[i] == forbidden[i]) {
                map2.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
                total++;
            }
        }
        if(total == 0) {
            return 0;
        }
        int maxSwaps = 0;
        for(int num : map.values()) {
            maxSwaps = Math.max(maxSwaps, num);
        }
        return Math.max(maxSwaps, (total+1)/ 2);
    }
}

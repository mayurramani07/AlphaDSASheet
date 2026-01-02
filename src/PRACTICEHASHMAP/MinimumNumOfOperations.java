package PRACTICEHASHMAP;
import java.util.*;
public class MinimumNumOfOperations {
    public static int MinNumOfOpe(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int idx = -1;
        for(int i=0 ; i<n ; i++) {
            if(map.containsKey(nums[i]) && map.get(nums[i]) >= 2) {
                map.put(nums[i], map.get(nums[i]) - 1);
                if(map.get(nums[i]) == 0) {
                    map.remove(nums[i]);
                }
                idx = i;
            }
        }
        if(idx == -1) {
            return 0;
        }
        int count = idx + 1;
        int mod = count % 3;

        if(mod == 0) {
            return count / 3;
        }
        return (count / 3) + 1;
    }
}
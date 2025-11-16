package HEAPS;
import java.util.*;
public class TopKFrequentElementOptimized {
    public static int[] TopKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] bucket = new List[nums.length + 1];
        for(int num : map.keySet()) {
            int freq = map.get(num);
            if(bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(num);
        }
        int[] result = new int[k];
        int idx = 0;

        for(int i=nums.length; i>=0 && idx < k ; i--) {
            if(bucket[i] != null) {
                for(int num : bucket[i]) {
                    result[idx] = num;
                    idx++;
                    if(idx == k) {
                        break;
                    }
                }
            }
        }
        return result;
    }
}

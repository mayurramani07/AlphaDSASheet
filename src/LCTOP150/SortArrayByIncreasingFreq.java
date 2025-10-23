package LCTOP150;
import java.util.*;
public class SortArrayByIncreasingFreq {
    public static int[] SortArray(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new ArrayList[n + 1];
        for(int num : map.keySet()) {
            int freq = map.get(num);
            if(bucket[freq] != null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(num);
        }
        List<Integer> list = new ArrayList<>();
        for(int f=1 ; f<=n ; f++) {
            if(bucket[f] != null) {
                Collections.sort(bucket[f], Collections.reverseOrder());

                for(int num : bucket[f]) {
                    for(int i=0 ; i<f ; i++) {
                        list.add(num);
                    }
                }
            }
        }
        int[] result1 = new int[list.size()];
        for(int i=0 ; i<list.size() ; i++) {
            result1[i] = list.get(i);
        }
        return result1;
    }
}

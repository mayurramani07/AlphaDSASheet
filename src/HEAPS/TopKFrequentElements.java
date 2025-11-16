package HEAPS;
import java.util.*;
public class TopKFrequentElements {
    public static int[] TopKFreq(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b) -> map.get(b) - map.get(a));

        int[] result = new int[k];
        for(int i=0 ; i<k ; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}

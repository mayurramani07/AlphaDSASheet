package LCTOP150;
import java.util.*;
public class TopKFrequentElements {
    public static int[] TopKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<Integer>(map.keySet());
        Collections.sort(list, (a,b) -> map.get(b) - map.get(a));

        int[] result = new int[k];
        for(int i=0 ; i<k ; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
